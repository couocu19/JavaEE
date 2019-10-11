<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/9/25
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath(); //获取项目名称
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<html>
<head>
    <!--向页面输出basePath-->
    <!--base下的路径相当于写在每一个超链接之前-->
    <base href="<%=basePath%>">

    <title>initpage</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expties" content="0">
    <meta http-equiv="keywords" content="coucou,beautiful,fairy">
    <meta http-equiv="description" content="This is coucou's page">
</head>
<body>
别看了 <br>
<%
    //写在方法内 是一个局部变量
    int a = 10;
    System.out.println(a);
%>

<%=a%>
<%!
    //写在类内部，是一个成员变量
    int a = 100;
%>
<br/>


</body>
</html>
