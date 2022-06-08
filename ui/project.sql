create database eCommerce
use eCommerce
create table product_category(
id int,
name varchar(20),
created_at timestamp,
modified_At timestamp,
deleted_At timestamp
);
create table discount(
id int,
name varchar(20),
discount_percent int,
active boolean,
created_At timestamp,
modified_At timestamp,
deleted_At timestamp
);
create table product(
id int,
name varchar(20),
category_id int,
price int,
discount_id int,
created_At timestamp,
modified_At timestamp,
deleted_At timestamp
);
create table order_details(
id int,
user_id varchar(20),
total float,
payment_id int,
created_At timestamp,
modified_At timestamp
);
create table order_items(
id int,
order_id int,
product_id int,
quantity int,
created_At timestamp,
modified_At timestamp
);
create table user(
id int,
username varchar(20),
password text,
first_name varchar(20),
last_name varchar(20),
address varchar(50),
created_At timestamp,
modified_At timestamp,
city varchar(20),
postal_code varchar(20),
country varchar(20),
mobile int
);