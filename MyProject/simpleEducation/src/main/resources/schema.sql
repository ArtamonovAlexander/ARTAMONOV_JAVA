create table users (
	id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
	first_name varchar(20),
	last_name varchar(20),
	login varchar(20),
	password_hash varchar(120)
);

create table auth (
  id bigint  NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id bigint,
  cookie_value varchar(150),
  foreign key (user_id) references service_user(id)
);
