if (or_reduce_f(trap_ctrl.exc_buf(exc_ialign_c downto exc_iaccess_c)) = '1') then
    a <= b;
end if;