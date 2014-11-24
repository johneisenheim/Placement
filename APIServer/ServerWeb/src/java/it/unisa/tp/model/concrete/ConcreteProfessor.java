/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.Account;
import it.unisa.tp.model.interfaces.Department;
import it.unisa.tp.model.interfaces.FisicPerson;
import it.unisa.tp.model.interfaces.Professor;

/**
 *
 * @author albamansillacoca
 */
public class ConcreteProfessor implements Professor{
    
    private int idProfessor;
    private String position;
    private String officePhoneNum;
    private String officeHours;
    private String officeEmail;
    private Account FKAccount;
    private FisicPerson FKFisicPerson;
    private Department FKDepartment;
    
    public ConcreteProfessor(int idProfessor, String position, String officePhoneNum, String officeHours,
            String officeEmail, Account FKAccount, FisicPerson FKFisicPerson, Department FKDepartment){
        this.idProfessor=idProfessor;
        this.position=position;
        this.officePhoneNum=officePhoneNum;
        this.officeHours=officeHours;
        this.officeEmail=officeEmail;
        this.FKAccount=FKAccount;
        this.FKFisicPerson=FKFisicPerson;
        this.FKDepartment=FKDepartment;
    }
    
    public ConcreteProfessor(){
    }

    @Override
    public int getPrimaryKey() {
        return this.idProfessor;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        this.idProfessor=primaryKey;
    }

    /**
     * @return the idProfessor
     */
    public int getIdProfessor() {
        return idProfessor;
    }

    /**
     * @param idProfessor the idProfessor to set
     */
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
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
     * @return the officeHours
     */
    public String getOfficeHours() {
        return officeHours;
    }

    /**
     * @param officeHours the officeHours to set
     */
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    /**
     * @return the officeEmail
     */
    public String getOfficeEmail() {
        return officeEmail;
    }

    /**
     * @param officeEmail the officeEmail to set
     */
    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail;
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
    
    public String toString(){
        return ("IDProfessor: \n"+idProfessor+"Position \n"+position
                +"OfficePhoneNumber: \n"+officePhoneNum+"OfficeHours: \n"+officeHours+"OfficeEmail: \n"+officeEmail+"FKAccount: \n"+FKAccount
                +"FKFisic Person:\n"+FKFisicPerson+"FKDepartment: \n"+FKDepartment);
    }
    
    }
