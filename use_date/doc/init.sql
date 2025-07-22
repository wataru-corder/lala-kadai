--
-- データベース example
--



CREATE TABLE members(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	birthday DATE NOT NULL
);

INSERT INTO members(name,birthday) VALUES
('湊 祐介', '2002-3-12'),
('綾部 みゆき', '2003-4-13');



CREATE TABLE mutter(
id INT PRIMARY KEY AUTO_INCREMENT,
userName VARCHAR(100) NOT NULL,
text TEXT NOT NULL
);

