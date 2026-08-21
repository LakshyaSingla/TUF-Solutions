SELECT
name
FROM Employee 
WHERE Id IN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(*) >= 5
)