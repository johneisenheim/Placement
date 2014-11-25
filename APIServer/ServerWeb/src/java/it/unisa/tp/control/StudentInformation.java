/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tp.control;


import it.unisa.tp.model.concrete.ConcreteStudent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author katiasolomita
 */
public class StudentInformation {

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    private final Connection aConnection;

    public StudentInformation() throws ClassNotFoundException, SQLException, IOException {
        aConnection = DBConnection.connect();
    }

    /**
     * 
     * @param FK_Account
     * @return
     * @throws SQLException 
     */
    public ConcreteStudent getInformationbyFK_Account(int FK_Account) throws SQLException {
        int rsResult = 0;
        ConcreteStudent loggedStudent = new ConcreteStudent();
        Statement aStatement = aConnection.createStatement();
        String query = "select * from Student where FK_Account = '" + FK_Account + "'";
        ResultSet rs = aStatement.executeQuery(query);
        while (rs.next()) {
            rsResult++;
            loggedStudent.setPrimaryKey(rs.getString(1));
            loggedStudent.setCoverLetter(rs.getString(2));
            loggedStudent.setYearEnrollment(rs.getString(3));
            loggedStudent.setUniversityEmail(rs.getString(4));
            loggedStudent.setFKAccount(FK_Account);
            loggedStudent.setFKFisicPerson(rs.getInt(6));
            loggedStudent.setFKDepartment(rs.getInt(7));
            loggedStudent.setFKStudentStatus(rs.getInt(8));
            loggedStudent.setFKClaimTraining(rs.getInt(9));
            loggedStudent.setFKSerialNumber(rs.getString(10));
            loggedStudent.setFKidStudentInformation(rs.getInt(11));
            loggedStudent.setFKRejectedTrainingMessage(rs.getString(12));

        }
        aConnection.close();
        return loggedStudent;

    }

     /**
     * 
     * @param PrimaryKey
     * @return
     * @throws SQLException 
     */
    public ConcreteStudent getInformationbyPrimaryKey(String PrimaryKey) throws SQLException {
        int rsResult = 0;
        ConcreteStudent loggedStudent = new ConcreteStudent();
        Statement aStatement = aConnection.createStatement();
        String query = "select * from Student where FK_Account = '" + PrimaryKey + "'";
        ResultSet rs = aStatement.executeQuery(query);
        while (rs.next()) {
            rsResult++;
            loggedStudent.setPrimaryKey(rs.getString(1));
            loggedStudent.setCoverLetter(rs.getString(2));
            loggedStudent.setYearEnrollment(rs.getString(3));
            loggedStudent.setUniversityEmail(rs.getString(4));
            loggedStudent.setFKAccount(rs.getInt(5));
            loggedStudent.setFKFisicPerson(rs.getInt(6));
            loggedStudent.setFKDepartment(rs.getInt(7));
            loggedStudent.setFKStudentStatus(rs.getInt(8));
            loggedStudent.setFKClaimTraining(rs.getInt(9));
            loggedStudent.setFKSerialNumber(rs.getString(10));
            loggedStudent.setFKidStudentInformation(rs.getInt(11));
            loggedStudent.setFKRejectedTrainingMessage(rs.getString(12));

        }
        aConnection.close();
        return loggedStudent;

    }

 
}
