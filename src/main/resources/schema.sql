CREATE TABLE Product_category(
    id int primary key,
    name varchar
);
CREATE TABLE Product(
    id int primary key,
    name varchar,
    price float,
    creation_datetime timestamp,
    category_id int,
    CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES Product_category(id)
);

