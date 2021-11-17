CREATE TABLE `estudiante` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dni` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=244 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `estudiante` VALUES (1,20000,'Roberto','Ayala'),(2,30000,'Juan','Verón'),(3,40000,'Gabriel','Batistuta'),(4,50000,'Hernán','Crespo'),(5,100000,'Juan','Riquelme'),(6,100000,'John','Doe'),(8,150000,'Claudio','Lopez'),(9,80000,'Lionel','Messi');
