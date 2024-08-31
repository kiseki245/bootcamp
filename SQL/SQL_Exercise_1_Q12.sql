DROP DATABASE BOOTCAMP_EXERCISE1_Q12;
CREATE DATABASE BOOTCAMP_EXERCISE1_Q12;
USE BOOTCAMP_EXERCISE1_Q12;

CREATE TABLE regions (
	region_id int PRIMARY KEY,
	region_name varchar(25)
);

CREATE TABLE countries (
	country_id char(2) PRIMARY KEY,
	country_name varchar(40),
    region_id int,
    foreign key (region_id) references regions(region_id)
);

CREATE TABLE locations (
	location_id int PRIMARY KEY,
	street_address varchar(25),
    postal_code varchar(12),
    city varchar(30),
    state_province varchar(12),
    country_id char(2),
    foreign key (country_id) references countries(country_id)
);

CREATE TABLE departments (
	department_id int PRIMARY KEY,
    department_name varchar(30),
    manager_id int,
    location_id int,
    foreign key (location_id) references locations (location_id)
);
CREATE TABLE jobs (
	job_id varchar(10) PRIMARY KEY,
    job_title varchar(35)
);
CREATE TABLE job_salary_range (
	job_id varchar(10) PRIMARY KEY,
    MIN_SALARY int,
    MAX_SALARY int,
    foreign key (job_id) references jobs (job_id)
);
-- Linkage the table to jobs as one to one relationship 
CREATE TABLE job_grades(
	grade_level varchar(2) PRIMARY KEY,
    job_id varchar(10),
	LOWEST_SAL int,
    HIGHEST_SAL int,
    foreign key (job_id) references jobs (job_id)
);

CREATE TABLE employees (
	employee_id int PRIMARY KEY,
    first_name varchar(20),
    last_name varchar(25),
    email varchar(25), 
    phone_number varchar(20),
	hire_date date,
    job_id varchar(10),
    salary numeric(7,2),
    commission_pct numeric(3,2),
    manager_id int,
    department_id int,
	foreign key (job_id) references jobs (job_id),
	-- foreign key (manager_id) references departments (manager_id),
	foreign key (department_id) references departments (department_id)
);

CREATE TABLE job_history (
	employee_id int,
	start_date date,
    end_date date,
    job_id varchar(10),
    department_id int,
    PRIMARY KEY (employee_id, start_date),
    foreign key (employee_id) references employees (employee_id),
    foreign key (job_id) references jobs (job_id),
    foreign key (department_id) references departments (department_id)
);

-- Testing query 

INSERT INTO regions values (1, "Europe");
INSERT INTO regions values (2, "North America");
INSERT INTO regions values (3, "Asia");
select * from regions;

INSERT INTO countries values ("DE", "Germany", 1);
INSERT INTO countries values ("IT", "Italy", 1);
INSERT INTO countries values ("JP", "Japan", 3);
INSERT INTO countries values ("US", "United State", 2);
select * from countries;

INSERT INTO locations (location_id, street_address, postal_code, city, country_id)
values (1000, "1297 Via Cola di Rie", "989", "Roma", "IT");
INSERT INTO locations (location_id, street_address, postal_code, city, country_id)
values (1100, "93091 Calle della Te", "10934", "Venice", "IT");
INSERT INTO locations (location_id, street_address, postal_code, city, state_province)
values (1200, "2017 Shinjuku-ku", "1689", "Tokyo", "Tokyo JP");
INSERT INTO locations (location_id, street_address, postal_code, city, country_id)
values (1400, "2014 Jabberwocky Rd", "26192", "Texas", "US");
select * from locations;

INSERT INTO departments values (10, "Adminostration", 200, 1100);
INSERT INTO departments values (20, "Marketing", 201, 1200);
INSERT INTO departments values (30, "Purchasing", 202, 1400);
select * from departments;

INSERT INTO jobs values ("ST_CLERK", "St clerk project");
INSERT INTO jobs values ("MK_REP", "Mk per project");
INSERT INTO jobs values ("IT_PROG", "IT Prog project");

INSERT INTO job_salary_range values ("ST_CLERK", 5000, 10000);
INSERT INTO job_salary_range values ("MK_REP", 7000, 30000);
INSERT INTO job_salary_range values ("IT_PROG", 17000, 50000);

INSERT INTO job_grades values ('B1', 'ST_CLERK', 5000, 15000);
INSERT INTO job_grades values ('B2', 'MK_REP', 7000, 30000);
INSERT INTO job_grades values ('B3', 'IT_PROG', 17000, 50000);

INSERT INTO employees values (100, 'Steven', 'King', 'SKING', '515-1234567', '1987-06-17', 'ST_CLERK', 24000, 0, 109, 10);
INSERT INTO employees values (101, 'Neena', 'Kochhar', 'NKOCHHAR', '515-1234568', '1987-06-18', 'MK_REP', 17000, 0, 103, 20);
INSERT INTO employees values (102, 'Lex', 'De Haan', 'LDEHAAN', '515-1234569', '1987-06-19', 'IT_PROG', 17000, 0, 108, 30);
INSERT INTO employees values (103, 'Alexander', 'Hunold', 'AHUNOLD', '515-4234567', '1987-06-20', 'MK_REP', 9000, 0, 105, 10);

select * from employees;
-- Try to get the job grade of the employee 
SELECT e.employee_id, e.first_name, g.grade_level 
FROM employees e INNER JOIN job_grades g ON e.job_id = g.job_id
ORDER BY employee_id;
