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
    <title>getCookie</title>
</head>
<body>
<h1>获取Cookie</h1>
<%
    Cookie[] cookies = request.getCookies();
    if(cookies!=null){
        for(Cookie c:cookies){
            %>
<%=c.getName()%>
<%=" "%>
<%=c.getValue()%><br>
<%

           // System.out.println(c.getName()+"-->"+c.getValue());
            //response.getWriter().println(c.getName()+"-->"+c.getValue());

        }
    }

%>


</body>
</html>
