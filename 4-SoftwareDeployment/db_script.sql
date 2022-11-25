create table users (user_id  bigserial not null, name varchar(255), role varchar(255), primary key (user_id));
insert into users values(1, 'user1', 'role11');
insert into users values(2, 'user2', 'role22');
insert into users values(3, 'user3', 'role33');