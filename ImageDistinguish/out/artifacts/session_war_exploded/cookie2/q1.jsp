<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/9/26
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addCookies</title>
</head>
<body>
<h1>显示cookie的maxAge</h1>
<%
    Cookie c1 = new Cookie("aaa","AAA");
    c1.setMaxAge(60*60);
    response.addCookie(c1);
   //  c1.setMaxAge(60*60);
%>

</body>
</html>
