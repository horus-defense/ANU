CREATE DATABASE task4;
USE task4;

CREATE TABLE customer (
	customer_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(255) NOT NULL,
    city VARCHAR(225)
);

CREATE TABLE `order` (
	order_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    order_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    customer_id INT NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);

CREATE TABLE item (
	item_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	unit_price DECIMAL(13,2) NOT NULL
);

CREATE TABLE order_item (
	order_id INT NOT NULL,
	item_id INT NOT NULL,
	quantity INT NOT NULL,
    FOREIGN KEY (order_id) REFERENCES `order`(order_id),
    FOREIGN KEY (item_id) REFERENCES item(item_id)
);

CREATE TABLE warehouse (
	warehouse_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	warehouse_city VARCHAR(225) NOT NULL
);

CREATE TABLE shipment (
	order_id INT NOT NULL,
	warehouse_id INT NOT NULL,
    ship_date DATE NOT NULL,
    FOREIGN KEY (order_id) REFERENCES `order`(order_id),
    FOREIGN KEY (warehouse_id) REFERENCES warehouse(warehouse_id)
);
