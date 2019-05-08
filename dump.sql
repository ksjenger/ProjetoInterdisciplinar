-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: projetointerdisciplinar
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cliente` (
  `IdCliente` int(5) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(15) NOT NULL,
  `LastName` varchar(15) NOT NULL,
  `Logradouro` varchar(50) NOT NULL,
  `Numero` int(5) NOT NULL,
  `Bairro` varchar(50) NOT NULL,
  `Complemento` varchar(50) NOT NULL,
  `Cep` varchar(9) NOT NULL,
  `UF` char(2) NOT NULL,
  `Telefone` varchar(12) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `IdConvenio` int(5) DEFAULT NULL,
  `Carteirinha` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IdCliente`),
  UNIQUE KEY `IdCliente_UNIQUE` (`IdCliente`),
  UNIQUE KEY `Carteirinha_UNIQUE` (`Carteirinha`),
  KEY `IdConvenio` (`IdConvenio`),
  CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`IdConvenio`) REFERENCES `convenios` (`IdConvenio`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (2,'Kauan','Jenger','Lagoa da Barra',625,'Itaquera','Apto 303, bloco 8','08215-540','SP','11998661341',NULL,1,NULL),(3,'Teste','teste','teste',123,'teste','teste','01203-001','sp','1137378999',NULL,1,NULL),(4,'Maria','Doarte','Loefgreen',123,'Vila Clementino','','12345-678','SP','1199999999',NULL,1,NULL),(5,'Mellzinha','Conha','Conselheiro Nebias',263,'Campos Eliseos','7 Andar','01203-001','sp','1138389000','MELCONHA@GMAIL.COM',1,NULL),(6,'Jose','Das Coves','Rua dos Bobos',0,'Imaginario','','34901-123','SP','','josedascoves@gmail.com',1,NULL),(7,'Jose','Das Coves','Rua dos Bobos',0,'Imaginario','','34901-123','SP','','josedascoves@gmail.com',1,NULL),(8,'Jose','Das Coves','Rua dos Bobos',0,'Imaginario','','34901-123','SP','','josedascoves@gmail.com',1,NULL),(9,'Jose ','das Coves','Rua dos bobos ',0,'Imaginario','','01203-001','SP','1137378900','Jose@gmail.com',1,NULL);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `convenios`
--

DROP TABLE IF EXISTS `convenios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `convenios` (
  `IdConvenio` int(5) NOT NULL,
  `Empresa` varchar(20) NOT NULL,
  PRIMARY KEY (`IdConvenio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `convenios`
--

LOCK TABLES `convenios` WRITE;
/*!40000 ALTER TABLE `convenios` DISABLE KEYS */;
INSERT INTO `convenios` VALUES (1,'NotreDame');
/*!40000 ALTER TABLE `convenios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `infantil`
--

DROP TABLE IF EXISTS `infantil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `infantil` (
  `idInfantil` int(5) NOT NULL,
  `idProduto` int(5) NOT NULL,
  `quantidade` int(5) NOT NULL,
  PRIMARY KEY (`idInfantil`),
  KEY `idProduto` (`idProduto`),
  CONSTRAINT `infantil_ibfk_1` FOREIGN KEY (`idProduto`) REFERENCES `produtos` (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `infantil`
--

LOCK TABLES `infantil` WRITE;
/*!40000 ALTER TABLE `infantil` DISABLE KEYS */;
/*!40000 ALTER TABLE `infantil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfumaria`
--

DROP TABLE IF EXISTS `perfumaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `perfumaria` (
  `idPerfumaria` int(5) NOT NULL,
  `idProduto` int(5) NOT NULL,
  `quantidade` int(5) NOT NULL,
  PRIMARY KEY (`idPerfumaria`),
  KEY `idProduto` (`idProduto`),
  CONSTRAINT `perfumaria_ibfk_1` FOREIGN KEY (`idProduto`) REFERENCES `produtos` (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfumaria`
--

LOCK TABLES `perfumaria` WRITE;
/*!40000 ALTER TABLE `perfumaria` DISABLE KEYS */;
/*!40000 ALTER TABLE `perfumaria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `produtos` (
  `idProduto` int(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `remedios`
--

DROP TABLE IF EXISTS `remedios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `remedios` (
  `idRemedios` int(5) NOT NULL,
  `idProduto` int(5) NOT NULL,
  `quantidade` int(5) NOT NULL,
  `tipoRemedio` varchar(50) NOT NULL,
  `prescricao` varchar(50) NOT NULL,
  PRIMARY KEY (`idRemedios`),
  KEY `idProduto` (`idProduto`),
  CONSTRAINT `remedios_ibfk_1` FOREIGN KEY (`idProduto`) REFERENCES `produtos` (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `remedios`
--

LOCK TABLES `remedios` WRITE;
/*!40000 ALTER TABLE `remedios` DISABLE KEYS */;
/*!40000 ALTER TABLE `remedios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-08  3:15:34
