package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

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
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response); 
        return;
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
        String firstnumber = request.getParameter("first_number");
        String secondnumber = request.getParameter("second_number");
        String plus = request.getParameter("plus");
        String minus = request.getParameter("minus");
        String multiply = request.getParameter("multiply");
        String mod = request.getParameter("mod");
        int first_number_int = 0;
        int second_number_int = 0;
        
        request.setAttribute("firstNumber", firstnumber);
        request.setAttribute("secondNumber", secondnumber);
        
        request.setAttribute("plus", plus);
        request.setAttribute("minus", minus);
        request.setAttribute("multiply", multiply);
        request.setAttribute("mod", mod);

        if(firstnumber == null || firstnumber.equals("") || secondnumber == null || secondnumber.equals("")) {
            request.setAttribute("result", "Invalid.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response); 
            return;
        }
                
        try {
            first_number_int = Integer.parseInt(firstnumber);
            second_number_int = Integer.parseInt(secondnumber);
        } catch (NumberFormatException e) {
            request.setAttribute("result" , "Invalid.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response); 
            return;
        }
        
        if (plus != null) {
            request.setAttribute("result" , first_number_int + second_number_int);
        }
        
        if (minus != null) {
            request.setAttribute("result" , first_number_int - second_number_int);
        }
        
        if (multiply != null) {
            request.setAttribute("result" , first_number_int * second_number_int);
        }
        
        if (mod != null) {
            request.setAttribute("result" , first_number_int % second_number_int);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response); 
        return;
    }
}
