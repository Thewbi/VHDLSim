-- state machine --
case state is

    when S_BUSY_A => -- port A access in progress
    -- ------------------------------------------------------------
    sel <= '0';
    if (locked(0) = '1') then -- port A has exclusive access until the lock is released
        stb <= a_req_i.stb; -- allow further transfer requests from port A
        if (a_req_i.lock = '0') then -- lock is released
        state_nxt <= S_IDLE;
        end if;
    elsif (x_rsp_i.ack = '1') then -- single-access: terminate when receiving ACK
        state_nxt <= S_IDLE;
    end if;

    when S_BUSY_B => -- port B access in progress
    -- ------------------------------------------------------------
    sel <= '1';
    if (locked(1) = '1') then -- port B has exclusive access until the lock is released
        stb <= b_req_i.stb; -- allow further transfer requests from port B
        if (b_req_i.lock = '0') then -- lock is released
        state_nxt <= S_IDLE;
        end if;
    elsif (x_rsp_i.ack = '1') then -- single-access: terminate when receiving ACK
        state_nxt <= S_IDLE;
    end if;

    when others => -- wait for requests
    -- ------------------------------------------------------------
    locked_nxt <= b_req_i.lock & a_req_i.lock;
    if (sel_q = '1') or (not ROUND_ROBIN_EN) then
        if (a_req_i.stb = '1') or (a_req = '1') then -- request from port A (prioritized)?
        sel       <= '0';
        stb       <= '1';
        state_nxt <= S_BUSY_A;
        elsif (b_req_i.stb = '1') or (b_req = '1') then -- request from port B?
        sel       <= '1';
        stb       <= '1';
        state_nxt <= S_BUSY_B;
        end if;
    else
        if (b_req_i.stb = '1') or (b_req = '1') then -- request from port B (prioritized)?
        sel       <= '1';
        stb       <= '1';
        state_nxt <= S_BUSY_B;
        elsif (a_req_i.stb = '1') or (a_req = '1') then -- request from port A?
        sel       <= '0';
        stb       <= '1';
        state_nxt <= S_BUSY_A;
        end if;
    end if;

end case;