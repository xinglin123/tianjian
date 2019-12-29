
/* Drop Tables */
create database sharedCar charset=utf8;

use sharedCar;

DROP TABLE CAR;




/* Create Tables */

CREATE TABLE CAR
(
	CARID INT NOT NULL AUTO_INCREMENT,
	CARNAME VARCHAR(20),
	PRICE DOUBLE,
	XILIE VARCHAR(20),
	COLOR VARCHAR(20),
	PRIMARY KEY (CARID)
);



