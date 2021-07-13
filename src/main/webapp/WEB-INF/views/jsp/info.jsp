<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Флексагон</title>
    <meta charset="utf-8">
    <style>
        <%@include file="/WEB-INF/views/css/my.css"%>
    </style>


</head>



<body >
<div id="header">
    <div id="title"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Электронный журнал </font></font></div>
</div>
<div id="navigation">

    <ul>
        <li id="linkHome"><a href="/students">просмотр список студентов</a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"></font></font></a></li>
        <li id="linkVideos"><a href="/groops"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">просмотр список групп</font></font></a></li>
        <li id="linkTwitter"><a href="/predmet"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">предметы</font></font></a></li>
        <li id="linkOffer"><a href="/students/us">справка</a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"></font></font></a></li>
    </ul>

    <br>

    <div style="height:600px;width:160px;border:0px solid #000;margin:20px 0 5px 15px;">
        <script type="text/javascript"><!--
        google_ad_client = "pub-2234271305558369";
        google_color_border = "242624";
        google_color_bg = "FFFFFF";
        google_color_link = "84aa1c";
        google_color_text = "333333";
        google_color_url = "84aa1c";
        google_ad_width = 160;
        google_ad_height = 600;
        //-->
        </script>
        <script type="text/javascript" src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
        </script>
    </div>
    <br>
</div >
<div class="navr" >
    <form  method="POST" action="students/searth">
        <h3 align="center">поиск </h3>
        <h4 align="center">Фамилия</h4>
        <input type="text" name="searthf" width="160px">
        <h4 align="center">Имя</h4>
        <input type="text" name="searthi" width="160px">
        <h4 align="center">Группа</h4>
        <input type="text" name="searthg" width="160px">
        <input  class="button1" type="submit" value="поиск">
    </form>
</div>

<div class="rab">

    <table   width="800px" cellspacing="0" cellpadding="5" border="2" align="center">
        <tr>
            <th>Фамилия</th>
            <th>Имя</th>
            <th>Отчество</th>
            <th>Группа</th>
            <th>Успеваемость(доступ к сессии)</th>
            <th>кол нб</th>
            <th>.</th>
        </tr>


            <tr>
                <td>${students.f}</td>
                <td>${students.i}</td>
                <td>${students.o}</td>
                <td>${students.groop.nomer_groop}</td>
                <td>${students.predmetUspevaimost.dopusk_k_sesii}</td>
                <td>${students.predmetUspevaimost.kol_nb}</td>
                <td><input type="radio" name="id" value="${s.student_id}"/></td>
            </tr>
        </c:forEach>


       <%--     ${med.groop_zdorovya}
        ${med.groop_zdorovya}
        ${mil.kol_privodov}--%>



    </table>
</div>
</form>
</body>
</html>