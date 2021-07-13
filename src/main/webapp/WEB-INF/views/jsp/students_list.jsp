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
<div align="center">
    <a href="groop/studentnew" style="margin: 40px;">добавление</a>
    <a href="groop/delete" style="margin: 40px;">удаление группы</a>
    <a href="students/new" style="margin: 40px;">новая группа</a>
</div>
<form method="POST" action="students/delete1">
    <table   width="200" bgcolor="#c0c0c0" cellspacing="0" cellpadding="5" border="2" align="center">
        <tr>
            <th>Фамилия</th>
            <th>Имя</th>
            <th>Отчество</th>
            <th>группа</th>
            <th>__</th>
        </tr>
        <c:forEach items="${student}" var="student">
            <tr>
                <td>${student.f}</td>
                <td>${student.i}</td>
                <td>${student.o}</td>
                <td>${student.groop.nomer_groop}</td>
                <td><input type="radio" i="student_id" value="${student.student_id}"/></td>
            </tr>
        </c:forEach>
        </br>
        <input  type="submit" value="delete"/>
    </table>
</form>
</br>
<div align="center">
    <form method="POST" action="students/search">
        <input type="text" i="i" value="${student.i}" />
        <input style="display: flex;" type="submit" value="search"/>
    </form>
</div>
</body>
</html>
