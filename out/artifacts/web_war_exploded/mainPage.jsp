<%--
  Created by IntelliJ IDEA.
  User: Саня
  Date: 04.04.2017
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/makeBooking" method="GET">
    <input type="submit" value="makeBooking">
    <br />
</form>
<form action="/seeSchedule" method="GET">
    <input type="submit" value="seeSchedule">
    <br />
</form>
<form action="seeOrder.jsp" method="GET">
    <input type="submit" value="seeOrder">
    <br />
</form>
<form action="/deleteOrder" method="GET">
    <input type="submit" value="deleteOrder">
    <br />
</form>

</body>
</html>
