SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Permissions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Permissions` (
  `idPermissions` INT NOT NULL,
  `description` VARCHAR(45) NULL,
  `class` VARCHAR(45) NULL,
  PRIMARY KEY (`idPermissions`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Account` (
  `idAccount` BIGINT NOT NULL COMMENT 'Identificativo univoco per qualsiasi utente si voglia loggare al sistema',
  `userName` VARCHAR(45) NOT NULL COMMENT 'Nome con il quale l\'utente viene riconosciuto da un',
  `password` VARCHAR(45) NOT NULL,
  `typeOfAccount` VARCHAR(45) NULL,
  `FK_permission` INT NOT NULL,
  PRIMARY KEY (`idAccount`),
  INDEX `fk_Account_Permissions_idx` (`FK_permission` ASC),
  CONSTRAINT `fk_Account_Permissions`
    FOREIGN KEY (`FK_permission`)
    REFERENCES `mydb`.`Permissions` (`idPermissions`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
COMMENT = 'Tabella adibita alla gestione dei dati principali per l\'aces /* comment truncated */ /*so al sistema*/';


-- -----------------------------------------------------
-- Table `mydb`.`Department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Department` (
  `idDepartment` INT NOT NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`idDepartment`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`FisicPerson`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`FisicPerson` (
  `idFisicPerson` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `phoneNum` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `CAP` VARCHAR(45) NULL,
  `sex` CHAR NULL,
  `citizenship` VARCHAR(45) NULL,
  `CF` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`idFisicPerson`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`StudentStatus`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`StudentStatus` (
  `idStudentStatus` INT NOT NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`idStudentStatus`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Student` (
  `serialNumber` VARCHAR(45) NOT NULL,
  `coverLetter` LONGTEXT NULL,
  `yearEnrollment` DATE NULL,
  `cycle` INT NULL,
  `universityEmail` VARCHAR(45) NULL,
  `FK_Account` BIGINT NOT NULL,
  `FK_FisicPerson` INT NOT NULL,
  `FK_Department` INT NOT NULL,
  `FK_StudentStatus` INT NOT NULL,
  PRIMARY KEY (`serialNumber`),
  INDEX `fk_Student_Account1_idx` (`FK_Account` ASC),
  INDEX `fk_Student_Department1_idx` (`FK_Department` ASC),
  INDEX `fk_Student_FisicPerson1_idx` (`FK_FisicPerson` ASC),
  INDEX `fk_Student_StudentStatus1_idx` (`FK_StudentStatus` ASC),
  CONSTRAINT `fk_Student_Account1`
    FOREIGN KEY (`FK_Account`)
    REFERENCES `mydb`.`Account` (`idAccount`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Student_Department1`
    FOREIGN KEY (`FK_Department`)
    REFERENCES `mydb`.`Department` (`idDepartment`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Student_FisicPerson1`
    FOREIGN KEY (`FK_FisicPerson`)
    REFERENCES `mydb`.`FisicPerson` (`idFisicPerson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Student_StudentStatus1`
    FOREIGN KEY (`FK_StudentStatus`)
    REFERENCES `mydb`.`StudentStatus` (`idStudentStatus`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Professor` (
  `idProfessor` INT NOT NULL,
  `position` VARCHAR(45) NULL,
  `officePhoneNum` VARCHAR(45) NULL,
  `officeHours` VARCHAR(45) NULL,
  `officeEmail` VARCHAR(45) NULL,
  `FK_Account` BIGINT NOT NULL,
  `FK_FisicPerson` INT NOT NULL,
  `FK_Department` INT NOT NULL,
  PRIMARY KEY (`idProfessor`),
  INDEX `fk_Professor_Account1_idx` (`FK_Account` ASC),
  INDEX `fk_Professor_FisicPerson1_idx` (`FK_FisicPerson` ASC),
  INDEX `fk_Professor_Department1_idx` (`FK_Department` ASC),
  CONSTRAINT `fk_Professor_Account1`
    FOREIGN KEY (`FK_Account`)
    REFERENCES `mydb`.`Account` (`idAccount`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Professor_FisicPerson1`
    FOREIGN KEY (`FK_FisicPerson`)
    REFERENCES `mydb`.`FisicPerson` (`idFisicPerson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Professor_Department1`
    FOREIGN KEY (`FK_Department`)
    REFERENCES `mydb`.`Department` (`idDepartment`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Staff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Staff` (
  `idStaff` INT NOT NULL,
  `officePhoneNum` VARCHAR(45) NULL,
  `officeEmail` VARCHAR(45) NULL,
  `FK_Department` INT NOT NULL,
  `FK_Account` BIGINT NOT NULL,
  `FK_FisicPerson` INT NOT NULL,
  PRIMARY KEY (`idStaff`),
  INDEX `fk_Staff_Department1_idx` (`FK_Department` ASC),
  INDEX `fk_Staff_Account1_idx` (`FK_Account` ASC),
  INDEX `fk_Staff_FisicPerson1_idx` (`FK_FisicPerson` ASC),
  CONSTRAINT `fk_Staff_Department1`
    FOREIGN KEY (`FK_Department`)
    REFERENCES `mydb`.`Department` (`idDepartment`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Staff_Account1`
    FOREIGN KEY (`FK_Account`)
    REFERENCES `mydb`.`Account` (`idAccount`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Staff_FisicPerson1`
    FOREIGN KEY (`FK_FisicPerson`)
    REFERENCES `mydb`.`FisicPerson` (`idFisicPerson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Organization`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Organization` (
  `idOrganization` INT NOT NULL,
  `companyName` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `FK_Account` BIGINT NOT NULL,
  `FK_FisicPerson` INT NOT NULL,
  PRIMARY KEY (`idOrganization`),
  INDEX `fk_Organization_Account1_idx` (`FK_Account` ASC),
  INDEX `fk_Organization_FisicPerson1_idx` (`FK_FisicPerson` ASC),
  CONSTRAINT `fk_Organization_Account1`
    FOREIGN KEY (`FK_Account`)
    REFERENCES `mydb`.`Account` (`idAccount`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Organization_FisicPerson1`
    FOREIGN KEY (`FK_FisicPerson`)
    REFERENCES `mydb`.`FisicPerson` (`idFisicPerson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`OfferTraining`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`OfferTraining` (
  `idOfferTraining` INT NOT NULL,
  `title` VARCHAR(45) NULL,
  `status` VARCHAR(45) NULL,
  `description` TEXT NULL,
  `date` DATE NULL,
  `FK_Professor` INT NULL,
  `FK_Organization` INT NULL,
  PRIMARY KEY (`idOfferTraining`),
  INDEX `fk_OfferTraining_Professor1_idx` (`FK_Professor` ASC),
  INDEX `fk_OfferTraining_Organization1_idx` (`FK_Organization` ASC),
  CONSTRAINT `fk_OfferTraining_Professor1`
    FOREIGN KEY (`FK_Professor`)
    REFERENCES `mydb`.`Professor` (`idProfessor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_OfferTraining_Organization1`
    FOREIGN KEY (`FK_Organization`)
    REFERENCES `mydb`.`Organization` (`idOrganization`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ClaimStatus`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ClaimStatus` (
  `idClaimStatus` INT NOT NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`idClaimStatus`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ClaimTraining`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ClaimTraining` (
  `idClaimTraining` INT NOT NULL,
  `OfferTraining_idOfferTraining` INT NOT NULL,
  `ClaimStatus_idClaimStatus` INT NOT NULL,
  PRIMARY KEY (`idClaimTraining`, `OfferTraining_idOfferTraining`),
  INDEX `fk_ClaimTraining_OfferTraining1_idx` (`OfferTraining_idOfferTraining` ASC),
  INDEX `fk_ClaimTraining_ClaimStatus1_idx` (`ClaimStatus_idClaimStatus` ASC),
  CONSTRAINT `fk_ClaimTraining_OfferTraining1`
    FOREIGN KEY (`OfferTraining_idOfferTraining`)
    REFERENCES `mydb`.`OfferTraining` (`idOfferTraining`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ClaimTraining_ClaimStatus1`
    FOREIGN KEY (`ClaimStatus_idClaimStatus`)
    REFERENCES `mydb`.`ClaimStatus` (`idClaimStatus`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ClaimTraining_has_Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ClaimTraining_has_Student` (
  `ClaimTraining_idClaimTraining` INT NOT NULL,
  `Student_serialNumber` BIGINT NOT NULL,
  INDEX `fk_ClaimTraining_has_Student_Student1_idx` (`Student_serialNumber` ASC),
  INDEX `fk_ClaimTraining_has_Student_ClaimTraining1_idx` (`ClaimTraining_idClaimTraining` ASC),
  CONSTRAINT `fk_ClaimTraining_has_Student_ClaimTraining1`
    FOREIGN KEY (`ClaimTraining_idClaimTraining`)
    REFERENCES `mydb`.`ClaimTraining` (`idClaimTraining`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ClaimTraining_has_Student_Student1`
    FOREIGN KEY (`Student_serialNumber`)
    REFERENCES `mydb`.`Student` (`serialNumber`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
