CREATE DATABASE mytest;

CREATE TABLE t_user(
  userId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  userName VARCHAR(255) default "",
  password VARCHAR(255) default "",
  phone VARCHAR(255) default ""
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;