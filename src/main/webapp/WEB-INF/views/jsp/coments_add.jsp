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
    <div id="title"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Коментарии </font></font></div>
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
    <form method="POST" action="${students}/inf/add">
        <nav class="two">
            <ul>
                <li><input class="button" type="submit" value="Добавить" /></li>
                <li><a href="/students">Назад</a></li>
                <li><a href="/inf/list">Посмотреть комментарии</a></li>
            </ul>
        </nav>
    <div class="rab">
        <div align="center">


            <table border="0">
                <tr>
                    <td>Тема</td>
                    <td><input type="text" name="1"  /></td>
                </tr>
                <tr>
                    <td>Текст сообщения</td>
                    <td><input type="text" name="2"  /></td>
                </tr>
                <tr>
                    <td>Маил для обратной связи</td>
                    <td><input type="text" name="3"  /></td>
                </tr>
            </table>
        </div>
    </div>
    </form>
</body>
</html>
