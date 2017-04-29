<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Booking Search</title>
    <style>.cssErrors{color: blue}</style>
</head>
<body>

    <p>booking-search-form.jsp</p>

    <form:form commandName="bookingRequest" action="booking-summary">
        Booking Id:
        <form:input path="bookingId" />
        <form:errors path="bookingId" cssClass="cssErrors" />
        <br />
        <input type="submit" value="Submit">
    </form:form>

</body>
</html>
