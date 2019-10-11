<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/9/27
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>successfulPage1</title>
</head>
<body>

<%
    String username = (String)session.getAttribute("username");
    if(username==null){
        //向request域中保存错误信息并转发到原登录界面
        request.setAttribute("msg","臭弟弟，你还没有登录呢~");
        request.getRequestDispatcher("/login/Login.jsp").forward(request,response);
        return;
    }

%>
欢迎<%=username%>的到来哦~<br>


</body>
</html>
