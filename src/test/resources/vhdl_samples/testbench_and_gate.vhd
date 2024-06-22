-- Testbench automatically generated online
-- at https://vhdl.lapinoo.net
-- Generation date : 20.6.2024 15:54:22 UTC

library ieee;
use ieee.std_logic_1164.all;

entity tb_OR_gate is
end tb_OR_gate;

architecture tb of tb_OR_gate is

    component OR_gate
        port (A : in std_logic;
              B : in std_logic;
              Y : out std_logic);
    end component;

    signal A : std_logic;
    signal B : std_logic;
    signal Y : std_logic;

    constant TbPeriod : time := 1000 ns; -- EDIT Put right period here
    signal TbClock : std_logic := '0';
    signal TbSimEnded : std_logic := '0';

begin

    dut : OR_gate
    port map (A => A,
              B => B,
              Y => Y);

    -- Clock generation
    TbClock <= not TbClock after TbPeriod/2 when TbSimEnded /= '1' else '0';

    --  EDIT: Replace YOURCLOCKSIGNAL below by the name of your clock as I haven't guessed it
    --  YOURCLOCKSIGNAL <= TbClock;

    stimuli : process
    begin
        -- EDIT Adapt initialization as needed
        A <= '0';
        B <= '0';

        -- Reset generation
        --  EDIT: Replace YOURRESETSIGNAL below by the name of your reset as I haven't guessed it
        YOURRESETSIGNAL <= '1';
        wait for 100 ns;
        YOURRESETSIGNAL <= '0';
        wait for 100 ns;

        -- EDIT Add stimuli here
        wait for 100 * TbPeriod;

        -- Stop the clock and hence terminate the simulation
        TbSimEnded <= '1';
        wait;
    end process;

end tb;

-- Configuration block below is required by some simulators. Usually no need to edit.

configuration cfg_tb_OR_gate of tb_OR_gate is
    for tb
    end for;
end cfg_tb_OR_gate;