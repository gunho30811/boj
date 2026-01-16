-- 코드를 입력하세요

-- 서울, 리뷰 평균 점수 , 소수 세번째 자리 반올림, 결과 평균 기준 내림차순 정렬, 

SELECT a.rest_id, a.rest_name, a.food_type, a.favorites, a.address , round(avg(b.review_score),2) as score
from rest_info a join rest_review b on a.rest_id = b.rest_id
where a.address like ('서울%')
group by a.rest_id
order by score desc, a.favorites desc