create table t_user (
	id integer,
	login_name varchar(64) not null unique,
	name varchar(64) not null,
	password varchar(255) not null,
	salt varchar(64) not null,
	roles varchar(255) not null,
	primary key (id)
)


insert into t_user (id, login_name, name, password, salt, roles) values(1,'admin','Admin','691b14d79bf0fa2215f155235df5e670b64394cc','7efbd59d9741d34f','admin');
insert into t_user (id, login_name, name, password, salt, roles) values(2,'user','Calvin','2488aa0c31c624687bd9928e0a5d29e7d1ed520b','6d65d24122c30500','user');


select * from t_user