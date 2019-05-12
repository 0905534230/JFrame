DROP  DATABASE IF EXISTS `employee-management`;
CREATE DATABASE `employee-management` CHARACTER SET utf8;

USE `employee-management`;

CREATE TABLE `Persons`
(
  `ID` int PRIMARY KEY AUTO_INCREMENT,
  `YearOfBirth` int,
  `Type` int,
  `Name` varchar(200)
);

CREATE TABLE `Staffs`
(
  `ID` int PRIMARY KEY AUTO_INCREMENT,
  `PersonID` int,
  `Hometown` varchar(200),
  `Department` varchar(40),
  `SalaryRatio` float,
  `Allowance` int,
  `Position` varchar(40),
  `WorkDay` int,
  `YearOfWork` int,
  `MinimumWage` float
);

CREATE TABLE `Lecturers`
(
  `ID` int PRIMARY KEY AUTO_INCREMENT,
  `PersonID` int,
  `Hometown` varchar(200),
  `Department` varchar(40),
  `Qualification` varchar(40),
  `SalaryRatio` float,
  `Allowance` int,
  `PeriodsInMonth` int,
  `YearOfWork` int,
  `MinimumWage` float
);

CREATE TABLE `CasualWorkers`
(
  `ID` int PRIMARY KEY AUTO_INCREMENT,
  `PersonID` int,
  `Hometown` varchar(200),
  `Qualification` varchar(40),
  `SalaryRatio` float,
  `WorkDay` int,
  `EarningPerDay` varchar(40)
);

ALTER TABLE `Staffs` ADD FOREIGN KEY (`PersonID`) REFERENCES `Persons` (`ID`);

ALTER TABLE `Lecturers` ADD FOREIGN KEY (`PersonID`) REFERENCES `Persons` (`ID`);

ALTER TABLE `CasualWorkers` ADD FOREIGN KEY (`PersonID`) REFERENCES `Persons` (`ID`);
