arbiter_sync: process(rstn_i, clk_i)
  begin
    if (rstn_i = '0') then
      state  <= S_IDLE;
      sel_q  <= '0';
      locked <= "00";
      a_req  <= '0';
      b_req  <= '0';
    elsif rising_edge(clk_i) then
      state  <= state_nxt;
      sel_q  <= sel;
      locked <= locked_nxt;
      if (state = S_BUSY_A) then -- clear request
        a_req <= '0';
      else -- buffer request
        a_req <= a_req or a_req_i.stb;
      end if;
      if (state = S_BUSY_B) then -- clear request
        b_req <= '0';
      else -- buffer request
        b_req <= b_req or b_req_i.stb;
      end if;
    end if;
  end process arbiter_sync;