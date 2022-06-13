create database Cartmax
use Cartmax
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
first_name varchar(20),
last_name varchar(20),
password text,
email varchar(20)
-- address varchar(50),
-- created_At timestamp,
-- modified_At timestamp,
-- city varchar(20),
-- postal_code varchar(20),
-- country varchar(20),
-- mobile int

       
);
ALTER TABLE user MODIFY COLUMN id INT auto_increment
select * from user;
drop table user
/*create table shopping_session(
id int,
user_id varchar(20),
total decimal,
created_At timestamp,
modified_At timestamp
);*/
-- create table cart_items(
-- id int,
-- product_id int,
-- quantity int,
-- created_At timestamp,
-- modified_At timestamp
-- );
/*create table user_address(
id int,
user_id int,
address varchar(50),
city varchar(20),
postal_code varchar(20),
country varchar(20),
mobile int
);*/
/*create table user_payment(
id int,
user_id int,
payment_type varchar(20),
provider varchar(20),
account_no int,
expiry int
);*/
create table payment_details(
id int,
order_id int,
amount int,
provider varchar(20),
status varchar(20),
created_At timestamp,
modified_At timestamp
);
create table admin(
id int,
username varchar(20),
password text,
first_name varchar(20),
last_name varchar(20),
telephone int,
address varchar(50),
created_At timestamp,
modified_At timestamp
);
create table user (
       id bigint not null auto_increment,
        email varchar(45) not null,
        first_name varchar(20) not null,
        last_name varchar(20) not null,
        password varchar(64) not null,
        primary key (id)
    )





