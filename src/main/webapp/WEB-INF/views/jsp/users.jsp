<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 23.03.2019
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>

<table   width="200" bgcolor="#c0c0c0" cellspacing="0" cellpadding="5" border="2" align="center">
    <tr>
        <th>Логин</th>
        <th>Пароль</th>
        <th>Доступ</th>
    </tr>

    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.login}</td>
            <td>${user.password}</td>
            <td>${user.dostup}</td>

        </tr>
    </c:forEach>

</table>




</body>
</html>
