-- 코드를 작성해주세요
select count(*) as FISH_COUNT
from(select I.ID, FISH_NAME from FISH_INFO I INNER JOIN FISH_NAME_INFO N ON I.FISH_TYPE = N.FISH_TYPE)as join_Table
WHERE FISH_NAME ='BASS' or FISH_NAME ='SNAPPER';