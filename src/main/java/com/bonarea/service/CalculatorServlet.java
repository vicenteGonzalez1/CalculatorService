/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.service;

import com.bonarea.calculatorservice.ICalculatorService;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alumne
 */
public class CalculatorServlet extends HttpServlet {
         //FIeld Injection
    @Inject
    @Named("calculatorService")
    private ICalculatorService calculator;

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //get parameters from url
            String operation = request.getParameter("operation");
            Integer num1 = Integer.parseInt(request.getParameter("num1"));
            Integer num2 = Integer.parseInt(request.getParameter("num2"));
            
            Integer result = 0;
            //logic
            if(operation.equals("suma")) {
                result = calculator.add(num1, num2);
            } else if (operation.equals("resta")) {
                result = calculator.substract(num1, num2);
            } else if (operation.equals("dividir")) {
                result = calculator.divide(num1, num2);
            } else if (operation.equals("multiplicar")) {
                result = calculator.multiply(num1, num2);
            }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatorServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("anem a fer: " + operation + " de "+ num1 + " i " + num2);
            out.println("<h1>el resultat es: " + result + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (SecurityException ex) {
            Logger.getLogger(CalculatorServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(CalculatorServlet.class.getName()).log(Level.SEVERE, null, ex);
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
