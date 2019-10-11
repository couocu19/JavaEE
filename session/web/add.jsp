<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/9/25
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addPage</title>
</head>
<body>
我会算加法<br>
<form action="/session_war_exploded/AddServlet" method="post">
    整数1:<input type="text" name="number1"><br>
    整数2:<input type="text" name="number2"><br>
    <a href="result.jsp"><input type="submit" value="计算"></a>

</form>

</body>
</html>
