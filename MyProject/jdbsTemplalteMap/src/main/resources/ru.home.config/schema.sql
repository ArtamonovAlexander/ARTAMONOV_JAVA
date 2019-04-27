create table users
(
    id            bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name    varchar(20),
    last_name     varchar(20),
    login         varchar(20),
    password_hash varchar(120)
);

create table auth
(
    id           bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id      bigint,
    cookie_value varchar(150),
    foreign key (user_id) references users (id)
);

create table car
(
    id       bigint not null AUTO_INCREMENT primary key,
    nameUser varchar(20),
    model    varchar(20),
    number   varchar(20)
);

create table course
(
    id    bigint auto_increment primary key,
    title varchar(100)
);

create table lesson
(
    id         bigint auto_increment primary key,
    theme      varchar(100),
    begin_time varchar(100),
    end_time   varchar(100),
    course_id  bigint,
    foreign key (course_id) references course (id)
);