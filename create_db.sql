CREATE DATABASE `library`;

USE `library`;

CREATE TABLE `author` (
  `id` int NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO author (`id`,`first_name`,`last_name`) VALUES(1, 'Hello', 'World');
INSERT INTO author (`id`,`first_name`,`last_name`) VALUES(2, 'jOOQ', 'Example');