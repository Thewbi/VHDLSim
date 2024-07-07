library IEEE; use IEEE.STD_LOGIC_1164.all;

entity mips is -- single cycle MIPS processor
    port (clk: in STD_LOGIC;
        reset: in STD_LOGIC;
        pc: out STD_LOGIC_VECTOR (31 downto 0);
        instr: in STD_LOGIC_VECTOR (31 downto 0);
        memwrite: out STD_LOGIC;
        aluout: out STD_LOGIC_VECTOR (31 downto 0); 
        writedata: out STD_LOGIC_VECTOR (31 downto 0);
        readdata: in STD_LOGIC_VECTOR (31 downto 0));
    end;

architecture struct of mips is
    
    component controller
    port (op: in STD_LOGIC_VECTOR (5 downto 0); 
        funct: in STD_LOGIC_VECTOR (5 downto 0);
        zero: in STD_LOGIC;
        memtoreg: out STD_LOGIC;
        memwrite: out STD_LOGIC;
        pcsrc: out STD_LOGIC;
        alusrc: out STD_LOGIC;
        regdst: out STD_LOGIC;
        regwrite: out STD_LOGIC;
        jump: out STD_LOGIC;
        alucontrol: out STD_LOGIC_VECTOR (2 downto 0));
    end component;

    component datapath
    port (clk: in STD_LOGIC;
        reset: in STD_LOGIC;
        memtoreg: in STD_LOGIC;
        pcsrc: in STD_LOGIC;
        alusrc: in STD_LOGIC; 
        regdst: in STD_LOGIC;
        regwrite: in STD_LOGIC; 
        jump: in STD_LOGIC;
        alucontrol: in STD_LOGIC_VECTOR (2 downto 0);
        zero: out STD_LOGIC;
        pc: buffer STD_LOGIC_VECTOR (31 downto 0);
        instr: in STD_LOGIC_VECTOR (31 downto 0);
        aluout: buffer STD_LOGIC_VECTOR (31 downto 0);
        writedata: buffer STD_LOGIC_VECTOR (31 downto 0);
        readdata: in STD_LOGIC_VECTOR (31 downto 0));
    end component;

    signal memtoreg, alusrc, regdst, regwrite, jump, pcsrc: STD_LOGIC;
    signal zero: STD_LOGIC;
    signal alucontrol: STD_LOGIC_VECTOR (2 downto 0);

begin

    cont: controller 
        port map (
            op => instr (31 downto 26), 
            funct => instr (5 downto 0), 
            zero, 
            memtoreg,
            memwrite, 
            pcsrc, 
            alusrc, 
            regdst,
            regwrite, 
            jump, 
            alucontrol);

    dp: datapath 
        port map (
            clk, 
            reset, 
            memtoreg, 
            pcsrc, 
            alusrc,
            regdst,
            regwrite, 
            jump, 
            alucontrol,
            zero, 
            pc, 
            instr, 
            aluout, 
            writedata,
            readdata);
        
end;