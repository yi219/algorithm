-- 코드를 입력하세요
SET @rownum = -1;
SELECT @rownum := @rownum +1 AS 'HOUR',
(SELECT COUNT(DATETIME)
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) = @rownum) AS 'COUNT'
FROM ANIMAL_OUTS
WHERE @rownum < 23
ORDER BY @rownum
