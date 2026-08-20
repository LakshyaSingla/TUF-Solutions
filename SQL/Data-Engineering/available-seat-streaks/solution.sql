SELECT
c1.seat_id
FROM Cinema AS c1 
JOIN Cinema AS c2 
ON c2.free = 1 AND c2.seat_id = c1.seat_id - 1
JOIN Cinema AS c3 
ON c3.free = 1 AND c3.seat_id = c1.seat_id + 1
WHERE c1.free = 1

UNION 
SELECT
c1.seat_id
FROM Cinema AS c1 
JOIN Cinema AS c2 
ON c2.free = 1 AND c2.seat_id = c1.seat_id - 1
JOIN Cinema AS c3 
ON c3.free = 1 AND c3.seat_id = c1.seat_id -2
WHERE c1.free = 1

UNION SELECT
c1.seat_id
FROM Cinema AS c1 
JOIN Cinema AS c2 
ON c2.free = 1 AND c2.seat_id = c1.seat_id + 1
JOIN Cinema AS c3 
ON c3.free = 1 AND c3.seat_id = c1.seat_id + 2
WHERE c1.free = 1
ORDER BY seat_id;
