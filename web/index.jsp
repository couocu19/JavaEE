<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/9/18
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>


<!--这是jsp指令，也是一种特殊的标签 -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath(); // 获取项目名
  // http://localhost:8080/session_war_exploded/
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<html>
  <head>

    <!--向页面输出basePath-->
    <base href="<%=basePath%>>">

    <title>mainpage</title>
  </head>
  <body>
  这是一个页面<br>

  <form action="Dservlet" method="get">
    <input type="submit" value="登录">
  </form>

  </body>
</html>
