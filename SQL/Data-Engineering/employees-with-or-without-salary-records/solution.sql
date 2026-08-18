SELECT
e.employee_id,
e.name,
s.salary
FROM Employees AS e 
LEFT JOIN Salaries AS s 
ON e.employee_id = s.employee_id

UNION

SELECT
s.employee_id,
e.name,
s.salary
FROM Employees AS e 
RIGHT JOIN Salaries AS s 
ON e.employee_id = s.employee_id

ORDER BY employee_id;
