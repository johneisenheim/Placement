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
    
    private int SerialNum;
    private Date Date;
    private String FK_Student;
    
    public ConcreteStudentAttendence(){
    }
    
    public ConcreteStudentAttendence(int SerialNum, Date Date){
    this.SerialNum = SerialNum;
    this.Date = Date;
    }

    
    @Override
    public int getPrimaryKey() {
        return SerialNum;
                }

    /**
     *
     * @param primaryKey
     */
    @Override
    public void setPrimaryKey(int primaryKey) {
    this.SerialNum = primaryKey;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getFKStudent() {
        return FK_Student;
    }

    public void setFKStudent(String FK_Student) {
        this.FK_Student = FK_Student;
    }
    
    
}
