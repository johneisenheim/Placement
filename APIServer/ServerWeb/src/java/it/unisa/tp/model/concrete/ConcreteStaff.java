/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.Staff;

/**
 *
 * @author albamansillacoca
 */
public class ConcreteStaff implements Staff{
    
    private int idStaff;
    private String officePhoneNum;
    private String officeMail;
    
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
    
    public String toString(){
        return ("IDStaff: \n"+idStaff
                +"OfficePhoneNumber: \n"+officePhoneNum+"OfficeEmail: \n"+officeMail);
    }
    
}
