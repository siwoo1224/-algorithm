-- 코드를 입력하세요
SELECT PT_NAME,PT_NO,GEND_CD,AGE, 
(CASE when TLNO is null THEN 'NONE' else TLNO end) as TLNO 
from PATIENT 
where AGE <= 12 and GEND_CD = 'W'
order by age desc, PT_NAME asc;