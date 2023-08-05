1 Write an SQL statement to find the total purchase amount of all orders.
	select SUM(purchase_amount) AS "TotalSum" from orders;

2. Write an SQL statement to find the average purchase amount of all orders.
	select AVG(purchase_amount) AS "AvgPurchase" from orders;

3. Write an SQL statement to get the maximum purchase amount of all the orders.
	select MAX(purchase_amount) AS "MaxAmount" from orders;

4. Write an SQL statement to get the minimum purchase amount of all the orders.
	select MIN(purchase_amount) AS "MinAmount" from orders;

5. Write an SQL statement to find the number of salesmen listed in the table.
	select COUNT(distinct salesman_id) AS "TotalCount" from orders;

