bus_rsp_o.data <= rdata1 when (rden = '1') else 
                  rdata2 when (rden = '2') else
                  rdata3 when (rden = '3') else
                  (others => '0');