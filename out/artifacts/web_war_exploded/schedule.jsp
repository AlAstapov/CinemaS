<%--
  Created by IntelliJ IDEA.
  User: Саня
  Date: 31.03.2017
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title>Schedule</title>
</head>
<body>
<c:forEach var="film" items="${requestScope.schedule}">
    <c:out value="${film}"/>
    </br>
</c:forEach>
<form action="/mainPage.jsp" method="POST">
    </br>
    <input type="submit" value="Вернуться на главную страницу" />
</form>
</body>
</html>
