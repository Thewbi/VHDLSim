--
-- Mini-DDS zum Demonstrieren der Testbench
--
-- Direct Digital Synthesis (DDS) A technique for generating a precise 
-- analog waveform (like a sine wave) by first creating it in digital form 
-- and then converting it to an analog signal.
--

library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

entity mini_dds is
  port
    (
      -- input
      clk   : in std_logic;
      reset : in std_logic;

      -- output
      sinus     : out std_logic_vector(3 downto 0);
      saegezahn : out std_logic_vector(3 downto 0);
      rechteck  : out std_logic_vector(3 downto 0)
    );
end mini_dds;

architecture bhv of mini_dds is

  type sinus_array_t is array (0 to 15) of integer range 0 to 15;

  constant sinus_array_c : sinus_array_t :=
    (8, 10, 13, 14, 15, 14, 13, 10, 8, 5, 2, 1, 0, 1, 2, 5);

  signal index : integer range 0 to 15;

  signal phase : unsigned(3 downto 0);

  signal sinus_u     : unsigned(3 downto 0);
  signal saegezahn_u : unsigned(3 downto 0);
  signal rechteck_u  : unsigned(3 downto 0);

begin

  phase_accumulator : process (clk, reset)
  begin
    if reset = '1' then                 -- asynchroner Reset
      phase <= (others => '0');
    elsif rising_edge(clk) then
      phase <= phase + 1;
    end if;
  end process;

  index         <= to_integer(phase);

  sinus_u       <= to_unsigned(sinus_array_c(index), sinus_u'length);
  saegezahn_u   <= phase;
  rechteck_u    <= (others => phase(3));

  -- convert output values
  sinus         <= std_logic_vector(sinus_u);
  saegezahn     <= std_logic_vector(saegezahn_u);
  rechteck      <= std_logic_vector(rechteck_u);

end bhv;