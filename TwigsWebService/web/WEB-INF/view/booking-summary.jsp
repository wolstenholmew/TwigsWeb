<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@elvariable id="booking" type="com.twigs.springmvc.booking.Booking"--%>
<html>
<head>
    <title>Booking Summary</title>
</head>
<body>

    <a href="/">home</a>

    <p>booking-summary.jsp</p>
    bookingId: ${booking.bookingId}
    <br />
    depDate: ${booking.departureDate}

</body>
</html>
