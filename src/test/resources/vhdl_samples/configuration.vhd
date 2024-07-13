configuration MUX2_specified_CFG of MUX2 is -- this is a configuration (called MUX2_specified_CFG) for the entity MUX2
  for STRUCTURE -- this configuration is used for the specific entity architecture called STRUCTURE
    for G2 : AOI -- the architecture called STRUCTURE contains a component instance called G2 
                 -- and it's component declaration is AOI
      use entity work.AOI_12345(v1);  -- this defines which entity to use for G2. Here entity: work.AOI_12345
                                -- this also defines which architecture to use for the work.AOI_12345 entity. Here: use the architecture v1
    end for;
  end for;
end MUX2_specified_CFG;