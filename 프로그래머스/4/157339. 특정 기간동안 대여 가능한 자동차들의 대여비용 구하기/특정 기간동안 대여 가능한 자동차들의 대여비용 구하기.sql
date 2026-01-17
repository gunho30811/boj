-- 코드를 입력하세요

SELECT c.car_id, c.car_type,
       ROUND(c.daily_fee*30*(100-p.discount_rate)/100, 0) AS fee
FROM CAR_RENTAL_COMPANY_CAR c
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN p
  ON c.car_type = p.car_type AND p.duration_type = '30일 이상'
WHERE c.car_type IN ('SUV','세단')
  AND NOT EXISTS (
    SELECT 1 FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY h
    WHERE h.car_id = c.car_id
      AND h.start_date <= '2022-11-30'
      AND h.end_date   >= '2022-11-01'
  )
HAVING fee >= 500000 AND fee < 2000000
ORDER BY fee DESC, car_type ASC, car_id DESC;

 
 
-- 22	세단	5580000
-- 22	세단	5580000