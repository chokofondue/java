create table bookinfo (
	bookNum number,
	bookCode varchar(20),
	bookName varchar(50),
	bookAuthor varchar(30),
	bookPublisher varchar(20),
	bookPrice number,
	bookDate date
);

//1부터 1씩 증가하는 번호
create sequence bookNum
start with 1
increment by 1;

select * from bookinfo;

drop table bookinfo;
