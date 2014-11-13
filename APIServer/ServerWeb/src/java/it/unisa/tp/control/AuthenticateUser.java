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
import java.io.IOException;

/**
 *
 * @author carlosborges
 */
public class AuthenticateUser {

    public AuthenticateUser() {
    }

    public ConcreteAccount authenticate(String userName, String password) throws SQLException, ClassNotFoundException, IOException {
        int rsResult = 0;
        ConcreteAccount loggedAccount = new ConcreteAccount();
        Connection aConnection = DBConnection.connect();
        Statement aStatement = aConnection.createStatement();
        String query = "select * from Account where userName='" + userName + "' and password='" + password + "'";
        ResultSet rs = aStatement.executeQuery(query);
        while (rs.next()) {
            rsResult++;
            loggedAccount.setPrimaryKey(rs.getInt(1));
            loggedAccount.setUnserName(rs.getString(2));
            loggedAccount.setTypeOfAccount(rs.getString(4));
        }
        if (rsResult == 0) {
            return null;
        } else {
            return loggedAccount;
        }
    }

}
