create table patients (
    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null unique,
    cellphone varchar(20) not null,

    street varchar(100) not null,
    neighborhood varchar(100) not null,
    cep varchar(9) not null,
    complement varchar(100),
    city varchar(20),
    uf char(2) not null,
    number varchar(100) not null,

    primary key(id)
);