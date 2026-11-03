CREATE DATABASE Library;
USE Library;

CREATE TABLE category (
	category_id INT NOT NULL PRIMARY KEY,
    name VARCHAR(225) NOT NULL
);

CREATE TABLE publisher (
	pub_id INT NOT NULL PRIMARY KEY,
    name VARCHAR(225) NOT NULL,
    address VARCHAR(225)
);

CREATE TABLE book (
	book_id INT NOT NULL PRIMARY KEY,
    title VARCHAR(225) NOT NULL,
    price DECIMAL(7,2) NOT NULL,
    pub_id INT NOT NULL,
    category_id INT NOT NULL,
    FOREIGN KEY (pub_id) REFERENCES publisher(pub_id),
    FOREIGN KEY (category_id) REFERENCES category(category_id)
);



CREATE TABLE member (
	member_id INT NOT NULL PRIMARY KEY,
    name VARCHAR(225) NOT NULL,
    address VARCHAR(225),
    join_date DATE
);

CREATE TABLE borrowing_book (
	member_id INT NOT NULL,
    book_id INT NOT NULL,
    borrow_date DATE,
    due_date DATE,
    return_date DATE,
    FOREIGN KEY (member_id) REFERENCES member(member_id),
    FOREIGN KEY (book_id) REFERENCES book(book_id)
);