## Sample data

USE library

INSERT INTO category (`category_id`, `name`) VALUES
('1', 'Computer Science'),
('2', 'Cybersecurity'),
('3', 'Data Science');

INSERT INTO publisher (`pub_id`, `name`, `address`) VALUES
('1', 'Mohamed Hussein', 'test'),
('2', 'Muhammed Sherif', 'test2'),
('3', 'Youssef Amr', 'test3');

INSERT INTO member (`member_id`, `name`, `address`, `join_date`) VALUES
('1', 'Amr Adel', 'test', '2004-01-15'),
('2', 'Adel Mabrouk', 'test2', '2016-02-10'),
('3', 'Ali Hussein', 'test3', '2019-03-01');

INSERT INTO book (`book_id`, `title`, `price`, `pub_id`, `category_id`) VALUES
('1', 'Database', '450.00', '3', '1'),
('2', 'Data Structure', '520.50', '1', '2'),
('3', 'Secure Software', '380.00', '2', '3');

INSERT INTO borrowing_book (`member_id`, `book_id`, `borrow_date`, `due_date`, `return_date`) VALUES
('1', '1', '2026-03-10', '2026-03-24', '2026-03-20'),
('2', '2', '2026-03-12', '2026-03-26', '2026-03-31'),
('3', '3', '2026-03-15', '2026-03-29', '2026-03-28');


##1
SELECT name FROM member WHERE join_date > '2000-09-01'
##2
SELECT * FROM member WHERE join_date > '1995-10-01' AND join_date < '2019-10-01'
##3 
SELECT * FROM book JOIN publisher ON book.pub_id = publisher.pub_id WHERE publisher.name = 'Youssef Amr' OR book.price > 15 AND book.price < 20;
##4 
SELECT book.title FROM book, borrowing_book, member WHERE book.book_id = borrowing_book.book_id AND member.member_id = borrowing_book.member_id AND member.name = 'Amr Adel';
##5
SELECT name FROM member,borrowing_book WHERE member.member_id = borrowing_book.member_id AND borrowing_book.borrow_date > '2018-12-31' AND borrowing_book.borrow_date < '2020-01-01';