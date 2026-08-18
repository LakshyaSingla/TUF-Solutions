SELECT 
    u.user_id,
    u.name,
    c.category_id,
    c.category 
FROM Users AS u 
CROSS JOIN Categories AS c;