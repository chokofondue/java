1.회원정보를 저장할 book_member 테이블을 생성하시오.
  컬럼명: 아이디 / 비밀번호 / 닉네임 / 이메일 / 전화번호
create table MemberDTO(
	id 			varchar2(50),
	pw 			varchar2(50),
	nickname 	varchar2(50),
	email 		varchar2(50),
	tel 		varchar2(50)
);
  
  
  
2.도서정보를 저장할 book_info 테이블을 생성하시오.
  컬럼명: 번호 / 제목 / 저자 / 출판사 / 대여여부
  
create table book_info(
	num		Number,
	title	varchar2(50),
	author	varchar2(50),
	publisher	varchar2(50),
	possib le	Number
);

select * from book_info;
drop table book_info;
drop sequence num;

create sequence num
start with 1
increment by 1;

insert into book_info values(num.nextval,'82년생 김지영','조남주','민음사',0);
insert into book_info values(num.nextval,'남아 있는 나날','가즈오 이시구로','민음사',0);
insert into book_info values(num.nextval,'너의 췌장을 먹고 싶어','시미노 요루','소미미디어',0);
insert into book_info values(num.nextval,'살인자의 기억법','김영하','문학동네',0);
insert into book_info values(num.nextval,'남한산성','김훈','학고재',0);

  
  



