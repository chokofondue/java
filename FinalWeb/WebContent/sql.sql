1. 회원가입한 정보를 저장할 수 있는 'web_member'테이블을 만드시오.
   컬럼명 : email / pw / tel / address

create table web_member(
	email varchar(50),
	pw varchar(50),
	tel varchar(50),
	address varchar(50)
);

select * from web_member;

create table web_message(
	num number,
	send_email	varchar(50),
	receive_email	varchar(50),
	content		varchar(200),
	send_date	date
);

select * from web_message;
drop table web_message;
drop sequence num;

create sequence num
start with 1
increment by 1;





