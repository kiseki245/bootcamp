create database phoneStore;

use phoneStore;

create table products (
	product_code int,
    vendor varchar (30),
	model varchar (30),
    price numeric (7,2),
	isMarketExcusive boolean
);
create table network_plans (
		plan_number varchar(3),
        product_code int, -- For the bundle product, field can be null if the plan doesn't bundle with any product
        monthly_fee numeric (5,2),
        contract_period int -- month
);

insert into product values (1, "Samsung", "S24", 7000, false);
insert into product values (2, "Samsung", "S24+", 8000, false);
insert into product values (3, "Apple", "iPhone 16", 7000, false);
insert into product values (4, "Apple", "iPHone 16 Pro", 9000, false);
insert into product values (5, "HMD", "Nokia 8 Pro", 4500, true);
insert into product values (6, "Sony", "Xperia 1", 6000, false);
insert into product values (7, "Sony", "Xperia 5", 5555.55, true);

insert into network_plans value ("P01", 2, 256, 24);
insert into network_plans value ("P02", 4, 399, 24);
insert into network_plans value ("P03", 7, 245, 12);
insert into network_plans (plan_number, monthly_fee, contract_period) values ("P04", 68, 6);
insert into network_plans (plan_number, monthly_fee, contract_period) values ("P05", 124, 12);
insert into network_plans (plan_number, monthly_fee, contract_period) values ("P06", 266, 3);
insert into network_plans value ("P07", 2, 388, 24);
insert into network_plans value ("P08", 2, 488, 12);

select * from products;
select * from network_plans;

select * from products where price <= 7000;

select p.* from products p order by price;

select n.plan_number, n.contract_period from network_plans n where product_code is not null;

select sum(p.price), p.vendor from products p where vendor = "Samsung";
select sum(p.price) as SUM_WITHOUT_SAMUNG_AND_APPLE from products p where vendor <> "Apple" and vendor <> "Samsung";

select min(n.monthly_fee), max(n.monthly_fee) from network_plans n;
select count(n.plan_number) from network_plans n where contract_period >= 12;

select p.vendor, sum(p.price) from products p group by p.vendor;

select p.vendor, avg(p.price) from products p group by p.vendor;

select p.vendor, avg(p.price) from products p
group by p.vendor
having avg(p.price) > 5000; 

select p.vendor, avg(p.price) from products p
where p.vendor = 'Samsung' or p.vendor = 'Apple'
group by p.vendor;

select p.vendor, avg(p.price) from products p
where p.vendor = 'Samsung' or p.vendor = 'Apple'
group by p.vendor
having avg(p.price) >=8000;

select * from network_plans;
select count(n.product_code) from network_plans n where n.product_code = 2 having n.monthly_fee > 300;
select n.* from network_plans n  where n.product_code is null;