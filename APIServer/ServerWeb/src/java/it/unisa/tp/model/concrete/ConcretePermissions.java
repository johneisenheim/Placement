/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.Permissions;

/**
 *
 * @author albamansillacoca
 */
public class ConcretePermissions implements Permissions{
    
    private int idPermissions;
    private String description;
    private String classe;
            
    public ConcretePermissions (int idPermissions, String description, String classe){
        this.idPermissions=idPermissions;
        this.description=description;
        this.classe=classe;
    }
           
    public ConcretePermissions (){
        
    }

    @Override
    public int getPrimaryKey() {
       return this.idPermissions;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        this.idPermissions=primaryKey;
    }

    /**
     * @return the idPermissions
     */
    public int getIdPermissions() {
        return idPermissions;
    }

    /**
     * @param idPermissions the idPermissions to set
     */
    public void setIdPermissions(int idPermissions) {
        this.idPermissions = idPermissions;
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
     * @return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public String toString(){
        return ("IDPermissionss: \n"+idPermissions+"Description: \n"+description+"Class:\n"+classe);
    }
    
}
