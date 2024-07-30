-- 코드를 작성해주세요
select e.id, (select count(a.parent_id) from ECOLI_DATA a where a.parent_id = e.id)  as CHILD_COUNT from ECOLI_DATA e order by id asc;