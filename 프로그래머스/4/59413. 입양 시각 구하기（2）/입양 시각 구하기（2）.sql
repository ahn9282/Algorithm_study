WITH RECURSIVE hours AS (
    SELECT 0 AS n
    UNION ALL
    SELECT n + 1 FROM hours WHERE n < 23
)
 
select h.n, count(a.hour) from hours h
left join  (select  CASE
        WHEN DATE_FORMAT(datetime, '%H') LIKE '0%' THEN SUBSTRING(DATE_FORMAT(datetime, '%H'), 2)
        ELSE DATE_FORMAT(datetime, '%H')
    END AS hour,
    ANIMAL_ID
from ANIMAL_OUTS) a on h.n = a.hour
group by h.n order by h.n



