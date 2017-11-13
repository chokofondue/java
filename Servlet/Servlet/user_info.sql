create table user_info(
	id	varchar(10),
	pw 	varchar(10),
	nickname varchar(20)
);

insert into user_info values('admin_','12345','test');

select * from user_info;