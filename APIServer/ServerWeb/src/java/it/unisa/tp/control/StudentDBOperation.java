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
import java.util.GregorianCalendar;

/**
 *
 * @author katiasolomita
 */
public class StudentDBOperation {

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    private final Connection aConnection;

    public StudentDBOperation() throws ClassNotFoundException, SQLException, IOException {
        aConnection = DBConnection.connect();
    }

    /**
     *
     * @param FK_Account
     * @return
     * @throws SQLException
     */
    public ConcreteStudent getInformationbyFK_Account(int FK_Account) throws SQLException {
        ConcreteStudent loggedStudent = new ConcreteStudent();
        Statement aStatement = aConnection.createStatement();
        GregorianCalendar cal = new GregorianCalendar();
        String query = "select * from Student where FK_Account = '" + FK_Account + "'";
        ResultSet rs = aStatement.executeQuery(query);
        while (rs.next()) {
            loggedStudent.setPrimaryKey(rs.getString(1));
            loggedStudent.setCoverLetter(rs.getString(2));
            cal.setTime(rs.getDate(3));
            loggedStudent.setYearEnrollment(cal);
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
        ConcreteStudent aStudent = new ConcreteStudent();
        Statement aStatement = aConnection.createStatement();
        GregorianCalendar cal = new GregorianCalendar();
        String query = "select * from Student where FK_Account = '" + PrimaryKey + "'";
        ResultSet rs = aStatement.executeQuery(query);
        while (rs.next()) {
            aStudent.setPrimaryKey(rs.getString(1));
            aStudent.setCoverLetter(rs.getString(2));
            cal.setTime(rs.getDate(3));
            aStudent.setYearEnrollment(cal);
            aStudent.setCycle(rs.getInt(4));
            aStudent.setUniversityEmail(rs.getString(5));
            aStudent.setFKAccount(rs.getInt(6));
            aStudent.setFKFisicPerson(rs.getInt(7));
            aStudent.setFKDepartment(rs.getInt(8));
            aStudent.setFKStudentStatus(rs.getInt(9));
            aStudent.setFKClaimTraining(rs.getInt(10));
            aStudent.setFKidStudentInformation(rs.getInt(12));

        }
        aConnection.close();
        return aStudent;

    }

}
