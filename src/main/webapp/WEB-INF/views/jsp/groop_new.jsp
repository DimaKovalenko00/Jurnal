<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.02.2019
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form METHOD="post" action="/groops/new">
        <div>

            <p>groop     </p>
            </br>
            <input type="text" i="nomer_groop" >
            </br>
            <p>groop     </p>
            <p>год поступления</p>

            <input type="text" i="god_postup" >
            </br>
            <p>student_id otdelenia     </p>
            <input type="text" i="otdel_id" >
            <input type="submit" value="добавить">
        </div>
    </form>

</body>
</html>
