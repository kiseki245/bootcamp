CREATE DATABASE BOOTCAMP_EXERCISE1;
USE BOOTCAMP_EXERCISE1;

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
    job_title varchar(35),
    min_salary int,
    max_salary int
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

INSERT INTO jobs values ("ST_CLERK", "St clerk project", 10000, 50000);
INSERT INTO jobs values ("MK_REP", "Mk per project", 10000, 40000);
INSERT INTO jobs values ("IT_PROG", "IT Prog project", 16000, 70000);

INSERT INTO employees values (100, 'Steven', 'King', 'SKING', '515-1234567', '1987-06-17', 'ST_CLERK', 24000, 0, 109, 10);
INSERT INTO employees values (101, 'Neena', 'Kochhar', 'NKOCHHAR', '515-1234568', '1987-06-18', 'MK_REP', 17000, 0, 103, 20);
INSERT INTO employees values (102, 'Lex', 'De Haan', 'LDEHAAN', '515-1234569', '1987-06-19', 'IT_PROG', 17000, 0, 108, 30);
INSERT INTO employees values (103, 'Alexander', 'Hunold', 'AHUNOLD', '515-4234567', '1987-06-20', 'MK_REP', 9000, 0, 105, 10);
INSERT INTO employees values (104, 'Peter', 'Parker', 'PPARKER', '515-4234568', '2024-08-31', null, 7500, 0, 111, 30);
select * from employees;

INSERT INTO job_history values (102, '1993-01-13', '1998-07-24', 'IT_PROG', 20);
INSERT INTO job_history values (101, '1989-09-21', '1993-10-27', 'MK_REP', 10);
INSERT INTO job_history values (101, '1993-10-28', '1997-03-15', 'MK_REP', 30);
INSERT INTO job_history values (100, '1996-02-17', '1999-12-19', 'ST_CLERK', 30);
INSERT INTO job_history values (103, '1998-03-24', '1999-12-31', 'MK_REP', 20);

-- Q3 location_id, street_address, city, state_province, country_name of location
SELECT l.location_id, l.street_address, l.city, l.state_province, IFNULL(c.country_name, 'N/A')
FROM locations l LEFT JOIN countries c 
ON l.country_id = c.country_id;

-- Q4 fname, lname, department ID of all the employees 
SELECT first_name, last_name, department_id from employees;

-- Q5 fname, lname, job_id, department_id, from employee who works in japan
-- For the execise data:
SELECT e.first_name, e.last_name, e.department_id
FROM employees e INNER JOIN departments d ON e.department_id = d.department_id
INNER JOIN locations l ON d.location_id = l.location_id
WHERE l.location_id = 1200;

-- Insert a new data to table "locations" and its country_id is "JP"
INSERT INTO locations values (1500, '2019 Abeno-ku', '2222', 'Osaka', 'Osaka JP', 'JP' );
-- Insert a new department and employee
INSERT INTO departments values (40, "Accounting", 203, 1500);
INSERT INTO employees values (106, 'Obi', 'Ku', 'OKU', '515-3234568', '1995-12-11', null, 18000, 0, 123, 40);

-- New query for search the employee fomr country_id "JP" and the state_province that contains "JP":
SELECT e.first_name, e.last_name, e.department_id
FROM employees e INNER JOIN departments d ON e.department_id = d.department_id
INNER JOIN locations l ON d.location_id = l.location_id
WHERE l.country_id = 'JP' OR l.state_province like '%JP%';

-- Q6 employee id, last name, along with their manager_id and last_name
-- Create one more employee that manager ID is 103:
INSERT INTO employees values (99, 'Fion', 'Tse', 'FTSE', '515-7654321', '1987-06-17', 'ST_CLERK', 24000, 0, 103, 10);
-- Create one more employee ID that employee ID is 105
INSERT INTO employees values (105, 'Lilian', 'Chung', 'LCHUNG', '515-6642423', '1996-03-18', 'MK_REP', 55000, 0, null, 10);

SELECT * FROM employees;

SELECT e.employee_id, e.last_name, e.manager_id, m.last_name
FROM employees e INNER JOIN employees m
ON e.manager_id = m.employee_id
WHERE e.manager_id is not null;


-- Q7 first_name, last_name, hire date of the employees who was hired after employee Lex De Hann
SELECT e.first_name, e.last_name, e.hire_date
FROM employees e
WHERE e.hire_date > (SELECT hire_date FROM employees WHERE employee_id = 102);

-- Q8 Department name and number of employee of each the deparement
SELECT d.department_name, COUNT(e.department_id)
FROM departments d INNER JOIN employees e
ON d.department_id = e.department_id
GROUP BY e.department_id;

-- Q9 employee_id, job title, number of days between ending date and starting date for all jobs in department ID 30
SELECT jh.employee_id, j.job_title, (jh.end_date - jh.start_date) AS Days_for_job
FROM jobs j INNER JOIN job_history jh ON j.job_id = jh.job_id
WHERE jh.department_id = 30;

-- Q10 all department name, manger name, city and country name
-- Create the employee data those employee_id matches to the manager_id in the departments table (200, 201, 202, 203)
INSERT INTO employees values (200, 'Tim', 'Li', 'TLI', '515-1234567', '1987-06-23', 'ST_CLERK', 74000, 0, null, 10);
INSERT INTO employees values (201, 'Nana', 'Ko', 'NKO', '515-1234568', '1987-06-18', 'MK_REP', 80000, 0, null, 20);
INSERT INTO employees values (202, 'Rex', 'Chan', 'RCHAN', '515-1234569', '1987-06-19', 'IT_PROG', 94000, 0, null, 30);
INSERT INTO employees values (203, 'Rock', 'Yan', 'AHUNOLD', '515-4234567', '1987-06-20', 'MK_REP', 79000, 0, null, 40);

SELECT d.department_name, concat(e.first_name, ' ', e.last_name) AS Manager_Name, l.city, IFNULL(c.country_name, 'NA') AS country_name
FROM departments d INNER JOIN employees e ON e.employee_id = d.manager_id
INNER JOIN locations l ON d.location_id = l.location_id
LEFT JOIN countries c ON l.country_id = c.country_id;


-- Q11 display the average salary of each department
SELECT d.department_name, ROUND(AVG(e.salary), 0)
FROM departments d INNER JOIN employees e 
ON d.department_id = e.department_id
GROUP BY e.department_id;

select department_id, salary from employees order by department_id;

-- Q12 * Below query excuted on another DB
-- Split the table as below
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
-- Try to get the job grade of the employee 
SELECT e.employee_id, e.first_name, g.grade_level 
FROM employees e INNER JOIN job_grades g ON e.job_id = g.job_id
ORDER BY employee_id;