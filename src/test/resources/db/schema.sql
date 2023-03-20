-- auto-generated definition
create table people
(
    id     int auto_increment primary key,
    name   varchar(10)       not null,
    sex    tinyint           not null,
    age    int               null,
    status tinyint default 0 null
);

