/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.tirocinio.servlet;

import it.unisa.tirocinio.database.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.output.*;

/**
 *
 * @author carlosborges
 */
@WebServlet(name = "UploadInformationFilesServlet", urlPatterns = {"/UploadInformationFilesServlet"})
public class UploadInformationFilesServlet extends HttpServlet {

    private boolean isMultipart;
    private String filePath;
    private String fileSeparator = null;
    private final int maxFileSize = 50 * 1024;
    private final int maxMemSize = 4 * 1024;
    private StudentDBOperation serialNumberFromDBOperation = null;

    @Override
    public void init() {
        // Get the file location where it would be stored.
        //filePath = getServletContext().getInitParameter("file-upload");
        fileSeparator = System.getProperty("file.separator");
        String userHome = System.getProperty("user.home");
        filePath = userHome+fileSeparator+"PlatformDocuments";
        try {
            serialNumberFromDBOperation = new StudentDBOperation();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UploadInformationFilesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UploadInformationFilesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UploadInformationFilesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        File directoryCheck = new File(filePath);
        if( !directoryCheck.exists() ){
            directoryCheck.mkdir();
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileUploadException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        PrintWriter out = response.getWriter();
        isMultipart = ServletFileUpload.isMultipartContent(request);
        
        DiskFileItemFactory factory = new DiskFileItemFactory();
        
        ServletFileUpload upload = new ServletFileUpload(factory);
        List fileItems = upload.parseRequest(request);
        Iterator i = fileItems.iterator();
        File fileToStore = null;
        
         while ( i.hasNext () ) {
            FileItem fi = (FileItem)i.next();
            if ( !fi.isFormField () ){
               // Get the uploaded file parameters
               String fieldName = fi.getFieldName();
               String fileName = fi.getName();
               if( fieldName.equals("cvfile")){
                   fileToStore = new File(filePath+fileSeparator+"CV.pdf");
               }else if( fieldName.equals("examsfile")){
                   fileToStore = new File(filePath+fileSeparator+"ES.pdf");
               }
               fi.write( fileToStore ) ;
               //String contentType = fi.getContentType();
               //boolean isInMemory = fi.isInMemory();
               //long sizeInBytes = fi.getSize();
               /* Write the file
               if( fileName.lastIndexOf("\\") >= 0 ){
                  file = new File( filePath + 
                  fileName.substring( fileName.lastIndexOf("\\"))) ;
               }else{
                  file = new File( filePath + 
                  fileName.substring(fileName.lastIndexOf("\\")+1)) ;
               }*/
              // fi.write( file ) ;
               out.println("Uploaded Filename: " + fieldName + "<br>");
            }else{
                out.println("It's not formfield");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        throw new ServletException("GET method used with " +
                getClass().getName()+": POST method required.");

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(UploadInformationFilesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        
        return "Short description";
    }// </editor-fold>

}
