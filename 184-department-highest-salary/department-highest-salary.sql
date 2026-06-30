# Write your MySQL query statement below
SELECT d.name as Department,
e.name as Employee,
e.salary as Salary 
From Employee e
join Department d
on e.departmentId=d.id
where e.salary=(
    Select MAX(salary)
    From Employee
    where departmentId=e.departmentId
);
