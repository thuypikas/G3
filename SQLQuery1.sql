create database sinhvien
go
use sinhvien
go
create table tblEmp
(
userID int,
name nvarchar(20),
constraint tblEmp primary key (userID)
)
go
create table tblEmpAddr
(
addr_ID int,
addName nvarchar(20),
phoneNo nvarchar(20),
userID int,
constraint tblEmpAddr primary key (addr_ID),
constraint tblEmpAddr_tblEmp foreign key (userID) references tblEmpAddr(addr_ID) 



)
go
insert into tblEmp values(1,'thuy')
insert into tblEmpAddr values (1,'thuy','0987',1)