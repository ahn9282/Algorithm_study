select 10000 * (Price div 10000) as PRICE_GROUP, count(10000 * (Price div 10000)) as PRODUCTS from product
group by 10000 * (Price div 10000) order by PRICE_GROUP