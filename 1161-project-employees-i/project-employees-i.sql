# Write your MySQL query statement below
SELECT p.project_id ,
ROUND(AVG(e.experience_years),2) AS average_years
FROM project p
Left join  employee e
ON p.employee_id=e.employee_id
Group by p.project_id;
