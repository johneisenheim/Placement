
import it.unisa.tp.control.AuthenticateUser;
import it.unisa.tp.control.DBConnection;
import it.unisa.tp.control.UploadInformationFiles;
import it.unisa.tp.model.concrete.ConcreteAccount;
import it.unisa.tp.model.concrete.ConcretePermissions;
import java.io.IOException;
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
         try {
             UploadInformationFiles upload = new UploadInformationFiles();
             upload.UploadFilesPathToDB("provacv", "provaAT", "1");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }
}
