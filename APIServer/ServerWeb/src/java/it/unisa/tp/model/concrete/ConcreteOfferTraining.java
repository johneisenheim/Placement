/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.OfferTraining;
import it.unisa.tp.model.interfaces.Organization;

/**
 *
 * @author katiasolomita
 */
public class ConcreteOfferTraining implements OfferTraining{

   private int idOfferTraining;
   private String description;
   private Organization FK_Organization;
           
    public ConcreteOfferTraining(){
    }
    
    public ConcreteOfferTraining(int idOfferTraining, String description){
        this.idOfferTraining=idOfferTraining;
        this.description=description;
    }
    
    public int getPrimaryKey() {
        return idOfferTraining;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        this.idOfferTraining=primaryKey;
    }
    
}
