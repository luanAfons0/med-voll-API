create table medics(

    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null unique,
    crm varchar(6) not null unique,
    specialization varchar(100) not null,

    street varchar(100) not null,
    neighborhood varchar(100) not null,
    cep varchar(9) not null,
    complement varchar(100),
    city varchar(20),
    uf char(2) not null,
    number varchar(100) not null,

    primary key(id)

);