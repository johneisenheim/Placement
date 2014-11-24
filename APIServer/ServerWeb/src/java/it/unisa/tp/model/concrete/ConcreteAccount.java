package it.unisa.tp.model.concrete;


import it.unisa.tp.model.interfaces.Account;
import it.unisa.tp.model.interfaces.Permissions;





public class ConcreteAccount implements Account{


    private int idAccount;
    private String userName;
    private String password;
    private String typeOfAccount;
    private Permissions FKPermission;
    
    public ConcreteAccount(int idAccount, String unserName, String password, String typeOfAccount, Permissions FKPermission) {
        this.idAccount = idAccount;
        this.userName = unserName;
        this.password = password;
        this.typeOfAccount = typeOfAccount;
        this.FKPermission = FKPermission;
    }

    public ConcreteAccount(){
        
    }
    @Override
    public int getPrimaryKey() {
        return this.idAccount;
        
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        this.idAccount= primaryKey;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String unserName) {
        this.userName = unserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public Permissions getFKPermission() {
        return FKPermission;
    }

    public void setFKPermission(Permissions FKPermission) {
        this.FKPermission = FKPermission;
    }
    
    public String toString(){
        return ("IDAccount: \n"+idAccount+"UserName: \n"+unserName+"Password: \n"+password+
                "TypeOfAccount: \n"+typeOfAccount+"Permissions: \n"+FKPermission);
    }
    
}
