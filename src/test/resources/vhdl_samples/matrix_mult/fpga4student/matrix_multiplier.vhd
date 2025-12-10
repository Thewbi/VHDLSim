-- fpga4student.com FPGA projects, Verilog projects, VHDL projects
 -- VHDL project: VHDL code for matrix multiplcation
 library ieee;
 use ieee.std_logic_1164.all;
 use ieee.numeric_std.all;
 use IEEE.STD_LOGIC_UNSIGNED.ALL;


 -- Required entity declaration
 entity IntMatMulCore is
      port(
           Reset, Clock,      WriteEnable, BufferSel:      in std_logic;
           WriteAddress: in std_logic_vector (9 downto 0);
           WriteData:           in std_logic_vector (15 downto 0);
           ReadAddress:      in std_logic_vector (9 downto 0);
           ReadEnable:      in std_logic;
           ReadData:           out std_logic_vector (63 downto 0);
           DataReady:           out std_logic
      );
 end IntMatMulCore;


 architecture IntMatMulCore_arch of IntMatMulCore is

 -- fpga4student.com FPGA projects, Verilog projects, VHDL projects
 COMPONENT dpram1024x16
  PORT (
   clka : IN STD_LOGIC;
   wea : IN STD_LOGIC_VECTOR(0 DOWNTO 0);
   addra : IN STD_LOGIC_VECTOR(9 DOWNTO 0);
   dina : IN STD_LOGIC_VECTOR(15 DOWNTO 0);
   clkb : IN STD_LOGIC;
       enb : IN STD_LOGIC;
   addrb : IN STD_LOGIC_VECTOR(9 DOWNTO 0);
   doutb : OUT STD_LOGIC_VECTOR(15 DOWNTO 0)
  );
 END COMPONENT;

 end IntMatMulCore_arch;