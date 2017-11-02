drop table student_info;

create table student_info(
	stu_num		number,
	stu_name	varchar2(15),
	stu_gender	varchar2(15),
	stu_year	number,
	stu_depart	varchar2(30)
);

select * from STUDENT_INFO;

insert into STUDENT_INFO values(20171234,'차현석','남자',2,'얼굴경영학과');
insert into STUDENT_INFO values(20170012,'김미희','여자',2,'망고식스디저트카페과');
insert into STUDENT_INFO values(20164236,'황해도','남자',3,'경배와찬양학과');
insert into STUDENT_INFO values(20156118,'이은비','여자',4,'애슐리학과');
