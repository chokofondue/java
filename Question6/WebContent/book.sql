1.ȸ�������� ������ book_member ���̺��� �����Ͻÿ�.
  �÷���: ���̵� / ��й�ȣ / �г��� / �̸��� / ��ȭ��ȣ
create table MemberDTO(
	id 			varchar2(50),
	pw 			varchar2(50),
	nickname 	varchar2(50),
	email 		varchar2(50),
	tel 		varchar2(50)
);
  
  
  
2.���������� ������ book_info ���̺��� �����Ͻÿ�.
  �÷���: ��ȣ / ���� / ���� / ���ǻ� / �뿩����
  
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

insert into book_info values(num.nextval,'82��� ������','������','������',0);
insert into book_info values(num.nextval,'���� �ִ� ����','����� �̽ñ���','������',0);
insert into book_info values(num.nextval,'���� ������ �԰� �;�','�ù̳� ���','�ҹ̵̹��',0);
insert into book_info values(num.nextval,'�������� ����','�迵��','���е���',0);
insert into book_info values(num.nextval,'���ѻ꼺','����','�а���',0);

  
  



