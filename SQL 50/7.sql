-- 1068. Product Sales Analysis I

select product_name , s.year , s.price
from Sales s
left join Product p 
on p.product_id = s.product_id