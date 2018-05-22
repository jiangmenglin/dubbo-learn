drop table if exists city;

create table city (id int primary key auto_increment, name varchar(32), state varchar(32), country varchar(32));

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');