select YEAR(SALES_DATE) AS YEAR, 
		MONTH(SALES_DATE) AS MONTH,
gender,
count(distinct USER_INFO.USER_ID) as users 
from USER_INFO inner join ONLINE_SALE 
on USER_INFO.user_id = ONLINE_SALE.user_id 
WHERE GENDER IS NOT NULL
group by year, month, gender
order by year, month, gender