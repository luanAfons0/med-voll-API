alter table patients add deleted tinyint;
update patients set deleted = 0;
alter table patients modify deleted tinyint not null;