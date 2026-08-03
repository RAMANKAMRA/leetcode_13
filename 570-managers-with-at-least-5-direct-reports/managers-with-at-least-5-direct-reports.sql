-- SELECT name
-- FROM Employee
-- WHERE id IN (
--     SELECT managerId
--     FROM Employee
--     GROUP  BY managerId
   
--     HAVING COUNT(*) >= 5
    
-- );

select name from employee 
where id in(
    select managerId
    from employee
    group by managerId
    having count(*)>=5
);