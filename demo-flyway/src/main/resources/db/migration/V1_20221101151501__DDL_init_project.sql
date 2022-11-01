CREATE TABLE `Orders`
(
    `Id`         bigint(11) NOT NULL AUTO_INCREMENT,
    `CustomerId` int(11) DEFAULT NULL,
    PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `Customers`
(
    `Id`   int(11) NOT NULL,
    `Name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;