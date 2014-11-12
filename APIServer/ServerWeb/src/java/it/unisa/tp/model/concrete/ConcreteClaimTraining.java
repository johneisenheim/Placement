/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.ClaimStatus;
import it.unisa.tp.model.interfaces.ClaimTraining;
import it.unisa.tp.model.interfaces.Organization;
import it.unisa.tp.model.interfaces.Professor;

/**
 *
 * @author albamansillacoca
 */
public class ConcreteClaimTraining implements ClaimTraining{
    
    private int idClaimTraining;
    private String description;
    private ClaimStatus FKClaimStatus;
    private Professor FKProfessor;
    private Organization FKOrganization;

    @Override
    public int getPrimaryKey() {
        return this.getIdClaimTraining();
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        this.setIdClaimTraining(primaryKey);
    }

    /**
     * @return the idClaimTraining
     */
    public int getIdClaimTraining() {
        return idClaimTraining;
    }

    /**
     * @param idClaimTraining the idClaimTraining to set
     */
    public void setIdClaimTraining(int idClaimTraining) {
        this.idClaimTraining = idClaimTraining;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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

    /**
     * @return the FKProfessor
     */
    public Professor getFKProfessor() {
        return FKProfessor;
    }

    /**
     * @param FKProfessor the FKProfessor to set
     */
    public void setFKProfessor(Professor FKProfessor) {
        this.FKProfessor = FKProfessor;
    }

    /**
     * @return the FKOrganization
     */
    public Organization getFKOrganization() {
        return FKOrganization;
    }

    /**
     * @param FKOrganization the FKOrganization to set
     */
    public void setFKOrganization(Organization FKOrganization) {
        this.FKOrganization = FKOrganization;
    }
    
     public String toString(){
        return ("idClaimTraining: \n"+idClaimTraining+"Description: \n"+description+"FKClaimStatus: \n"+FKClaimStatus+"FKProfessor: \n"
                +FKProfessor+"FKOrganization: \n"+FKOrganization);
    }
    
}
