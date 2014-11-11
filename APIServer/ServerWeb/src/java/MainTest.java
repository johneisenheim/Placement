
import it.unisa.tp.control.AuthenticateUser;
import it.unisa.tp.model.concrete.ConcreteAccount;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author carlosborges
 */
public class MainTest {
    
     public static void main(String[] args) {
        ConcreteAccount anAccount = new ConcreteAccount();
        anAccount.setUnserName("username");
        anAccount.setPassword("password");

    }
}
