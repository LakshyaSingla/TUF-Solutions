SELECT
e.employee_id,
COUNT(e2.employee_id) AS team_size
FROM Employee AS e
JOIN Employee AS e2
ON e.team_id = e2.team_id
GROUP BY e.employee_id
ORDER BY e.employee_id;