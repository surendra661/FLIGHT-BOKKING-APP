package com.flightbooking.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class BookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String date = request.getParameter("date");

        // Simple confirmation logic (static now)
        request.setAttribute("name", name);
        request.setAttribute("from", from);
        request.setAttribute("to", to);
        request.setAttribute("date", date);

        RequestDispatcher rd = request.getRequestDispatcher("confirmation.jsp");
        rd.forward(request, response);
    }
}
