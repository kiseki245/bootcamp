-- comment
-- database -> table -> row x column
-- Query: create database db_bc2405
use db_bc2405p;

-- Table name is per database
create table customers (
	id int,
	name varchar(50),
	email varchar(50)
);

-- insert into table_name
insert into customers (id, name, email) values (1, 'John Lau', 'Johnlau@gmail.com');
insert into customers (id, name, email) values (2, 'Peter Wong', 'peter@gmail.com');
insert into customers (id, name, email) values (3, 'Hello', 'Hello@gmail.com');
insert into customers (id, name, email) values (4, 'World', 'World@gmail.com');

-- * means all columns
-- "where" means condions on column
select * from customers;

select * from customers where id = 2;
select * from customers where id = 1 or id = 2;
select * from customers where id = 1 and id = 2; -- no data matches this criteria

select name, email from customers where id = 1 or id = 2;
-- order by
select * from customers order by id; -- already asc;
select * from customers order by id desc;

select * from customers where id = 1 or id = 3 order by id desc;


create table students (
	id integer, -- int
    name varchar (50),
    weight numeric (5,2), -- 2dp
    height numeric (5,2)
);
insert into students (id, name, weight, height) values (1, "John", 92.3, 163.7);
insert into students (id, name, weight, height) values (2, "Peter", 55.2, 180.9);
insert into students (id, name, weight, height) values (3, "Eddie", 168, 71);
insert into students (id, name, weight, height) values (4, "Error", 0.00, 0);
select * from students;
select * from students where weight < 100 order by weight desc;

-- create table -> datetime, integer, numeric, varchar

-- You can skip some column(s) when you excute insert statement
insert into students (id, name, weight) values (5, "John", 65.3);
select * from students;

-- If you don't specify the columns name, then you have to put all column values
insert into students values (6, "Benny Wong", null, 170);

-- DML Insert row, update column, delete row, truncate table 
-- DDL Create/drop table, add/drop columns, modify column

-- Supported operator + - * / %
select id, name, weight, height, weight + height from students; -- null + any value will be null 

select id, name, s.weight + s.height as DEF from students s; -- Header of weight + height is "DEF"
-- >, <, >=, <=, != or <>
select id, name, s.weight + s.height as DEF from students s where s.weight > 65.5 order by id;

select * from students where id <> 4 and id <> 1;
-- not in
select * from students where id not in (1, 4);
select * from students where id in (1, 4);

select * from students where name = 'John';
select * from students where name like '%John%'; -- Any name with prefix (0 or more charactor) and surfix (0 or more charactor)
select * from students where name not like '1234';
-- Null check, filter:
select * from students where height is not null or weight is not null; -- find the not null
select * from students where height is null or weight is null; -- find the null

-- Function 
select char_length(name) from students;

select length(name) from students;
-- char_length presenting how many character 
-- length presenting how many space of the value needed

select upper(s.name), lower(s.name), substring(s.name, 1, 3), trim(s.name), replace(s.name, '1234', 'Chan') from students s;

-- Java indexOf(), DB: instr()
-- if not found, return 0
select instr(s.name, 'dd'), s.* from students s;


create table orders (
	id integer,
    total_amount numeric(10, 2),
    customer_id int
);

select * from orders; -- List<orders> 
insert into orders (id, total_amount, customer_id) values (1, 2095.13, 2);
insert into orders values (2, 2011.14, 1);
insert into orders values (3, 10000.34, 1);
insert into orders values (4, 99.9, 3);

-- sum()
-- 3ms without network consideration
select sum(o.total_amount) from orders o; -- 14206.51

select avg(o.total_amount) from orders o where customer_id = 1;
select min(o.total_amount), max(o.total_amount) from orders o where customer_id = 1;

select o.*, '1' as number, 'hello' as string from orders o;

-- count(), below result must be 1 row
select min(o.total_amount), max(o.total_amount), count(*) from orders o where customer_id = 1; 

-- o.total_amount -> NOT an aggregate result
-- select o.total_amount, sum(o.total_amount) from orders o;

-- group by -> select "group key" and agg function

select * from orders;
-- 1	2095.13	2
-- 2	2011.14	1
-- 3	10000.34	1
-- 4	99.90	3

-- o.* -> group information or individual data informaion?
select o.customer_id, sum(o.total_amount) from orders o group by o.customer_id order by o.customer_id;

-- group by "Unique Key" -> meanningless
select o.id, sum(o.total_amount) from orders o group by o.id;

-- having + grou[ by
insert into orders values (5, 5000, 2);
select o.customer_id, avg(o.total_amount) 
from orders o where o.customer_id in (1, 3) -- first filter before group by (5 rows -> 4 rows)
group by o.customer_id -- result 2 rows x 2 columns
having avg(o.total_amount) > 100; -- second filter after group by (result: 1 row x 2 column)

