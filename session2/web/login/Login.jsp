<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/9/27
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginpage</title>
</head>
<body>
<h1>coucou欢迎你来登录</h1>
<%
    String s = "";
    Cookie[] cookies = request.getCookies();
    if(cookies!=null) {
        for (Cookie c : cookies) {
            if ("username".equals(c.getName())) {
                s = c.getValue();
            }
        }
    }

%>
<%
    String msg = "";
    String mes = (String)request.getAttribute("msg");
    if(mes != null){
        msg = mes;
    }

%>
<font color="red">
    <b>
        <%=msg%></b><br>
</font>

<form action="/session2_war_exploded/LoginServlet" method="post">
用户名: <input type="text" name="username" value="<%=s%>"><br>
密码: <input type="password" name="password"><br>
<input type="submit" value="登录"><br>
</form>

</body>
</html>
