-- 1683 - Invalid tweets

select tweet_id 
from Tweets
where length(content) > 15