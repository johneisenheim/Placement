/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.Account;
import it.unisa.tp.model.interfaces.ClaimStatus;
import it.unisa.tp.model.interfaces.Department;
import it.unisa.tp.model.interfaces.FisicPerson;
import it.unisa.tp.model.interfaces.Student;
import it.unisa.tp.model.interfaces.StudentStatus;

/**
 *
 * @author albamansillacoca
 */
public class ConcreteStudent implements Student{
    
    private String SerialNumber;
    private String coverLetter;
    private String yearEnrollment;
    private String cycle;
    private String universityEmail;
    private Account FKAccount;
    private FisicPerson FKFisicAccount;
    private Department FKDepartment;
    private StudentStatus FKStudentStatus;
    private ClaimStatus FKClaimStatus;
    
    public ConcreteStudent(String SerialNumber, String coverLetter, String yearEnrollment, String cycle, String universityEmail,
            Account FKAccount, FisicPerson FKFisicPerson, Department FKDepartment, StudentStatus FKStudentStatus, ClaimStatus FKClaimStatus){
        
        this.SerialNumber=SerialNumber;
        this.coverLetter=coverLetter;
        this.yearEnrollment=yearEnrollment;
        this.cycle=cycle;
        this.universityEmail=universityEmail;
        this.FKAccount=FKAccount;
        this.FKFisicAccount=FKFisicPerson;
        this.FKDepartment=FKDepartment;
        this.FKStudentStatus=FKStudentStatus;
        this.FKClaimStatus=FKClaimStatus;
    }
    
    public ConcreteStudent(){
        
    }

    @Override
    public String getPrimaryKey() {
        return SerialNumber;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        this.SerialNumber=primaryKey;
    }

    /**
     * @return the SerialNumber
     */
    public String getSerialNumber() {
        return SerialNumber;
    }

    /**
     * @param SerialNumber the SerialNumber to set
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * @return the coverLetter
     */
    public String getCoverLetter() {
        return coverLetter;
    }

    /**
     * @param coverLetter the coverLetter to set
     */
    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    /**
     * @return the yearEnrollment
     */
    public String getYearEnrollment() {
        return yearEnrollment;
    }

    /**
     * @param yearEnrollment the yearEnrollment to set
     */
    public void setYearEnrollment(String yearEnrollment) {
        this.yearEnrollment = yearEnrollment;
    }

    /**
     * @return the cycle
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * @param cycle the cycle to set
     */
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    /**
     * @return the universityEmail
     */
    public String getUniversityEmail() {
        return universityEmail;
    }

    /**
     * @param universityEmail the universityEmail to set
     */
    public void setUniversityEmail(String universityEmail) {
        this.universityEmail = universityEmail;
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
     * @return the FKFisicAccount
     */
    public FisicPerson getFKFisicAccount() {
        return FKFisicAccount;
    }

    /**
     * @param FKFisicAccount the FKFisicAccount to set
     */
    public void setFKFisicAccount(FisicPerson FKFisicAccount) {
        this.FKFisicAccount = FKFisicAccount;
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
     * @return the FKStudentStatus
     */
    public StudentStatus getFKStudentStatus() {
        return FKStudentStatus;
    }

    /**
     * @param FKStudentStatus the FKStudentStatus to set
     */
    public void setFKStudentStatus(StudentStatus FKStudentStatus) {
        this.FKStudentStatus = FKStudentStatus;
    }

    /**
     * @return the FKClaimStatus
     */
    public ClaimStatus getFKClaimStatus() {
        return FKClaimStatus;
    }

    /**
     * @param FKClaimStatus the FKClaimStatus to set
     */
    public void setFKClaimStatus(ClaimStatus FKClaimStatus) {
        this.FKClaimStatus = FKClaimStatus;
    }
    
    public String toString(){
        return ("SerialNumber: \n"+SerialNumber+"coverLetter: \n"+coverLetter+"YearEnrollment: \n"+yearEnrollment+
                "cycle: \n"+cycle+"UniversityEmail: \n"+universityEmail+"FKAccount: \n"+FKAccount+"FKFisicPerson:\n"+FKFisicAccount
                +"FKDepartment: \n"+FKDepartment+"FKStudentStatus:\n"+FKStudentStatus+"FKClaimStatus:\n"+FKClaimStatus);
    }
    
}
