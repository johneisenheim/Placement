/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.*;

/**
 *
 * @author carlosborges
 */
public class concreteAccount implements Account {

    private int idAccount;
    private String unserName;
    private String password;
    private String typeOfAccount;
    private Permission FKPermission;
    
    @Override
    public int getPrimaryKey() {
        return this.idAccount;
        
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        this.idAccount= primaryKey;
    }
    
}
