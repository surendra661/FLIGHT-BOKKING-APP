<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Booking Confirmed</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <h1>✈️ SkyTravel</h1>
    </header>

    <main>
        <section class="confirmation">
            <h2>✅ Booking Confirmed!</h2>
            <p>Booking ID: <strong>${booking.bookingId}</strong></p>
            <p>Passenger: <strong>${booking.passengerName}</strong></p>
            <p>Flight: <strong>${booking.flight.airline} (${booking.flight.flightNumber})</strong></p>
            <p>From: <strong>${booking.flight.departure}</strong> To: <strong>${booking.flight.arrival}</strong></p>
            <p>Total Price: <strong>₹${booking.totalPrice}</strong></p>
            <a href="index.html" class="btn">Back to Home</a>
        </section>
    </main>
</body>
</html>