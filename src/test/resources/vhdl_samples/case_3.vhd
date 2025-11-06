case opcode is
    when opcode_store_c => -- S-immediate
        immediate <= replicate_f(exe_engine.ir(31), 21) & exe_engine.ir(30 downto 25) & exe_engine.ir(11 downto 7);
    when opcode_branch_c => -- B-immediate
        immediate <= replicate_f(exe_engine.ir(31), 20) & exe_engine.ir(7) & exe_engine.ir(30 downto 25) & exe_engine.ir(11 downto 8) & '0';
    when opcode_lui_c | opcode_auipc_c => -- U-immediate
        immediate <= exe_engine.ir(31 downto 12) & x"000";
    when opcode_jal_c => -- J-immediate
        immediate <= replicate_f(exe_engine.ir(31), 12) & exe_engine.ir(19 downto 12) & exe_engine.ir(20) & exe_engine.ir(30 downto 21) & '0';
    when opcode_amo_c => -- atomic memory access
        immediate <= (others => '0');
    when others => -- I-immediate
        immediate <= replicate_f(exe_engine.ir(31), 21) & exe_engine.ir(30 downto 21) & exe_engine.ir(20);
end case;