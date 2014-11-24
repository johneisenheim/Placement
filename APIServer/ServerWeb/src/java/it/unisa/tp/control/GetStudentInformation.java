/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tp.control;

import it.unisa.tp.model.concrete.ConcreteAccount;
import it.unisa.tp.model.concrete.ConcretePermissions;
import it.unisa.tp.model.concrete.ConcreteStudent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author katiasolomita
 */
public class GetStudentInformation {
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




    private Connection aConnection;
    
    public GetStudentInformation() throws ClassNotFoundException, SQLException, IOException {
        aConnection = DBConnection.connect();
    }

    public ConcreteStudent authenticate(int FK_Account) throws SQLException  {
        int rsResult = 0;
        ConcreteStudent loggedStudent = new ConcreteStudent();
        Statement aStatement = aConnection.createStatement();
        String query = "select * from Student where = FK_Account" ;
        ResultSet rs = aStatement.executeQuery(query);
        while (rs.next()) {
            rsResult++;
            loggedStudent.setPrimaryKey(rs.getNString(1));
            loggedStudent.setCoverLetter(rs.getString(2));
            loggedStudent.setYearEnrollment(rs.getString(3));
            loggedStudent.setUniversityEmail(rs.getNString(4));
            loggedStudent.setFKAccount(FK_Account);
            loggedStudent.setFKFisicPerson(rs.getInt(6));
            loggedStudent.setFKDepartment(rs.getInt(7));
            loggedStudent.setFKStudentStatus(rs.getInt(8));
            loggedStudent.setFKClaimTraining(rs.getInt(9));
            loggedStudent.setFKSerialNumber(rs.getNString(10));
            loggedStudent.setFKidStudentInformation(rs.getInt(11));
            loggedStudent.setFKRejectedTrainingMessage(rs.getNString(12));
            aConnection.close();
            
        }
        if (rsResult == 0) {
            return null;
        } else {
            return loggedStudent;
        }
        
    }
    
    /**
     * This method is used to load from DB the permission associated to the idAccount  
     * @param permissionId
     * @return
     * @throws SQLException 
     */
    private ConcretePermissions getAccountPermission(int permissionId) throws SQLException{
        ConcretePermissions aPermission = new ConcretePermissions();
        Statement aStatement = aConnection.createStatement();
        String query = "SELECT * from Permissions WHERE idPermissions="+permissionId;
        ResultSet rs = aStatement.executeQuery(query);
        while(rs.next()){
            aPermission.setPrimaryKey(rs.getInt(1));
            aPermission.setDescription(rs.getString(2));
            aPermission.setClassPermission(rs.getString(3));
        }
        return aPermission; 
    }

}                   
