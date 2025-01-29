alter table medics add deleted tinyint;
update medics set deleted = 0;
alter table medics modify deleted tinyint not null;