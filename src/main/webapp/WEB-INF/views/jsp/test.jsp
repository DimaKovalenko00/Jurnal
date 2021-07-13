<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.02.2019
  Time: 10:40
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
        <th>Фамилия</th>
        <th>Успеваемость(доступ к сессии)</th>
        <th>name</th>

    </tr>

    <c:forEach items="${students}" var="s">
        <tr>
            <td>${s.f}</td>
            <td>${s.groop.nomer_groop}</td>
            <td>${s.predmet_usp.dopusk_k_sesii}</td>

        </tr>
    </c:forEach>

</table>
</body>
</html>
