-- 코드를 입력하세요
SELECT user_id, product_id
from online_sale
group by product_id, user_id
having count(*)>1
order by user_id asc, product_id desc


-- 2	21
-- 2	26
-- 2	30
-- 4	27
-- 5	12
-- 7	1
-- 7	5
-- 12	7
-- 13	27
-- 14	18
-- 15	12
-- 15	12