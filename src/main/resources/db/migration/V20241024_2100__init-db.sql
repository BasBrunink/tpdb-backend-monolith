
create table public._user
(
    id uuid not null primary key,
    name varchar(255),
    email varchar(255),
    password varchar(255),
)

alter table public._user
    owner to tpdb;

