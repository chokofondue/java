1. ȸ�������� ������ ������ �� �ִ� 'web_member'���̺��� ����ÿ�.
   �÷��� : email / pw / tel / address

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





