-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: allopito
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bed`
--

DROP TABLE IF EXISTS `bed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bed` (
  `id_bed` int NOT NULL AUTO_INCREMENT,
  `id_patient` int DEFAULT NULL,
  `id_room` int DEFAULT NULL,
  PRIMARY KEY (`id_bed`),
  UNIQUE KEY `UK_m2i7u75sdy8s8ryxocyquo0ei` (`id_patient`),
  KEY `FKpvtjr6w6gu312le6751n1hpqf` (`id_room`),
  CONSTRAINT `FK6umy8ph1bumrdcikljubhbssr` FOREIGN KEY (`id_patient`) REFERENCES `patient` (`id_patient`),
  CONSTRAINT `FKpvtjr6w6gu312le6751n1hpqf` FOREIGN KEY (`id_room`) REFERENCES `room` (`id_room`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bed`
--

LOCK TABLES `bed` WRITE;
/*!40000 ALTER TABLE `bed` DISABLE KEYS */;
INSERT INTO `bed` VALUES (1,1,1),(2,NULL,2),(3,NULL,3),(4,3,4),(5,NULL,5),(6,2,6),(7,NULL,7),(8,NULL,8);
/*!40000 ALTER TABLE `bed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `id_patient` int NOT NULL AUTO_INCREMENT,
  `security_number` varchar(15) NOT NULL,
  `firstname_patient` varchar(50) NOT NULL,
  `lastname_patient` varchar(50) NOT NULL,
  PRIMARY KEY (`id_patient`),
  UNIQUE KEY `UK_p0yi9yysnemewlu98p0cua813` (`security_number`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (1,'123456789012345','Nicolas','Drapier'),(2,'23456789012345','Thomas','Baudrin'),(3,'3456789012345','Sarah','Katz'),(4,'456789012345678','Alexis','Dalle');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `id_room` int NOT NULL AUTO_INCREMENT,
  `id_service` int NOT NULL,
  `number_room` varchar(5) NOT NULL,
  PRIMARY KEY (`id_room`),
  KEY `FKb2cexr0d6ekj0sxfr6xx6w2xk` (`id_service`),
  CONSTRAINT `FKb2cexr0d6ekj0sxfr6xx6w2xk` FOREIGN KEY (`id_service`) REFERENCES `service` (`id_service`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,1,'U001'),(2,1,'U002'),(3,2,'P001'),(4,2,'P002'),(5,3,'N001'),(6,3,'N002'),(7,4,'D001'),(8,4,'D002');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service` (
  `id_service` int NOT NULL AUTO_INCREMENT,
  `name_service` varchar(50) NOT NULL,
  PRIMARY KEY (`id_service`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (1,'Urgences'),(2,'Pneumologie'),(3,'Neurologie'),(4,'Diététique');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id_service` int DEFAULT NULL,
  `id_user` int NOT NULL AUTO_INCREMENT,
  `role_user` varchar(20) NOT NULL,
  `firstname_user` varchar(50) NOT NULL,
  `lastname_user` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password_user` varchar(255) NOT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE KEY `UK_sb8bbouer5wak8vyiiy4pf2bx` (`username`),
  KEY `FKr52xcfo6ndsyq1qpxpl4f9bai` (`id_service`),
  CONSTRAINT `FKr52xcfo6ndsyq1qpxpl4f9bai` FOREIGN KEY (`id_service`) REFERENCES `service` (`id_service`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (NULL,1,'ADMIN','Marie','Dupont','Admin','$2a$16$02hhWtnnagGWLS8pmOM9.Osd/FXYDwxrzGv8tSqmF3nQ4QY8tVGhO'),(1,2,'NURSE','Julien','Martin','Nurse','$2a$16$02hhWtnnagGWLS8pmOM9.Osd/FXYDwxrzGv8tSqmF3nQ4QY8tVGhO'),(3,3,'SECRETARY','Sophie','Lambert','Secretary','$2a$16$02hhWtnnagGWLS8pmOM9.Osd/FXYDwxrzGv8tSqmF3nQ4QY8tVGhO');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-29 16:24:07
