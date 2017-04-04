<%--
  Created by IntelliJ IDEA.
  User: Саня
  Date: 04.04.2017
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Введите номер брони для отмены
<form action="/deleteOrder" method="POST">
    <input type="number" name="id">
    </br>
    <input type="submit" value="delete">
    <br />
</form>
</body>
</html>
