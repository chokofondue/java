drop table student_info;

create table student_info(
	stu_num		number,
	stu_name	varchar2(15),
	stu_gender	varchar2(15),
	stu_year	number,
	stu_depart	varchar2(30)
);

select * from STUDENT_INFO;

insert into STUDENT_INFO values(20171234,'������','����',2,'�󱼰濵�а�');
insert into STUDENT_INFO values(20170012,'�����','����',2,'����Ľ�����Ʈī���');
insert into STUDENT_INFO values(20164236,'Ȳ�ص�','����',3,'���������а�');
insert into STUDENT_INFO values(20156118,'������','����',4,'�ֽ����а�');
