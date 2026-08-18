SELECT
e.name
FROM Employees AS e 
JOIN Employees AS e2
ON e.manager_id = e2.employee_id
AND e.salary > e2.salary;