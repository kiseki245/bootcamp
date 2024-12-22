CREATE DATABASE  BOOTCAMP_EXERCISE2;

USE bootcamp_exercise2;

CREATE TABLE worker (
	worker_id integer NOT NULL PRIMARY KEY AUTO_INCREMENT,
    first_name char(25),
    last_name char(25),
    salary numeric(15),
    joining_date datetime,
    department char(25)
);

INSERT INTO worker (first_name, last_name, salary, joining_date, department) values
('Monika', 'Arora', 100000, '21-02-20 09:00:00', 'HR'),
('Niharika', 'Verma', 80000, '21-06-11 09:00:00', 'Admin'),
('Vishal', 'Singhal', 300000, '21-02-20 09:00:00', 'HR'),
('Moham', 'Sarah', 300000, '21-03-19 09:00:00', 'Admin'),
('Amitabh', 'Singh', 500000, '21-02-20 09:00:00', 'Admin'),
('Vivek', 'Bhati', 490000, '21-06-11 09:00:00', 'Admin'),
('Vipul', 'Diwan', 200000, '21-06-11 09:00:00', 'Account'),
('Satish', 'Kumar', 75000, '21-01-20 09:00:00', 'Account'),
('Geetika', 'Chauhan', 90000, '21-04-11 09:00:00', 'Admin');

select * from worker;
CREATE TABLE bonus (
	worker_ref_id integer,
    bonus_amount numeric(10),
    bonus_date datetime,
    foreign key (worker_ref_id) references worker(worker_id)
);

-- Task 1

INSERT INTO bonus 
(worker_ref_id, bonus_amount, bonus_date) values
(6, 32000, '2021-11-02'),
(6, 20000, '2022-11-02'),
(5, 21000, '2021-11-02'),
(9, 30000, '2021-11-02'),
(8, 75000, '2021-11-02');

-- Task 2
SELECT MAX(w.salary)
FROM worker w
WHERE w.salary NOT IN (SELECT MAX(w.salary) FROM worker w);

-- Task 3
SELECT concat(w.first_name, ' ', w.last_name) AS worker_name, w.salary, w.department 
FROM worker w 
WHERE w.salary = (SELECT MAX(salary) FROM worker WHERE w.department = department);


-- Task 4
SELECT w.* from worker w
WHERE w.salary = (SELECT salary FROM worker GROUP BY salary
HAVING COUNT(salary) > 1);

-- Task 5

