INSERT INTO `mydb`.`Permissions` (`idPermissions`, `description`, `class`) VALUES ('1', 'L\'utente ha la tutti i permessi su tutti i sistemi', '1-1-1-1-1');
INSERT INTO `mydb`.`Account` (`idAccount`, `userName`, `password`, `typeOfAccount`, `FK_permission`) VALUES ('1', 'pippo', 'paperino', 'student', '1');
UPDATE `mydb`.`Department` SET `description`='DISTRA' WHERE `idDepartment`='1';
INSERT INTO `mydb`.`FisicPerson` (`idFisicPerson`, `name`, `lastName`, `phoneNum`, `city`, `address`, `CAP`, `sex`, `citizenship`, `CF`) VALUES ('1', 'Valentio(PJ)', 'Vivone', '33135352', 'Battipaglia', 'Viale dei PJ', '89040', 'M', 'Italiano', 'SFAK231mKN');
INSERT INTO `mydb`.`Student` (`serialNumber`, `yearEnrollment`, `cycle`, `universityEmail`, `FK_Account`, `FK_FisicPerson`, `FK_Department`) VALUES ('1', '2008', 'Magistrale', 'v.vivone.pj@studenti.unisa.it', '1', '1', '1');
INSERT INTO `mydb`.`StudentInformation` (`idStudentInformation`, `CurriculumVitaePATH`, `AccademicTranscriptPATH`) VALUES ('1', 'c:\\usr\\utenti\\platform\\1100052200\\cv.pdf', 'c:\\usr\\utenti\\platform\\1100052200\\AT.pdf');
INSERT INTO `mydb`.`StudentAttendence` (`SerialNum`, `Date`, `FK_Student`) VALUES ('1', '2015/12/01', '1');
UPDATE `mydb`.`Student` SET `FK_StudentStatus`='2', `FK_idStudentInformation`='1' WHERE `serialNumber`='1';




