SELECT
e.employee_id,
e.name,
s.salary
FROM Employees AS e, Salaries AS s 
WHERE e.employee_id = s.employee_id;