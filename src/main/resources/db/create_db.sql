drop table if exists attribute_aud cascade;

drop table if exists attribute_limit cascade;

drop table if exists attribute_limit_aud cascade;

drop table if exists attribute_limit_range cascade;

drop table if exists attribute_limit_range_aud cascade;

drop table if exists attribute_standart_operation cascade;

drop table if exists attribute_standart_operation_aud cascade;

drop table if exists attribute_type cascade;

drop table if exists attribute_type_aud cascade;

drop table if exists device_aud cascade;

drop table if exists line_aud cascade;

drop table if exists operation_aud cascade;

drop table if exists operation_route cascade;

drop table if exists operation cascade;

drop table if exists operation_route_aud cascade;

drop table if exists operation_status cascade;

drop table if exists operation_status_aud cascade;

drop table if exists role_aud cascade;

drop table if exists route cascade;

drop table if exists device cascade;

drop table if exists route_aud cascade;

drop table if exists route_status cascade;

drop table if exists route_status_aud cascade;

drop table if exists standart_operation_aud cascade;

drop table if exists standart_route_aud cascade;

drop table if exists standart_route_operation cascade;

drop table if exists standart_operation cascade;

drop table if exists standart_route cascade;

drop table if exists standart_route_operation_aud cascade;

drop table if exists unit cascade;

drop table if exists attribute cascade;

drop table if exists unit_aud cascade;

drop table if exists user_role cascade;

drop table if exists role cascade;

drop table if exists user_role_aud cascade;

drop table if exists users cascade;

drop table if exists users_aud cascade;

drop table if exists workplace cascade;

drop table if exists line cascade;

drop table if exists workplace_aud cascade;

drop table if exists my_revision_entity cascade;


create table attribute
(
    id             bigint  not null
        constraint attribute_pkey
            primary key,
    is_active      boolean not null,
    is_influencect boolean not null,
    name           varchar(255)
);

create table attribute_limit
(
    id              bigint  not null
        constraint attribute_limit_pkey
            primary key,
    is_active       boolean not null,
    possible_values jsonb,
    attribute_id    bigint
        constraint fk2q89ws2xswetwl6fvaitdqhuw
            references attribute
);

create table attribute_limit_range
(
    id           bigint           not null
        constraint attribute_limit_range_pkey
            primary key,
    is_active    boolean          not null,
    max          double precision not null,
    min          double precision not null,
    attribute_id bigint
        constraint fkaygv3d20mndpffsvajc8gk6b4
            references attribute
);

create table attribute_type
(
    id           bigint  not null
        constraint attribute_type_pkey
            primary key,
    is_active    boolean not null,
    name         varchar(255),
    attribute_id bigint
        constraint fkfmxc09cbxp30t7944ak0e25pf
            references attribute
);

create table device
(
    id        bigint  not null
        constraint device_pkey
            primary key,
    is_active boolean not null,
    name      varchar(255)
);

create table line
(
    id        bigint  not null
        constraint line_pkey
            primary key,
    is_active boolean not null,
    line_name varchar(255)
);

create table my_revision_entity
(
    id        integer not null
        constraint my_revision_entity_pkey
            primary key,
    timestamp bigint  not null,
    user_name varchar(255)
);

create table attribute_aud
(
    id             bigint  not null,
    rev            integer not null
        constraint fkmbkb6kyal1fjtiewwaxgf9qjb
            references my_revision_entity,
    revtype        smallint,
    is_influencect boolean,
    name           varchar(255),
    constraint attribute_aud_pkey
        primary key (id, rev)
);

create table attribute_limit_aud
(
    id              bigint  not null,
    rev             integer not null
        constraint fkkq8atn37l3fmjfa3xpienwp3b
            references my_revision_entity,
    revtype         smallint,
    possible_values jsonb,
    attribute_id    bigint,
    constraint attribute_limit_aud_pkey
        primary key (id, rev)
);

create table attribute_limit_range_aud
(
    id           bigint  not null,
    rev          integer not null
        constraint fkn9armyv2u9kdan8jw3a7no3yl
            references my_revision_entity,
    revtype      smallint,
    max          double precision,
    min          double precision,
    attribute_id bigint,
    constraint attribute_limit_range_aud_pkey
        primary key (id, rev)
);

create table attribute_standart_operation_aud
(
    rev                   integer not null
        constraint fk5uxat6ul35cdnp05fp8igwiao
            references my_revision_entity,
    attribute_id          bigint  not null,
    standart_operation_id bigint  not null,
    revtype               smallint,
    constraint attribute_standart_operation_aud_pkey
        primary key (rev, attribute_id, standart_operation_id)
);

