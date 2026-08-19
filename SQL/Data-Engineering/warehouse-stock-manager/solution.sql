SELECT
w.name AS warehouse_name,
SUM(p.Width * p.Length * p.Height * w.units) AS volume
FROM Warehouse as w 
JOIN Products as p 
ON w.product_id = p.product_id
GROUP BY w.name;