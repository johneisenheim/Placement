package it.unisa.tp.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import it.unisa.tp.model.concrete.ConcreteStudent;
import it.unisa.tp.model.concrete.StudentTrainingInformation;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author carlosborges
 */
public class StudentAttendanceDetails {

    private final Connection aConnection;

    public StudentAttendanceDetails() throws ClassNotFoundException, SQLException, IOException {
        aConnection = DBConnection.connect();
    }

    /**
      Return for all students into the StudentAttendece table the Corresponding Student fisicPerson and 
      * studentInformation object
     * @return
     * @throws SQLException
     * @throws java.lang.ClassNotFoundException
     * @throws java.io.IOException
     */
    public ArrayList<StudentTrainingInformation> getStudentDetails() throws SQLException, ClassNotFoundException, IOException
    {
        CallableStatement pcSelect = aConnection.prepareCall("{call getStudentAttendence()}");
        ArrayList<StudentTrainingInformation> studentsTrainingList = new ArrayList<StudentTrainingInformation>();//a list of information of student who are in waiting list
        StudentDBOperation studentInformation = new StudentDBOperation();
        FisicPersonInformation personInformation = new FisicPersonInformation();
        StudentInformationDBOperation studentAttendanceInfo = new StudentInformationDBOperation();
        ResultSet rs = pcSelect.executeQuery(); 
        while (rs.next()) {//import into the arrayList all the records present into the StudentAttendence
            StudentTrainingInformation aStudentAttendence = new StudentTrainingInformation();
            ConcreteStudent aStudent = studentInformation.getInformationbyPrimaryKey(rs.getString(3));
            aStudentAttendence.setStudent(aStudent);
            aStudentAttendence.setFisicPerson(personInformation.getFisicPersonInformation(aStudent.getFKFisicPerson()));
            aStudentAttendence.setaStudentInformation(studentAttendanceInfo.getStudentInfoByPrimaryKey(aStudent.getFKidStudentInformation()));
            studentsTrainingList.add(aStudentAttendence);  
        }
        pcSelect.close();
        return studentsTrainingList;     
    }
}
