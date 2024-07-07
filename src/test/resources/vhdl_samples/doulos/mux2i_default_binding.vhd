library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity AOI is
  port (A, B, C, D: in STD_LOGIC;
  F : out STD_LOGIC);
end AOI;

architecture V1 of AOI is
begin
  F <= not ((A and B) or (C and D));
end V1;

architecture V2 of AOI is
  signal AB, CD, O: STD_LOGIC;
begin
  AB <= A and B after 2 NS;
  CD <= C and D after 2 NS;
  O <= AB or CD after 2 NS;
  F <= not O after 1 NS;
end V2;

entity INV is
    port (A: in STD_LOGIC;
        F: out STD_LOGIC);
end INV;

-- TODO entitiy INV has no architecture!

entity MUX2I is
    port (SEL, A, B: in STD_LOGIC;
        F : out STD_LOGIC);
end;

architecture STRUCTURE of MUX2I is

    -- component declaraction (!= component instantiation)
    component INV
        port (A: in STD_LOGIC;
            F: out STD_LOGIC);
    end component;

    -- component declaraction (!= component instantiation)
    component AOI
        port (A, B, C, D: in STD_LOGIC;
            F : out STD_LOGIC);
    end component;

    signal SELB: STD_LOGIC;

begin

    -- component instantiation
    --
    -- There is no configuration element anywhere in this design, therefore default binding is used.
    -- Because the default binding strategy is used, the name of the component declaraction/instance
    -- dictates which entity is used for this component.
    --
    -- If you want to use another entity that matches
    -- the component, then you have to specify an explicit configuration.
    G1: INV port map (SEL, SELB);

    -- component instantiation
    --
    -- There is no configuration element anywhere in this design, therefore default binding is used.
    -- Because the default binding strategy is used, the name of the component declaraction/instance
    -- dictates which entity is used for this component.
    --
    -- If you want to use another entity that matches
    -- the component, then you have to specify an explicit configuration.
    G2: AOI port map (SEL, A, SELB, B, F);

end; 