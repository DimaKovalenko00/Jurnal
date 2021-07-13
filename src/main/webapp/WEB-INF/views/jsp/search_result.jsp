<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17.12.2018
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table   width="200" bgcolor="#c0c0c0" cellspacing="0" cellpadding="5" border="2" align="center">
    <tr>
        <th>Название</th>
        <th>Категория</th>
    </tr>

<form method="GET" action="/animal">
    <input type="text" value="${animal.i}">
    <input type="submit" value="OK">
</form>


</body>
</html>
d