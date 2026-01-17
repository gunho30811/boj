-- 코드를 입력하세요

select flavor
 from(
    SELECT flavor, sum(total_order) as total_order
    from 
    (
        select shipment_id, flavor , total_order
        from first_half

        union all

        select  shipment_id, flavor , total_order
        from july
    ) t
    group by flavor
  )s
order by total_order desc
limit 3