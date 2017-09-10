/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.*;
import static java.lang.System.out;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Sorzano Torres Pablo, Wah Ortiz Yin Chew
 */
@WebServlet(name = "altas", urlPatterns = {"/altas"})
public class altas extends HttpServlet {

    @Override
    /**
     * El metodo doPost recupera los valores del formulario que se encuentra en alta.jsp 
     * y posteriormente envia los datos a la base de datos (es una rutina de altas)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario;
        String contra;
        usuario = request.getParameter("usuario");
        contra = request.getParameter("contra");

        Connection c = null;
        Statement sta = null;
        ResultSet r = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/loging", "root", "n0m3l0");
            sta = c.createStatement();

            sta.executeUpdate("insert into usu (usuario,cont) values ('" + usuario + "','" + contra + "');");
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print("<script> alert('Te has registrado exitosamente'); </script>");
            out.print("<script> window.location='index.html'; </script>");

        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
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
