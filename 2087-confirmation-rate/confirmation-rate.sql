# Write your MySQL query statement below
SELECT s.user_id ,ROUND(IFNULL(AVG(c.action='confirmed'),0),2) AS confirmation_rate
FROM Signups s
left join ConfirmationS c
ON s.user_id=c.user_id
group by s.user_id; 
