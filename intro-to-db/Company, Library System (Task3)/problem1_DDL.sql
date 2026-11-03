CREATE DATABASE COMPANY;
	USE COMPANY;
	CREATE TABLE Employee (
		SSN INT NOT NULL PRIMARY KEY,
		fname VARCHAR(225) NOT NULL,
		lname VARCHAR (225) NOT NULL,
		bdate DATE,
		address VARCHAR(400),
		gender VARCHAR(30) NOT NULL,
		salary DECIMAL(13,2) NOT NULL,
		dno INT NOT NULL
	);

	CREATE TABLE Department (
		dnumber INT NOT NULL PRIMARY KEY,
		dname VARCHAR(225) NOT NULL,
		mgr_ssn INT NOT NULL,
		mgr_start_date DATE,
		FOREIGN KEY (mgr_ssn) REFERENCES Employee(SSN)
	);

	CREATE TABLE Project (
		pnumber INT NOT NULL PRIMARY KEY,
		pname VARCHAR(225) NOT NULL,
		plocation VARCHAR(400) NOT NULL,
		dno INT NOT NULL,
		FOREIGN KEY (dno) REFERENCES Department(dnumber)
	);

	ALTER TABLE Employee ADD FOREIGN KEY (dno) REFERENCES Department (dnumber);
