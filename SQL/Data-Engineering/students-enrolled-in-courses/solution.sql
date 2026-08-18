SELECT
s.name,
e.course
FROM Students AS s 
NATURAL JOIN Enrollments AS e;