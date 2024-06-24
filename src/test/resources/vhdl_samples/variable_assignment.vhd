-- It is important to note the difference between a variable assignment statement, shown
-- here, and a signal assignment statement, introduced in Chapter 1. 
--
-- A variable assignment immediately overwrites the variable with a new value. 
--
-- A signal assignment, on the other hand, schedules a new value to be applied to a signal
-- at some later time. 
--
-- VHDL uses distinct symbols: “:=” for variable assignment and “<=”
-- for signal assignment

program_counter := 0;
index := index + 1;

greater := maximum(A, B);
