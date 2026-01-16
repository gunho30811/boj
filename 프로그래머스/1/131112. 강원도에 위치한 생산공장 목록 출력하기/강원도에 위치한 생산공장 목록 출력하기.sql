-- 코드를 입력하세요
SELECT factory_id, factory_name, address
from food_factory
where tlno like '033-%'
order by factory_id asc