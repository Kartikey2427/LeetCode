-- 620 - Not Boring Movies

select * from Cinema
where id % 2 != 0
and description != 'boring'
order by rating desc