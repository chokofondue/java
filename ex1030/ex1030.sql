//데이터검색
select * from student;

//테이블 삭제
drop table student;

create table student(
	name varchar(30),
	age number,
	gender varchar(10)
);

//데이터 저장
insert into student values('test', 99, '남자');
insert into student values('test_01', 99, '여자');

//컬럼추가
alter table student add stu_num number;

insert into student(stu_num) values(1);

//컬럼수정
alter table student modify name varchar(20);

//컬럼삭제
alter table student drop column stu_num;



create table smart(
	id varchar(30),
	pw varchar(30),
	hp varchar(15),
	salary number,
	email varchar(50),
	address varchar(50)
);

insert into smart values('data_ta','1234','01012341111',500000 ,'data_ta@naver.com','서울특별시 영등포 36-7');
insert into smart values('kism1122','0000','0626553509',40000000 ,'kism1122@kism.com','광주광역시 남구 송암로');
insert into smart values('dang','1819','01024071923',1000 ,'dang@daum.net','광주광역시 서구 금호동');
insert into smart values('hedodo','2819','01088230000',1000 ,'hedodo@gmail.com','전주시 한옥마을');
insert into smart values('mmm','2819','01012358567',30000,'mmm@gmai.com','알레스카');
insert into smart values('meme','2819','01088231235',2500000,'meme@gmail.com','샌프란시스코');

select * from smart;

//아이디와 비밀번호만 검색
select id, pw from smart;

//아이디와 핸드폰 봉급만 검색
select id, hp, salary from smart;

//컬럼명 as 별칭
select id as 아이디, hp 번호, salary as 봉급 from smart;

//조건 where
select * from smart where id = 'data_ta';

//비교연산자
select * from smart where salary > 500000;
select * from smart where salary < 500000;
select * from smart where salary between 100 and 40000000;
select * from smart where salary < 500000 or id='data_ta';
select * from smart where id not in('data_ta','dang');
select * from smart where id like '%m%';
select * from smart where id like 'm_';

update smart set salary = 50000 where id ='dang';
update smart set id = 'hedo' where id ='hedodo';

delete from smart where id ='mmm';

//정렬(desc=내림차순, asc=오름차순,생략가능)
select * from smart order by salary desc;


create table salesman(
	id varchar(30),
	pass varchar(30),
	phone varchar(15),
	salary number,
	email varchar(50),
	addr varchar(50)
);

select * from salesman;
drop table salesman;


insert into salesman values('Jason','3650','018',500000000 ,'jason12@naver.com','서울 마포');
insert into salesman values('Tomas','1234','019',2000000,'Tomail1@naver.com','뉴욕 금호동');
insert into salesman values('PSY','4600','010',5000000 ,'love_PSY@naver.com','부산 송암동');
insert into salesman values('Cris','365012','011',10000 ,'Cris002@naver.com','북한 명동');
insert into salesman values('Justin','66677','010',70000000 ,' ustin00@naver.com','일본 송정동');


select * from salesman where id = 'Jason';
select * from salesman where salary > 1000000;
select * from salesman where phone = 010 or salary = 70000000;
select * from salesman where salary between 1000 and 5000000;
select * from salesman where id in('Jason','Cris');
select * from salesman where email like '%naver.com';
select * from salesman where id like '%s';

select * from salesman order by salary;

update salesman set addr = '홍콩' where id ='jason';

select * from salesman where id = 'jason';





