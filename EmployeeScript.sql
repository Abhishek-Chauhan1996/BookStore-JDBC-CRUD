create database student;
use student;
create table employee (empid int AUTO_INCREMENT,empname varchar(20),emp_add varchar(256),doj date, exp int,dob date, primary key(empid));

insert into employee values(1,'abhishek','aligarh','2020-09-27',1,'1996-10-27'); 
select * from employee;




