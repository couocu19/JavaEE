<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/10/11
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>统计在线人数的页面</title>
</head>
<body>

<p>在线人数为:</p><br>
<p>${applicationScope.Session_Counter}</p>
<%--<%=application.getAttribute("Session_Counter")%>--%>



</body>
</html>
