-- 577. Employee Bonus

select e.name , b.bonus
from Employee e
left join bonus b
on e.empId = b.empId
where bonus < 1000
or b.bonus is null 