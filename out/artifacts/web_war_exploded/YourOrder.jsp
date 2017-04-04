<%--
  Created by IntelliJ IDEA.
  User: Саня
  Date: 04.04.2017
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="film" items="${requestScope.order}">
    <c:out value="${film}"/>
    </br>
</c:forEach>
</br>
<form action="/mainPage.jsp" method="POST">
    </br>
    <input type="submit" value="Вернуться на главную страницу"/>
</form>
</body>
</html>
