/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tp.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import it.unisa.tp.model.concrete.ConcreteAccount;
import it.unisa.tp.model.interfaces.Account;

/**
 *
 * @author carlosborges
 */
public class AuthenticateUser {
    
    private ConcreteAccount anAccount = null;
    
    public AuthenticateUser(Account anAccount){
        this.anAccount = (ConcreteAccount)anAccount;
    }
    
    public boolean authenticate() throws SQLException{
        int rsResult=0;
        try {
            Class.forName ( "com.mysql.jdbc.Driver" );
            Connection aConnection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/mydb","root","root");
            Statement aStatement = aConnection.createStatement ();
            String query = "select * from Account where userName='"+this.anAccount.getUnserName()+"' and password='"+this.anAccount.getPassword()+"'";
            ResultSet rs = aStatement.executeQuery(query);
            while(rs.next()){
                rsResult++;
            }
            
            if(rsResult == 0)
                return false;
            return true;
            
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    
    
}
