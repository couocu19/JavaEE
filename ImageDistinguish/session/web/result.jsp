<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/9/25
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addResultPage</title>
</head>
<body>
<%
    Integer result = (Integer)request.getAttribute("result");
%>
<%=result %>



</body>
</html>
