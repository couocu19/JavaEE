<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/9/26
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addCookie</title>
</head>
<body>
<h1>保存cookie</h1>

<%--jsp中的九大内置对象：request,response,session,application,pageContext,config,out,page,exception--%>
<%
    Cookie c1 = new Cookie("aaa","AAA");
    response.addCookie(c1);

    Cookie c2 = new Cookie("bbb","BBB");
    response.addCookie(c2);


%>





</body>
</html>
