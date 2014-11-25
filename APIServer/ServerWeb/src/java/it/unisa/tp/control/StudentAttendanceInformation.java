package it.unisa.tp.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import it.unisa.tp.model.concrete.ConcreteStudent;
import it.unisa.tp.model.concrete.ConcreteStudentAttendence;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author carlosborges
 */
public class StudentAttendanceInformation {
    
    private final Connection aConnection;
    
    public StudentAttendanceInformation() throws ClassNotFoundException, SQLException, IOException{
        aConnection = DBConnection.connect();
    }
    
    public Map<ArrayList<ContreteStudentAttendence, ConcreteStudent>> StudentInformation () throws SQLException{
        
        List<HashMap<ConcreteStudentAttendence, ConcreteStudent>> data = new ArrayList<HashMap<ConcreteStudentAttendence, ConcreteStudent>>();
        CallableStatement pcUpload = aConnection.prepareCall("{call getStudentAttendence()}");
        ResultSet rs = pcUpload.executeQuery();
        ArrayList<ConcreteStudentAttendence> StudentAttendenceList = new ArrayList<ConcreteStudentAttendence>();
        while(rs.next()){
            ConcreteStudentAttendence aStudentAttendence = new ConcreteStudentAttendence();
            aStudentAttendence.setPrimaryKey(rs.getInt(1));
            aStudentAttendence.setDate(rs.getDate(2));
            aStudentAttendence.setFKStudent(rs.getString(3));
            StudentAttendenceList.add(aStudentAttendence);
        }
        pcUpload.close();
         GetStudentInformation getStudent = GetStudentInformation();
         
        
    }
}
