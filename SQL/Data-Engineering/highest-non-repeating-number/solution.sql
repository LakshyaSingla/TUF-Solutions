SELECT MAX(num) AS num
FROM
(SELECT 
num
FROM 
MyNumbers
GROUP by num
HAVING COUNT(num) = 1) AS t