create table attribute_type_aud
(
    id           bigint  not null,
    rev          integer not null
        constraint fkpgr7riy8fc7oyyvmkj5sjg4iw
            references my_revision_entity,
    revtype      smallint,
    name         varchar(255),
    attribute_id bigint,
    constraint attribute_type_aud_pkey
        primary key (id, rev)
);

create table device_aud
(
    id      bigint  not null,
    rev     integer not null
        constraint fkhagt7mhdve1p7iq3jivwe6k8p
            references my_revision_entity,
    revtype smallint,
    name    varchar(255),
    constraint device_aud_pkey
        primary key (id, rev)
);

create table line_aud
(
    id        bigint  not null,
    rev       integer not null
        constraint fkhcd70vekgv5pphw4mlhfl05ar
            references my_revision_entity,
    revtype   smallint,
    line_name varchar(255),
    constraint line_aud_pkey
        primary key (id, rev)
);

create table operation_aud
(
    id                    bigint  not null,
    rev                   integer not null
        constraint fki0na2epk0ycpsblqaa77xam69
            references my_revision_entity,
    revtype               smallint,
    attribute_map         jsonb,
    cycle_time            double precision,
    standart_operation_id bigint,
    status_id             bigint,
    constraint operation_aud_pkey
        primary key (id, rev)
);

create table operation_route_aud
(
    operation_id bigint  not null,
    route_id     bigint  not null,
    rev          integer not null
        constraint fklevw9i105kqn71xiq8kwrk95
            references my_revision_entity,
    revtype      smallint,
    workplace_id bigint,
    constraint operation_route_aud_pkey
        primary key (operation_id, route_id, rev)
);

create table operation_status
(
    id        bigint  not null
        constraint operation_status_pkey
            primary key,
    is_active boolean not null,
    name      varchar(255),
    status    varchar(255)
);

create table operation_status_aud
(
    id      bigint  not null,
    rev     integer not null
        constraint fkj4amy1caqg2voumuq333ikn6n
            references my_revision_entity,
    revtype smallint,
    name    varchar(255),
    status  varchar(255),
    constraint operation_status_aud_pkey
        primary key (id, rev)
);

create table role
(
    id        bigint  not null
        constraint role_pkey
            primary key,
    is_active boolean not null,
    name      varchar(255),
    value     varchar(255)
);

create table role_aud
(
    id      bigint  not null,
    rev     integer not null
        constraint fksld4f4osi0b8ec1k4gw2uoenm
            references my_revision_entity,
    revtype smallint,
    name    varchar(255),
    value   varchar(255),
    constraint role_aud_pkey
        primary key (id, rev)
);

create table route_aud
(
    id                bigint  not null,
    rev               integer not null
        constraint fkgrhgrtl7dap662vp7wd3qh4di
            references my_revision_entity,
    revtype           smallint,
    name              varchar(255),
    device_id         bigint,
    standart_route_id bigint,
    status_id         bigint,
    constraint route_aud_pkey
        primary key (id, rev)
);

create table route_status
(
    id        bigint  not null
        constraint route_status_pkey
            primary key,
    is_active boolean not null,
    name      varchar(255),
    status    varchar(255)
);

create table route_status_aud
(
    id      bigint  not null,
    rev     integer not null
        constraint fk2bkv75uad9fewr307xur0iohr
            references my_revision_entity,
    revtype smallint,
    name    varchar(255),
    status  varchar(255),
    constraint route_status_aud_pkey
        primary key (id, rev)
);

create table standart_operation
(
    id        bigint  not null
        constraint standart_operation_pkey
            primary key,
    is_active boolean not null,
    name      varchar(255)
        constraint uk_f8fuls94tus518vj550lilwdw
            unique
);

create table attribute_standart_operation
(
    attribute_id          bigint not null
        constraint fkbsf6d16ab3koh7swo7n262par
            references attribute,
    standart_operation_id bigint not null
        constraint fkc61numqrdqjk2jhn7ijlpy30r
            references standart_operation,
    constraint attribute_standart_operation_pkey
        primary key (attribute_id, standart_operation_id)
);

create table operation
(
    id                    bigint  not null
        constraint operation_pkey
            primary key,
    is_active             boolean not null,
    attribute_map         jsonb,
    cycle_time            double precision,
    standart_operation_id bigint
        constraint fk2xmjkai63j5nl3mdmrfg4xqps
            references standart_operation,
    status_id             bigint
        constraint fkbeprbgyggkekg5jk7jfkcwtc0
            references operation_status
);

