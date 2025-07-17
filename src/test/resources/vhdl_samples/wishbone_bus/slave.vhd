library ieee;
use ieee.std_logic_1164.all;
entity WBOPRT08 is
port(
-- WISHBONE SLAVE interface:
ACK_O: out std_logic;
CLK_I: in std_logic;
DAT_I: in std_logic_vector( 7 downto 0 );
DAT_O: out std_logic_vector( 7 downto 0 );
RST_I: in std_logic;
STB_I: in std_logic;
WE_I: in std_logic;
-- Output port (non-WISHBONE signals):
PRT_O: out std_logic_vector( 7 downto 0 )
 );
end entity WBOPRT08;
architecture WBOPRT081 of WBOPRT08 is
 signal Q: std_logic_vector( 7 downto 0 );
begin
 REG: process( CLK_I )
 begin
 if( rising_edge( CLK_I ) ) then
 if( RST_I = '1' ) then
 Q <= B"00000000";
 elsif( (STB_I and WE_I) = '1' ) then
 Q <= DAT_I( 7 downto 0 );
 else
 Q <= Q;
 end if;
 end if;
 end process REG;
 ACK_O <= STB_I;
 DAT_O <= Q;
 PRT_O <= Q;
end architecture WBOPRT081;