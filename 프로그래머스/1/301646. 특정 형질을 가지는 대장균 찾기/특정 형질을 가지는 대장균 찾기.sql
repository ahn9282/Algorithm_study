-- 코드를 작성해주세요
select count(*) as count from(select *, SUBSTRING(reverse(conv(GENOTYPE,10,2)),1,1) as con1,
SUBSTRING(reverse(conv(GENOTYPE,10,2)),2,1) as con2,
SUBSTRING(reverse(conv(GENOTYPE,10,2)),3,1) as con3 from ECOLI_DATA) as num2 where num2.con2 !='1'
and (num2.con1='1' or num2.con3='1');