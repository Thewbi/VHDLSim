neorv32_inst: entity neorv32.neorv32_top
  generic map (
    -- Clocking --
    CLOCK_FREQUENCY  => CLOCK_FREQUENCY, -- clock frequency of clk_i in Hz
    -- Boot Configuration --
    BOOT_MODE_SELECT => 0,               -- boot via internal bootloader
    -- RISC-V CPU Extensions --
    RISCV_ISA_Zicntr => true,            -- implement base counters?
    -- Internal Instruction memory --
    IMEM_EN          => IMEM_EN,         -- implement processor-internal instruction memory
    IMEM_SIZE        => IMEM_SIZE,       -- size of processor-internal instruction memory in bytes
    -- Internal Data memory --
    DMEM_EN          => DMEM_EN,         -- implement processor-internal data memory
    DMEM_SIZE        => DMEM_SIZE,       -- size of processor-internal data memory in bytes
    -- Processor peripherals --
    IO_GPIO_NUM      => IO_GPIO_NUM,     -- number of GPIO input/output pairs (0..32)
    IO_CLINT_EN      => true,            -- implement core local interruptor (CLINT)?
    IO_UART0_EN      => true,            -- implement primary universal asynchronous receiver/transmitter (UART0)?
    IO_PWM_NUM_CH    => IO_PWM_NUM_CH    -- number of PWM channels to implement (0..12); 0 = disabled
  )
  port map (
    -- Global control --
    clk_i       => clk_i,                        -- global clock, rising edge
    rstn_i      => rstn_i,                       -- global reset, low-active, async
    -- GPIO (available if IO_GPIO_NUM > 0) --
    gpio_o      => con_gpio_o,                   -- parallel output
    gpio_i      => (others => '0'),              -- parallel input
    -- primary UART0 (available if IO_UART0_EN = true) --
    uart0_txd_o => uart_txd_o,                   -- UART0 send data
    uart0_rxd_i => uart_rxd_i,                   -- UART0 receive data
    -- PWM (available if IO_PWM_NUM_CH > 0) --
    pwm_o       => con_pwm_o                     -- pwm channels
  );