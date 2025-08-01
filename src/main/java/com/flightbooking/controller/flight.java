package com.flightbooking;

public class Flight {
    private String flightNumber;
    private String airline;
    private String departure;
    private String arrival;
    private String departureTime;
    private String arrivalTime;
    private double price;
    private int availableSeats;

    // Constructor, Getters & Setters
    public Flight(String flightNumber, String airline, String departure, 
                 String arrival, String departureTime, String arrivalTime,
                 double price, int availableSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departure = departure;
        this.arrival = arrival;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    // Getters & Setters (omitted for brevity)
}