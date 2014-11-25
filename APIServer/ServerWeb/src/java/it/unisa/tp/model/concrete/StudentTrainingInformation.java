/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tp.model.concrete;

/**
 *
 * @author carlosborges
 */
public class StudentTrainingInformation {
    private ConcreteStudent aStudent;
    private ConcreteStudentAttendence aAttendence;
    private ConcreteFisicPerson aFisicPerson;

    public StudentTrainingInformation(ConcreteStudent aStudent, ConcreteStudentAttendence aAttendence, ConcreteFisicPerson aFisicPerson) {
        this.aStudent = aStudent;
        this.aAttendence = aAttendence;
        this.aFisicPerson = aFisicPerson;
    }
    public StudentTrainingInformation(){
        
    }

    public ConcreteStudent getAStudent() {
        return aStudent;
    }

    public void setAStudent(ConcreteStudent aStudent) {
        this.aStudent = aStudent;
    }

    public ConcreteStudentAttendence getAttendence() {
        return aAttendence;
    }

    public void setAttendence(ConcreteStudentAttendence aAttendence) {
        this.aAttendence = aAttendence;
    }

    public ConcreteFisicPerson getaFisicPerson() {
        return aFisicPerson;
    }

    public void setaFisicPerson(ConcreteFisicPerson aFisicPerson) {
        this.aFisicPerson = aFisicPerson;
    }
    
    
}
