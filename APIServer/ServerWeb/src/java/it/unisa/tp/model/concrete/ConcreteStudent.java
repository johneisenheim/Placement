/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unisa.tp.model.concrete;


import it.unisa.tp.model.interfaces.Student;


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
    private int FKAccount;
    private int FKFisicPerson;
    private int FKDepartment;
    private int FKStudentStatus;
    private int FKClaimStatus;
    private int FKClaimTraining;
    private String FKSerialNumber;
    private int FKidStudentInformation;
    private String FKRejectedTrainingMessage;
    
    public ConcreteStudent(String SerialNumber, String coverLetter, String yearEnrollment, String cycle, String universityEmail,
            int FKAccount, int FKFisicPerson, int FKDepartment, int FKStudentStatus, int FKClaimStatus, int FKClaimTraining, String FKSerialNumber, int FKidStudentInformation, String FKRejectedTrainingMessage){
        
        this.SerialNumber=SerialNumber;
        this.coverLetter=coverLetter;
        this.yearEnrollment=yearEnrollment;
        this.cycle=cycle;
        this.universityEmail=universityEmail;
        this.FKAccount=FKAccount;
        this.FKFisicPerson=FKFisicPerson;
        this.FKDepartment=FKDepartment;
        this.FKStudentStatus=FKStudentStatus;
        this.FKClaimStatus=FKClaimStatus;
        this.FKClaimTraining=FKClaimTraining;
        this.FKSerialNumber=FKSerialNumber;
        this.FKidStudentInformation=FKidStudentInformation;
        this.FKRejectedTrainingMessage=FKRejectedTrainingMessage;
    }
    
    public ConcreteStudent(){
        
    }

    @Override
    public String getPrimaryKey() {
        return this.SerialNumber;
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
    public int getFKAccount() {
        return FKAccount;
    }

    /**
     * @param FKAccount the FKAccount to set
     */
    public void setFKAccount(int FKAccount) {
        this.FKAccount = FKAccount;
    }

    /**
     * @return the FKFisicAccount
     */
    public int getFKFisicPerson() {
        return FKFisicPerson;
    }

    /**
     * @param FKFisicAccount the FKFisicAccount to set
     */
    public void setFKFisicPerson(int FKFisicPerson) {
        this.FKFisicPerson = FKFisicPerson;
    }

    /**
     * @return the FKDepartment
     */
    public int getFKDepartment() {
        return FKDepartment;
    }

    /**
     * @param FKDepartment the FKDepartment to set
     */
    public void setFKDepartment(int FKDepartment) {
        this.FKDepartment = FKDepartment;
    }

    /**
     * @return the FKStudentStatus
     */
    public int getFKStudentStatus() {
        return FKStudentStatus;
    }

    /**
     * @param FKStudentStatus the FKStudentStatus to set
     */
    public void setFKStudentStatus(int FKStudentStatus) {
        this.FKStudentStatus = FKStudentStatus;
    }

    /**
     * @return the FKClaimStatus
     */
    public int getFKClaimStatus() {
        return FKClaimStatus;
    }

    /**
     * @param FKClaimStatus the FKClaimStatus to set
     */
    public void setFKClaimStatus(int FKClaimStatus) {
        this.FKClaimStatus = FKClaimStatus;
    }
    
    public int getFKClaimTraining() {
        return FKClaimStatus;
    }

    /**
     * @param FKClaimTraining the FKClaimStatus to set
     */
    public void setFKClaimTraining(int FKClaimTraining) {
        this.FKClaimTraining = FKClaimTraining;
    }
    
    public String getFKSerialNumber(){
        return FKSerialNumber;
    }
    public void setFKSerialNumber(String FKSerialNumber){
        this.FKSerialNumber=FKSerialNumber;
    }
    
    public int getFKidStudentInformation(){
        return FKidStudentInformation;
    }
    
    public void setFKidStudentInformation(int FKidStudentInformation){
        this.FKidStudentInformation=FKidStudentInformation;
    }
    
    public String getFKRejectedTrainingMessage(){
        return FKRejectedTrainingMessage;
    }
    
    public void setFKRejectedTrainingMessage(String FKRejectedTrainingMessage){
        this.FKRejectedTrainingMessage=FKRejectedTrainingMessage;
    }
    public String toString(){
        return ("SerialNumber: \n"+SerialNumber+"coverLetter: \n"+coverLetter+"YearEnrollment: \n"+yearEnrollment+
                "cycle: \n"+cycle+"UniversityEmail: \n"+universityEmail+"FKAccount: \n"+FKAccount+"FKFisicPerson:\n"+FKFisicPerson
                +"FKDepartment: \n"+FKDepartment+"FKStudentStatus:\n"+FKStudentStatus+"FKClaimStatus:\n"+FKClaimStatus);
    }
    
}
