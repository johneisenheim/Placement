/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.control.servlet;

import it.unisa.tp.control.AuthenticateUser;
import it.unisa.tp.model.concrete.ConcreteAccount;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author carlosborges
 */
@WebServlet(name = "AuthenticateUserServlet", urlPatterns = {"/AuthenticateUserServlet"})
public class AuthenticateUserServlet extends HttpServlet {

    private final JSONObject message = new JSONObject();

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
            throws ServletException, IOException {
        String toReturn = null;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        //String userName = request.getParameter("pippo");
        //String password = request.getParameter("paperino");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ConcreteAccount anAccount;
        AuthenticateUser handleUser = new AuthenticateUser();
        try {
            anAccount=handleUser.authenticate(username,password);
            if (anAccount!= null) {
                toReturn = "l'utente è loggato";
                message.put("status", 1);
                message.put("message", "User authenticated!");
                message.put("userType", anAccount.getTypeOfAccount());
                message.put("userName", anAccount.getUnserName());
                response.getWriter().write(message.toString());
            } if(anAccount==null) {
                toReturn = "l'utente  non è loggato";
                message.put("status", 0);
                message.put("message", "Error!");
                response.getWriter().write(message.toString());
            }
        } catch (JSONException ex) {
            Logger.getLogger(AuthenticateUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AuthenticateUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet prova</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>il valore di ritorno è: " + toReturn + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        processRequest(request, response);
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
        processRequest(request, response);
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
