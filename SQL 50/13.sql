-- 570. Managers with at Least 5 Direct Reports

select e1.name 
from employee e1
inner join employee e2
on e1.id = e2.managerid 
group by e2.managerid
having count(e2.managerid) >= 5