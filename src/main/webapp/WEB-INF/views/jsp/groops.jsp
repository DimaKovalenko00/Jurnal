<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Журнал</title>
    <meta charset="utf-8">
    <style>
        <%@include file="/WEB-INF/views/css/my.css"%>
    </style>

</head>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body >
<div id="header">
    <div id="title"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">csstemplates.net</font></font></div>
</div>
<div class="dropdown">
    <button class="mainmenubtn">Главное меню</button>
    <div class="dropdown-child">
        <div id="navigation">

            <ul>
                <li id="linkHome"><a href="/students">просмотр список студентов</a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"></font></font></a></li>
                <li id="linkVideos"><a href="/groops"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">просмотр список групп</font></font></a></li>
                <li id="linkTwitter"><a href="/predmet"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">предметы</font></font></a></li>
                <li id="linkOffer"><a href="/">справка</a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"></font></font></a></li>
                <li id="linkOffer"><a href="/inf">Обратная связь</a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"></font></font></a></li>
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
    </div>
</div>
</div>
<div class="navr" >
    <form  method="POST" action="groops/searth">
        <h3 align="center">поиск </h3>
        <h4 align="center">Номер группы</h4>
        <input type="text" name="searthf" width="160px">
        <input  class="button1" type="submit" value="поиск">
    </form>
</div>
<form method="POST" action="groops/delete1">
<nav class="two">
    <ul>
        <li><a href="add/newgroop"><i class="fa fa-home fa-fw"></i>добавление</a></li>
        <li><input class="button"  type="submit" value="удалить"/></li>
    </ul>
</nav>
    <div class="rab">
        <table   width="850px"  cellspacing="0" cellpadding="5" border="2" align="center">
            <tr>
                <th>Номер группы</th>
                <th>Оиделение</th>
                <th>Год поступления</th>
                <th>_</th>
            </tr>

            <c:forEach items="${groops}" var="g">
                <tr>
                    <td>${g.nomer_groop}</td>
                    <td>${g.otdel.nazv_otdel}</td>
                    <td>${g.god_postup}</td>
                    <td><input type="radio" name="id" value="${g.groop_id}"/></td>
                </tr>
            </c:forEach>
            </br>

        </table>
    </div>
</form>
</body>
</html>