SELECT
s.name
FROM SalesPerson AS s 
WHERE sales_id NOT IN (SELECT 
o.sales_id
From Orders AS o 
WHERE o.com_id = 1 AND s.sales_id = o.sales_id);