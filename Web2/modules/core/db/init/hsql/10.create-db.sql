-- begin WEB2_CLIENT
create table WEB2_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PHONE varchar(20) not null,
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end WEB2_CLIENT
-- begin WEB2_MECHANIC
create table WEB2_MECHANIC (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID varchar(36) not null,
    HOURLY_RATE decimal(19, 2),
    --
    primary key (ID)
)^
-- end WEB2_MECHANIC
-- begin WEB2_SPAREPART
create table WEB2_SPAREPART (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    DESCRIPTION longvarchar,
    PRICE decimal(19, 2),
    --
    primary key (ID)
)^
-- end WEB2_SPAREPART
-- begin WEB2_ORDER
create table WEB2_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CLIENT_ID varchar(36) not null,
    MECHANIC_ID varchar(36) not null,
    DESCRIPTION longvarchar,
    HOURSSPENT integer,
    AMOUNT decimal(19, 2),
    STATUS integer,
    --
    primary key (ID)
)^
-- end WEB2_ORDER
-- begin WEB2_ORDER_SPAREPART_LINK
create table WEB2_ORDER_SPAREPART_LINK (
    ORDER_ID varchar(36) not null,
    SPAREPART_ID varchar(36) not null,
    primary key (ORDER_ID, SPAREPART_ID)
)^
-- end WEB2_ORDER_SPAREPART_LINK
