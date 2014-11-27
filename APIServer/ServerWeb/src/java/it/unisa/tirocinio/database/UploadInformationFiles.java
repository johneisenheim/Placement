/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tirocinio.database;

import it.unisa.integrazione.database.DBConnection;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author carlosborges
 */
public class UploadInformationFiles {
    
    private final Connection aConnection;
    
    public UploadInformationFiles() throws ClassNotFoundException, SQLException, IOException{
        aConnection = DBConnection.connect();
    }
    
    /**
     * This method call the db store procedure storeUploadFile to save the 
     * path into db
     * @param cvPath
     * @param ATPath
     * @param StudentSerialNumber
     * @throws java.sql.SQLException
     */
    public void UploadFilesPathToDB(String cvPath, String ATPath, String StudentSerialNumber) throws SQLException{
        CallableStatement pcUpload = aConnection.prepareCall("{call storeUploadFile(?, ?,?)}");//Prepare a call to the stored procedure storeUploadFile
        pcUpload.setString("CVPath", cvPath);
        pcUpload.setString("ATPath", ATPath);
        pcUpload.setString("serialNumber", StudentSerialNumber);
        pcUpload.execute();
        pcUpload.close();
        aConnection.close();
        
    }
    
    
}
