/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.RejectedTrainingMessage;

/**
 *
 * @author katiasolomita
 */
public class ConcreteRejectedTrainingMessage implements RejectedTrainingMessage{

   private int idRejectedTrainingMessage;
   private String description;
   
   public ConcreteRejectedTrainingMessage(){
   }
   
   public ConcreteRejectedTrainingMessage(int idRejectedTrainingMessage, String description){
   this.idRejectedTrainingMessage= idRejectedTrainingMessage;
   this.description=description;
   }
    
    public int getPrimaryKey() {
        return idRejectedTrainingMessage;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        this.idRejectedTrainingMessage= primaryKey;
    }
    
}
