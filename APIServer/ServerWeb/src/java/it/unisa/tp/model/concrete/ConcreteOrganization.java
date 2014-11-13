/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.Account;
import it.unisa.tp.model.interfaces.FisicPerson;
import it.unisa.tp.model.interfaces.Organization;
import it.unisa.tp.model.interfaces.Professor;

/**
 *
 * @author albamansillacoca
 */
public class ConcreteOrganization implements Organization{
    
    private int idOrganization;
    private String companyName;
    private String city;
    private String addres;
    private String phone;
    private String mail;
    private Account account;
    private FisicPerson fisicPerson;
    private String training;
    private Professor profesor;
    
    
    public ConcreteOrganization (int idOrganization, String companyName, String city, String address, String phone, String mail,
            Account account, FisicPerson fisicPerson, String training, Professor profesor){
        this.idOrganization=idOrganization;
        this.companyName=companyName;
        this.city=city;
        this.addres=address;
        this.phone=phone;
        this.mail=mail;
        this.account=account;
        this.fisicPerson=fisicPerson;
        this.training=training;
        this.profesor=profesor;
    }
    
    public ConcreteOrganization(){
        
    }

    @Override
    public int getPrimaryKey() {
       return this.idOrganization;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        this.idOrganization=primaryKey;
    }

    /**
     * @return the idOrganization
     */
    public int getIdOrganization() {
        return idOrganization;
    }

    /**
     * @param idOrganization the idOrganization to set
     */
    public void setIdOrganization(int idOrganization) {
        this.idOrganization = idOrganization;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the addres
     */
    public String getAddres() {
        return addres;
    }

    /**
     * @param addres the addres to set
     */
    public void setAddres(String addres) {
        this.addres = addres;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * @return the fisicPerson
     */
    public FisicPerson getFisicPerson() {
        return fisicPerson;
    }

    /**
     * @param fisicPerson the fisicPerson to set
     */
    public void setFisicPerson(FisicPerson fisicPerson) {
        this.fisicPerson = fisicPerson;
    }

    /**
     * @return the training
     */
    public String getTraining() {
        return training;
    }

    /**
     * @param training the training to set
     */
    public void setTraining(String training) {
        this.training = training;
    }

    /**
     * @return the profesor
     */
    public Professor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Professor profesor) {
        this.profesor = profesor;
    }
    
    public String toString(){
        return ("IDOrganization: \n"+idOrganization+"Company name: \n"+companyName
                +"City: \n"+city+"Address: \n"+addres+"Phone: \n"+phone+"Mail:\n"+mail+"Account: \n"+account
                +"Fisic Person:\n"+fisicPerson+"Training: \n"+training+"Professor: \n"+profesor);
    }
    
    
}
