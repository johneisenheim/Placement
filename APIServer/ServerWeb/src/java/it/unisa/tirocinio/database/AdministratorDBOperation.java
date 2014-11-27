/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tirocinio.database;

import it.unisa.integrazione.database.DBConnection;
import it.unisa.integrazione.manager.concrete.*;
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
public class AdministratorDBOperation {

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    private Connection aConnection;

    public AdministratorDBOperation() throws ClassNotFoundException, SQLException, IOException {
        aConnection = DBConnection.connect();
    }

    /**
     * 
     * @param FK_Account
     * @return
     * @throws SQLException
     */
    public ConcreteStaff getInformationbyFK_Account(int FK_Account) throws SQLException {
        ConcreteStaff aAdmin = new ConcreteStaff();
        Statement aStatement = aConnection.createStatement();
        String query = "select * from Staff where FK_Account = '" + FK_Account + "'";
        ResultSet rs = aStatement.executeQuery(query);
        while (rs.next()) {
            aAdmin.setIdStaff(rs.getInt(1));
            aAdmin.setOfficePhoneNum(rs.getString(2));
            aAdmin.setOfficeMail(rs.getString(3));
            aAdmin.setFKDepartment(rs.getInt(4));
            aAdmin.setFKAccount(rs.getInt(5));
            aAdmin.setFKFisicPerson(rs.getInt(6));
        }        
        aConnection.close();
        return aAdmin;
    }

    /**
     *
     * @param PrimaryKey
     * @return
     * @throws SQLException
     */
    public ConcreteStaff getInformationbyPrimaryKey(String PrimaryKey) throws SQLException, ClassNotFoundException, IOException {
        aConnection = DBConnection.connect();
        ConcreteStaff aAdmin = new ConcreteStaff();
        Statement aStatement = aConnection.createStatement();
        String query = "select * from Staff where idStaff = '" + PrimaryKey + "'";
        ResultSet rs = aStatement.executeQuery(query);
        while (rs.next()) {
            aAdmin.setIdStaff(rs.getInt(1));
            aAdmin.setOfficePhoneNum(rs.getString(2));
            aAdmin.setOfficeMail(rs.getString(3));
            aAdmin.setFKDepartment(rs.getInt(4));
            aAdmin.setFKAccount(rs.getInt(5));
            aAdmin.setFKFisicPerson(rs.getInt(6));
        }
        aConnection.close();
        return aAdmin;
    }
    
    
    /**
     *
     * @param FK_Account
     * @return
     * @throws SQLException
     */
    public ConcreteStaff getFK_DepartimentbyFK_Account(int FK_Account) throws SQLException {
        ConcreteStaff aAdmin = new ConcreteStaff();
        Statement aStatement = aConnection.createStatement();
        String query = "select FK_Departiment from Staff where FK_Account = '" + FK_Account + "'";
        ResultSet rs = aStatement.executeQuery(query);
        while (rs.next()) {
            aAdmin.setPrimaryKey(rs.getInt(6));
        }
        aConnection.close();
        return aAdmin;
    }
    
}
