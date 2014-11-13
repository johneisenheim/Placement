/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.Account;
import it.unisa.tp.model.interfaces.Department;
import it.unisa.tp.model.interfaces.FisicPerson;
import it.unisa.tp.model.interfaces.Staff;

/**
 *
 * @author albamansillacoca
 */
public class ConcreteStaff implements Staff{
    
    private int idStaff;
    private String officePhoneNum;
    private String officeMail;
    private Department FKDepartment;
    private Account FKAccount;
    private FisicPerson FKFisicPerson;
    
    
    public ConcreteStaff(int idStaff, String officePhoneNum, String officeMail){
        this.idStaff=idStaff;
        this.officeMail=officeMail;
        this.officePhoneNum=officePhoneNum;
    }
    
    public ConcreteStaff(){
        
    }

    @Override
    public int getPrimaryKey() {
        return getIdStaff();
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        this.setIdStaff(primaryKey);
    }

    /**
     * @return the idStaff
     */
    public int getIdStaff() {
        return idStaff;
    }

    /**
     * @param idStaff the idStaff to set
     */
    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    /**
     * @return the officePhoneNum
     */
    public String getOfficePhoneNum() {
        return officePhoneNum;
    }

    /**
     * @param officePhoneNum the officePhoneNum to set
     */
    public void setOfficePhoneNum(String officePhoneNum) {
        this.officePhoneNum = officePhoneNum;
    }

    /**
     * @return the officeMail
     */
    public String getOfficeMail() {
        return officeMail;
    }

    /**
     * @param officeMail the officeMail to set
     */
    public void setOfficeMail(String officeMail) {
        this.officeMail = officeMail;
    }
    
    /**
     * @return the FKDepartment
     */
    public Department getFKDepartment() {
        return FKDepartment;
    }

    /**
     * @param FKDepartment the FKDepartment to set
     */
    public void setFKDepartment(Department FKDepartment) {
        this.FKDepartment = FKDepartment;
    }

    /**
     * @return the FKAccount
     */
    public Account getFKAccount() {
        return FKAccount;
    }

    /**
     * @param FKAccount the FKAccount to set
     */
    public void setFKAccount(Account FKAccount) {
        this.FKAccount = FKAccount;
    }

    /**
     * @return the FKFisicPerson
     */
    public FisicPerson getFKFisicPerson() {
        return FKFisicPerson;
    }

    /**
     * @param FKFisicPerson the FKFisicPerson to set
     */
    public void setFKFisicPerson(FisicPerson FKFisicPerson) {
        this.FKFisicPerson = FKFisicPerson;
    }
    
    
    public String toString(){
        return ("IDStaff: \n"+idStaff+"OfficePhoneNumber: \n"+officePhoneNum+"OfficeEmail: \n"+officeMail+
                "FisicPerson: \n"+FKFisicPerson+"FKAccount: \n"+FKAccount+"FKDepartment: \n"+FKDepartment);
    }

    
}
