INSERT INTO `mydb`.`Permissions` (`idPermissions`, `description`, `class`) VALUES ('1', 'L\'utente ha la tutti i permessi su tutti i sistemi', 'rwmd-rwmd-rwmd-rwmd');
INSERT INTO `mydb`.`Account` (`idAccount`, `userName`, `password`, `typeOfAccount`, `FK_permission`) VALUES ('1', 'pippo', 'paperino', 'student', '1');
INSERT INTO `mydb`.`StudentStatus` (`idStudentStatus`, `description`) VALUES ('1', 'Non richiesto');
INSERT INTO `mydb`.`StudentStatus` (`idStudentStatus`, `description`) VALUES ('2', 'In attesa di conferma');
INSERT INTO `mydb`.`StudentStatus` (`idStudentStatus`, `description`) VALUES ('3', 'Accettato');
INSERT INTO `mydb`.`FisicPerson` (`idFisicPerson`, `name`, `lastName`) VALUES ('1', 'Valentino', 'Piglianculo');
INSERT INTO `mydb`.`Department` (`idDepartment`) VALUES ('1');
INSERT INTO `mydb`.`Student` (`serialNumber`, `FK_Account`, `FK_FisicPerson`, `FK_Department`, `FK_StudentStatus`) VALUES ('1', '1', '1', '1', '1');




