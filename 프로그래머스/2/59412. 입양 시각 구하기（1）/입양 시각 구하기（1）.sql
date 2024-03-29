SELECT HOUR(DATETIME) AS HOUR, COUNT(ANIMAL_ID) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) IN (9,10,11,12,13,14,15,16,17,18,19)
GROUP BY HOUR
ORDER BY HOUR