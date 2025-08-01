package com.flightbooking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Database {
    private static List<Flight> flights = new ArrayList<>();
    private static List<Booking> bookings = new ArrayList<>();

    static {
        // Sample flights
        flights.add(new Flight("AI101", "Air India", "DEL", "BOM", "08:00", "10:30", 4500, 120));
        flights.add(new Flight("6E205", "IndiGo", "BOM", "BLR", "11:15", "13:00", 3800, 90));
    }

    public static List<Flight> searchFlights(String departure, String arrival) {
        List<Flight> results = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure) && flight.getArrival().equals(arrival)) {
                results.add(flight);
            }
        }
        return results;
    }

    public static Booking bookFlight(Flight flight, String passengerName, 
                                  String passengerEmail, int passengers, 
                                  String travelClass) {
        double totalPrice = flight.getPrice() * passengers;
        if (travelClass.equals("Business")) totalPrice *= 1.5;
        else if (travelClass.equals("First")) totalPrice *= 2.0;

        String bookingId = UUID.randomUUID().toString().substring(0, 8);
        Booking booking = new Booking(bookingId, flight, passengerName, 
                                    passengerEmail, passengers, 
                                    travelClass, totalPrice);
        bookings.add(booking);
        return booking;
    }
}