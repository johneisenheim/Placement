/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tp.control;

import it.unisa.tp.model.concrete.ConcreteAccount;
import it.unisa.tp.model.concrete.ConcreteFisicPerson;
import it.unisa.tp.model.concrete.ConcretePermissions;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author katiasolomita
 */
public class FisicPersonInformation {



    private Connection aConnection;
    
    public FisicPersonInformation() throws ClassNotFoundException, SQLException, IOException {
        aConnection = DBConnection.connect();
    }

    public ConcreteFisicPerson getFisicPersonInformation(int idFisicPerson) throws SQLException  {
        int rsResult = 0;
        ConcreteFisicPerson loggedFisicPerson = new ConcreteFisicPerson();
        Statement aStatement = aConnection.createStatement();
        String query = "select * from FisicPerson where idFisicPerson='" + idFisicPerson;
        ResultSet rs = aStatement.executeQuery(query);
        while (rs.next()) {
            rsResult++;
            loggedFisicPerson.setPrimaryKey(rs.getInt(1));
            
            
        }
            aConnection.close();
        
            return loggedFisicPerson;
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


