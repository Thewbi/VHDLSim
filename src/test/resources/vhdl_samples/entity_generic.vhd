entity neorv32_bus_switch is
  generic (
    ROUND_ROBIN_EN : boolean := false; -- enable round-robin arbitration
    A_READ_ONLY    : boolean := true; -- set if port A is read-only
    B_READ_ONLY    : boolean := false  -- set if port B is read-only
  );
  port (
    clk_i   : in  std_ulogic; -- global clock, rising edge
    rstn_i  : in  std_ulogic; -- global reset, low-active, async
    a_req_i : in  bus_req_t;  -- host port A request bus
    a_rsp_o : out bus_rsp_t;  -- host port A response bus
    b_req_i : in  bus_req_t;  -- host port B request bus
    b_rsp_o : out bus_rsp_t;  -- host port B response bus
    x_req_o : out bus_req_t;  -- device port request bus
    x_rsp_i : in  bus_rsp_t   -- device port response bus
  );
end neorv32_bus_switch;