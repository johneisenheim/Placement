package it.unisa.tp.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import it.unisa.tp.model.concrete.ConcreteStudent;
import it.unisa.tp.model.concrete.ConcreteStudentAttendence;
import it.unisa.tp.model.concrete.StudentTrainingInformation;
import it.unisa.tp.model.interfaces.FisicPerson;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author carlosborges
 */
public class StudentAttendanceInformation {

    private final Connection aConnection;

    public StudentAttendanceInformation() throws ClassNotFoundException, SQLException, IOException {
        aConnection = DBConnection.connect();
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList getStudentInformation() throws SQLException, ClassNotFoundException, IOException
    {
        CallableStatement pcSelect = aConnection.prepareCall("{call getStudentAttendence()}");
        ArrayList<HashMap<ConcreteStudent, ContreteStudentAttendence>> data = new ArrayList<HashMap<ConcreteStudent, ContreteStudentAttendence>>();
        ArrayList<StudentTrainingInformation> studentsTrainingList = new ArrayList<StudentTrainingInformation>();//a list of information of student who are in waiting list
        StudentInformation studentInformation = new StudentInformation();
        ResultSet rs = pcSelect.executeQuery(); 
        while (rs.next()) {//import into the arrayList all the records present into the StudentAttendence
            StudentTrainingInformation aStudentAttendence = new StudentTrainingInformation();
            aStudentAttendence.setAStudent(studentInformation.getInformationbyPrimaryKey(rs.getString(3)));
            
            studentsTrainingList.add(aStudentAttendence);
            
        }
        pcSelect.close();
        
        
        return data;
    }
}
