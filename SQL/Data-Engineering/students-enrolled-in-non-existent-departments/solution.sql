SELECT
s.id,
s.name
FROM Departments AS d 
RIGHT JOIN Students AS s 
ON d.id = s.department_id
WHERE d.id IS NULL;