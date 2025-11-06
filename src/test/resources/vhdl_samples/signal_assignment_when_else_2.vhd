  x_req_o.data  <= b_req_i.data  when A_READ_ONLY else
                   a_req_i.data  when B_READ_ONLY else
                   a_req_i.data  when (sel = '0') else b_req_i.data;