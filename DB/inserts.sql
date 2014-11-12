DELETE FROM `mydb`.`Permissions` WHERE `idPermissions`='1';
INSERT INTO `mydb`.`Permissions` (`idPermissions`, `description`, `class`) VALUES ('1', 'L\'utente ha la tutti i permessi su tutti i sistemi', 'rwmd-rwmd-rwmd-rwmd');
INSERT INTO `mydb`.`Account` (`idAccount`, `userName`, `password`, `typeOfAccount`, `FK_permission`) VALUES ('1', 'pippo', 'paperino', 'student', '1');
