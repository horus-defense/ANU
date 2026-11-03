USE COMPANY;
SET FOREIGN_KEY_CHECKS = 0;
INSERT INTO Employee (`SSN`, `fname`, `lname`, `gender`, `salary`, `dno`) VALUES 
('101', 'Amr', 'Adel', 'Male', '14500', '1'),
('102', 'Adel', 'Mabrouk', 'Male', '30000', '2'),
('103', 'Ali', 'Hussein', 'Male', '50000', '3');
INSERT INTO Department (`dnumber`, `dname`, `mgr_ssn`, `mgr_start_date`) VALUES
	('1', 'GRC', '101', '2026-11-03'),
	('2', 'SOC', '102', '2026-11-05'),
	('3', 'Pen', '103', '2026-11-04');
INSERT INTO Project (`pnumber`, `pname`, `plocation`, `dno`) VALUES
	('1', 'Risk Assesment', 'test1', '1'),
	('2', 'Endpoints Security', 'test2', '2'),
	('3', 'Ports', 'test3', '3');
SET FOREIGN_KEY_CHECKS = 1;