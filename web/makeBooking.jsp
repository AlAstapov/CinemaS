<%--
  Created by IntelliJ IDEA.
  User: Саня
  Date: 01.04.2017
  Time: 3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Booking</title>
</head>
<body>
<form action="/makeBooking" method="POST">
    Cinema: <input type="text" name="Cinema">
    <br />
    tiketsCount: <input type="number" name="tiketsCount" />
    <br />
    beginingTime: <input type="text" name="beginingTime" />
    <input type="submit" value="Submit" />
</form>
</body>
</html>
