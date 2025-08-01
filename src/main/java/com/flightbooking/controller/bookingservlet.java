package com.flightbooking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class BookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String flightNumber = request.getParameter("flightNumber");
        String passengerName = request.getParameter("passengerName");
        String passengerEmail = request.getParameter("passengerEmail");
        int passengers = Integer.parseInt(request.getParameter("passengers"));
        String travelClass = request.getParameter("travelClass");

        Flight flight = null;
        for (Flight f : Database.flights) {
            if (f.getFlightNumber().equals(flightNumber)) {
                flight = f;
                break;
            }
        }

        if (flight != null) {
            Booking booking = Database.bookFlight(flight, passengerName, 
                                               passengerEmail, passengers, 
                                               travelClass);
            request.setAttribute("booking", booking);
            request.getRequestDispatcher("confirmation.jsp").forward(request, response);
        } else {
            response.sendRedirect("search.html?error=flight_not_found");
        }
    }
}