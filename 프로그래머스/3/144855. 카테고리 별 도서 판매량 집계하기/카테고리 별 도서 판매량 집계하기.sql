
# SELECT  b.CATEGORY  , count(s.sales) as TOTAL_SALES FROM BOOK b 
# inner join (SELECT * FROM BOOK_SALES WHERE date_format(SALES_DATe,'%Y-%m') = '2022-01') s
# on b.book_id = s.book_id group by b.category order by b.category;



SELECT b.CATEGORY, sum(s.sales) as TOTAL_SALES FROM BOOK b 
inner join BOOK_SALES s on b.book_id = s.book_id 
where  date_format(s.SALES_DATe,'%Y-%m') = '2022-01'
group by b.category 
order by b.CATEGORY
