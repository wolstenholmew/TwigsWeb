<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@elvariable id="bookingResponse" type="com.twigs.springmvc.api.BookingResponse"--%>
<html>
<head>
    <title>Booking Summary</title>
</head>
<body>

    <a href="/">home</a>

    <p>booking-summary.jsp</p>
    bookingId: ${bookingResponse.booking.bookingId}
    <br />
    depDate: ${bookingResponse.booking.departureDate}

</body>
</html>