create table standart_operation_aud
(
    id      bigint  not null,
    rev     integer not null
        constraint fkjl2n44dp4ats14bbe67203r2f
            references my_revision_entity,
    revtype smallint,
    name    varchar(255),
    constraint standart_operation_aud_pkey
        primary key (id, rev)
);

create table standart_route
(
    id                 bigint  not null
        constraint standart_route_pkey
            primary key,
    is_active          boolean not null,
    name               varchar(255),
    operation_priority integer not null
);

create table route
(
    id                bigint  not null
        constraint route_pkey
            primary key,
    is_active         boolean not null,
    name              varchar(255),
    device_id         bigint
        constraint fkk6okqconsnjfxi8jlaboc11o2
            references device,
    standart_route_id bigint  not null
        constraint fks8xlxw68nbxrd8dk09psw4lrh
            references standart_route,
    status_id         bigint
        constraint fk23pxya7tn4h7grewrukqfdv8m
            references route_status
);

create table standart_route_aud
(
    id                 bigint  not null,
    rev                integer not null
        constraint fk4kff62r0ei95jbc0tfncvrrk0
            references my_revision_entity,
    revtype            smallint,
    name               varchar(255),
    operation_priority integer,
    constraint standart_route_aud_pkey
        primary key (id, rev)
);

create table standart_route_operation
(
    standart_route_id     bigint not null
        constraint fkej1gbqkx5bnr26oem66pkdjul
            references standart_route,
    standart_operation_id bigint not null
        constraint fk2tgee1wewxqn9172v40bxmpkg
            references standart_operation
);

create table standart_route_operation_aud
(
    rev                   integer not null
        constraint fk61b6kkbkxb16qts2wksfwec2n
            references my_revision_entity,
    standart_route_id     bigint  not null,
    standart_operation_id bigint  not null,
    revtype               smallint,
    constraint standart_route_operation_aud_pkey
        primary key (rev, standart_route_id, standart_operation_id)
);

create table unit
(
    id           bigint  not null
        constraint unit_pkey
            primary key,
    is_active    boolean not null,
    name         varchar(255),
    units        varchar(255),
    attribute_id bigint
        constraint fk2hs5xpqaludiynfhwf3bgqpkn
            references attribute
);

create table unit_aud
(
    id           bigint  not null,
    rev          integer not null
        constraint fkh6d2x1cl8wgbkg6xp7i7ok04o
            references my_revision_entity,
    revtype      smallint,
    name         varchar(255),
    units        varchar(255),
    attribute_id bigint,
    constraint unit_aud_pkey
        primary key (id, rev)
);

create table user_role_aud
(
    rev     integer not null
        constraint fkqjy0dujvjx9ndtb8np1h7nl7a
            references my_revision_entity,
    user_id bigint  not null,
    role_id bigint  not null,
    revtype smallint,
    constraint user_role_aud_pkey
        primary key (rev, user_id, role_id)
);

create table users
(
    id         bigint  not null
        constraint users_pkey
            primary key,
    is_active  boolean not null,
    email      varchar(255),
    first_name varchar(255),
    last_name  varchar(255)
);

create table user_role
(
    user_id bigint not null
        constraint fkj345gk1bovqvfame88rcx7yyx
            references users,
    role_id bigint not null
        constraint fka68196081fvovjhkek5m97n3y
            references role,
    constraint user_role_pkey
        primary key (user_id, role_id)
);

create table users_aud
(
    id         bigint  not null,
    rev        integer not null
        constraint fk4k63wxrqmd8unvblvdhm7hli8
            references my_revision_entity,
    revtype    smallint,
    email      varchar(255),
    first_name varchar(255),
    last_name  varchar(255),
    constraint users_aud_pkey
        primary key (id, rev)
);

create table workplace
(
    id        bigint  not null
        constraint workplace_pkey
            primary key,
    is_active boolean not null,
    name      varchar(255),
    line_id   bigint
        constraint fk5i1e90ptkla3a0depbt9a1rv8
            references line
);

create table operation_route
(
    operation_id bigint not null
        constraint fk21mves8jb7k320oallgvw3dy5
            references operation,
    route_id     bigint not null
        constraint fkh4h4mxjad732jlhtjfwvgrfl5
            references route,
    workplace_id bigint
        constraint fklb86hodbs5sc30412ifycaoig
            references workplace,
    constraint operation_route_pkey
        primary key (operation_id, route_id)
);

create table workplace_aud
(
    id      bigint  not null,
    rev     integer not null
        constraint fkt13l8cs5fm61yqnp30ecl7fdx
            references my_revision_entity,
    revtype smallint,
    name    varchar(255),
    line_id bigint,
    constraint workplace_aud_pkey
        primary key (id, rev)
);

