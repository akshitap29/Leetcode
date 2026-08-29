# Write your MySQL query statement below
SELECT DISTINCT num AS ConsecutiveNums
FROM(
    SELECT num,
    LAG(num) OVER(ORDER BY id) AS prevnum,
    LEAD(num) OVER(ORDER BY id) AS nextnum
    FROM Logs
) AS t
WHERE num=prevnum 
AND num=nextnum;
