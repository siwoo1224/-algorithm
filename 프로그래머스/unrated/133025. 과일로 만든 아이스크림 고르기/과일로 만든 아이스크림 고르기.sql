-- 코드를 입력하세요
SELECT a.FLAVOR from FIRST_HALF a
JOIN ICECREAM_INFO b ON a.FLAVOR = b.FLAVOR
where a.TOTAL_ORDER > 3000
and b.INGREDIENT_TYPE = 'fruit_based'
order by a.TOTAL_ORDER desc;
