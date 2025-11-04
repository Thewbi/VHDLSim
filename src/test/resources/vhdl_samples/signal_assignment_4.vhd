rdata <= bootloader_image_data_c(
            to_integer(
                unsigned(
                    bus_req_i.addr(awidth_c+1 downto 2)
                )
            )
        );