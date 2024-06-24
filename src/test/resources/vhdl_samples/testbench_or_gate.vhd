-- Testbench automatically generated online
-- at https://vhdl.lapinoo.net
-- Generation date : 20.6.2024 15:54:22 UTC

library ieee;
use ieee.std_logic_1164.all;

entity tb_OR_gate is
end tb_OR_gate;

architecture tb of tb_OR_gate is

    -- https://www.allaboutcircuits.com/technical-articles/how-to-use-vhdl-components-to-create-a-neat-hierarchical-design/
    -- https://vhdlwhiz.com/entity-instantiation-and-component-instantiation/
    --
    -- entites have a entity declaration and one or more entity architectures.
    -- Which architecture to use for an entity is defined by configurations.
    --
    -- other than entities and architectures, VHDL features components.
    --
    -- Since VHDL 93, there is direct entity instantiation. Before that, only components could be
    -- instantiated.
    -- 
    -- A component is based on a entity. 
    -- The connection between component and entity is done by name.
    -- The architecture to use for a component's entity cannot be directly specified (it is implicitly
    -- the last architecture that the compiler encounters when processing source code.)
    --
    -- You construct a running system either from directly instiated entities or from 
    -- component instantiations. entities or components are then interconnected to form the system.
    --
    -- A component is first declared (this will define the interface between the component and it's sourrounding)
    -- The name of the component is the name of the underlying entity. The architecture to use for that
    -- entity cannot explicitly defined. (it is implicitly
    -- the last architecture that the compiler encounters when processing source code.)
    --
    -- After declaration, the component needs to be instantiated (see between begin and end block)
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

    -- instantiation of the component
    -- 
    -- The component instance now floats around in the space and is connected to the input signals
    -- It will do work whenever the input signals change
    dut : OR_gate
    port map (A => A,
              B => B,
              Y => Y);

    -- Clock generation
    TbClock <= not TbClock after TbPeriod/2 when TbSimEnded /= '1' else '0';

    -- EDIT: Replace YOURCLOCKSIGNAL below by the name of your clock as I haven't guessed it
    -- YOURCLOCKSIGNAL <= TbClock;

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