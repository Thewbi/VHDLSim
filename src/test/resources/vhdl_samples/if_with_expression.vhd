if actual_temp < desired_temp - 2 then
    heater_on <= true;
elsif actual_temp > desired_temp + 2 then
    heater_on <= false;
end if;