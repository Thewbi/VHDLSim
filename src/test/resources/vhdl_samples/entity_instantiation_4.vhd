-- https://surf-vhdl.com/vhdl-syntax-web-course-surf-vhdl/vhdl-generics/

-- entity RAM is
--     generic(
--         data_width : integer := 64;
--         addr_width : integer := 12;
--         Taa : time := 50; 
--         Toe : time := 40
--     ); 
--     port(
--         oeb, wrb, csb : in std_logic;
--         data : inout std_logic_vector(data_width-1 downto 0);
--         addr : in std_logic_vector(addr_width-1 downto 0)
--     );
-- end RAM;

-- instantiation 1
RAM1 : RAM 
    generic map(
        data_width => 32,
        addr_width => 20,
        Taa => 30 ns,
        Toe => 35 ns
    )
    port map(
        oeb => oeb, 
        wrb => wrb, 
        csb => csb,
        data => data,
        addr => addr 
    );

-- -- instantiation 1
-- RAM2 : RAM 
--     port map(
--         oeb => oeb, 
--         wrb => wrb, 
--         csb => csb,
--         data => data,
--         addr => addr
--     );