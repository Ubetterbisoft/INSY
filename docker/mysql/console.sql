Drop database if exists landwirtschaftsbetrieb;
Create database landwirtschaftsbetrieb;
Use landwirtschaftsbetrieb;

create table tier(
    name varchar[200]

);

create table futter(
    Foreign Key (tier) References tier (zuchtregister)
);

create table stall(
    belag varchar(20),
    boxnummer int,
    stallnummer int,
    tier int,
    
)


