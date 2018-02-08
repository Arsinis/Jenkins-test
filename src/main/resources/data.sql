DROP TABLE if EXISTS tbl_book ;
CREATE TABLE tbl_book (id integer not null auto_increment, ISBN varchar(255), name varchar(255), Author varchar(255), primary key (id));
INSERT INTO tbl_book (id, ISBN, name, Author) VALUES (1,'978-0495011606', 'Skyrim', 'Akunin');