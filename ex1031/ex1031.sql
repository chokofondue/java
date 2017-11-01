select * from student;
select * from student_score;

drop table student_score;

create table student_score(
	num number,
	name varchar(10),
	stu_number varchar(20),
	stu_majar varchar(50),
	java_score number,
	iot_score number,
	android_score number,
	db_score number,
	all_score number,
	avg_score number,
	day date
);
insert into student_score values(num.nextval,'test4','20171031','web',80,90,80,70,100,100,sysdate);

select * from student_score;

create sequence num
start with 1
increment by 1;
drop table student_score;

drop sequence num;

