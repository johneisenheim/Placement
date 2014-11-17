/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.StudentAttendence;
import java.sql.Date;

/**
 *
 * @author katiasolomita
 */
public class ConcreteStudentAttendence implements StudentAttendence{
    
    private String SerialNum;
    private Date Date;
    
    public ConcreteStudentAttendence(){
    }
    
    public ConcreteStudentAttendence(String SerialNum, Date Date){
    this.SerialNum = SerialNum;
    this.Date = Date;
    }

    
    public String getPrimaryKey() {
        return SerialNum;
                }

   
    public void setPrimaryKey(String primaryKey) {
    this.SerialNum = primaryKey;
    }
    
    
}
