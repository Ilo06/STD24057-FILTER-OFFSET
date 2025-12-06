CREATE TABLE Product(
    id int primary key,
    name varchar,
    price float,
    creation_datetime timestamp,
);

CREATE TABLE Product_category(
    id int primary key,
    name varchar,
    product_id int,
    CONSTRAINT fk_product_id FOREIGN KEY (product_id) REFERENCES Product(id)
);
