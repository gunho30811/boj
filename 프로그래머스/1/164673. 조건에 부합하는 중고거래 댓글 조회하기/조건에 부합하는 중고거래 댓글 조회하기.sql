-- 코드를 입력하세요
SELECT a.title, a.board_id, b.reply_id, b.writer_id, b.contents, date_format(b.created_date,'%Y-%m-%d') as CREATED_DATE
from used_goods_board a join used_goods_reply b on a.board_id =b.board_id
where a.created_date >='2022-10-01' and a.created_date < '2022-11-01'
order by CREATED_DATE asc, a.title asc