SELECT
c.customer_id,
c.name,
o.order_id,
o.amount
FROM Customers AS c 
LEFT JOIN Orders as o 
ON c.customer_id = o.customer_id;