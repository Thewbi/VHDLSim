iRowA <= iCount srl 5;

iReadAddrA <= (iRowA sll 5)+CountAT;

      iReadAddrB <= (CountBT sll 5)+ iColB(9 downto 0);


      report "Writing A";