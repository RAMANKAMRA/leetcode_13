# Write your MySQL query statement below

select ROUND(SUM(if(order_date=customer_pref_delivery_date,1,0))*100/COUNT(DISTINCT customer_id),2)as immediate_percentage
from delivery
where(customer_id,order_date)IN(
Select customer_id,MIN(order_date) as first_date
from delivery
group by customer_id
)
