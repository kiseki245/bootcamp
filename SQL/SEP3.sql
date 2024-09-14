use db_bc2405p;

select * from orders;

-- View -> selecting the actual at that moment (Not the view create moment)
CREATE VIEW order_2023 AS
SELECT * FROM orders
WHERE tran_date
BETWEEN date_format('2023-01-01', '%Y-%m-%d') AND date_format('2023-12-31', '%Y-%m-%d');
DROP VIEW order_2024;

select * from order_2023;