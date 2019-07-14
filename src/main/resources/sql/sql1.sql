create database car_rental;
connect car_rental;

create table app_user(id int primary key auto_increment, username varchar(255), email varchar(255) UNIQUE, password varchar(25));

create table client(id int primary key auto_increment, first_name varchar(255), last_name varchar(255), email varchar(255) UNIQUE,
phone int);

create table vehicle(id int primary key auto_increment, company varchar(255), model varchar(255), engine_name varchar(255),
engine_volume decimal(2,1), color varchar(255));

create table orders(id int primary key auto_increment, date_from datetime, date_to datetime, payment_type varchar(255),
title varchar(255), description varchar(255), app_user_id int, client_id int);

create table vehicle_orders(id int primary key auto_increment, vehicle_id int, orders_id int);


alter table orders add foreign key(app_user_id) references app_user(id);
alter table orders add foreign key(client_id) references client(id);

alter table vehicle_orders add foreign key(vehicle_id) references vehicle(id);
alter table vehicle_orders add foreign key(orders_id) references orders(id);