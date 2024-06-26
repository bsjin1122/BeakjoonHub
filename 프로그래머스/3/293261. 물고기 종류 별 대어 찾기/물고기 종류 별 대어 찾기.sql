-- 코드를 작성해주세요
SELECT ID, FISH_NAME, F.LENGTH AS LENGTH
FROM FISH_INFO F
JOIN FISH_NAME_INFO N
ON F.FISH_TYPE = N.FISH_TYPE
WHERE F.FISH_TYPE IN
(
    SELECT FISH_TYPE
    FROM FISH_INFO
    GROUP BY FISH_TYPE
    HAVING LENGTH = MAX(LENGTH)
)
ORDER BY ID;