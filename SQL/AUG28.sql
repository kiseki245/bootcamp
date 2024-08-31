-- Left join + group by
-- count(c.id) is different to count(c.id)
-- Step 1: Left join
-- Step 2: Where
-- Step 3: Group by
-- Step 4: order by
-- Step 5: select -> count() -> max(), ifnull()
SELECT c.id, c.name, count(o.id) number_of_orders, ifnull(max(total_amount), 0) AS max_of_order
from customers c left join orders o on c.id = o.customer_id
where o.total_amount > 100 or o.total_amount is null
group by c.id, c.name
order by c.name asc;

insert into customers values (1, "TEST", "TEST");
DELETE from customers where name = "Hello";
select * from customers;
-- Primary key
ALTER TABLE customers ADD constraint pk_customer_id PRIMARY KEY (id);

insert into customers values (5, "TEST", "TEST@gmail.com");
select * from orders;
-- ADD FK
ALTER TABLE orders ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customers(id);

insert into orders values (8, 20, 99, null); -- NOT OK, we do not have customer_id 99

insert into orders values (8, 3452, 2, null);
-- Table design PK & FK ensures data with integrity & consistency