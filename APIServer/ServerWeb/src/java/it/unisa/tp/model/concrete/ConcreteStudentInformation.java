/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tp.model.concrete;

import it.unisa.tp.model.interfaces.Student;
import it.unisa.tp.model.interfaces.StudentInformation;

/**
 *
 * @author katiasolomita
 */
public class ConcreteStudentInformation implements StudentInformation{

    private int idStudentInformation;
    private String CurriculumVitaePATH;
    private String AccademicTranscriptPATH;
    private Student FK_Student;
            
    public ConcreteStudentInformation(){
    }

    public ConcreteStudentInformation(int idStudentInformation, String CurriculumVitaePATH, String AccademicTranscriptPATH){
    
        this.idStudentInformation = idStudentInformation;
        this.CurriculumVitaePATH= CurriculumVitaePATH;
        this.AccademicTranscriptPATH = AccademicTranscriptPATH;
    }
 
    public int getPrimaryKey() {
        return idStudentInformation;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
          this.idStudentInformation = primaryKey;
    }
    
}
