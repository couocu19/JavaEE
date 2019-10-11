<%@ page import="jstl.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/10/2
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JstlPage</title>
</head>
<body>
 <%--<%--%>
     <%--request.setAttribute("code","<script>alert('hello');</script>");--%>
 <%--%>--%>
<c:set var="code" value="emmmm"  scope="session"/>

<c:out value="${code}" default="kkk"/>

<%--<jsp:useBean id="people" class="jstl.User"/>--%>
<%--<c:set target="${people}" property="name" value="coucou"/>--%>
<%--<c:set target="${people}" property="age" value="19"/>--%>
 <%--<c:set target="${people}" property="id" value="01"/>--%>

<%--<c:out value="${people}"/>--%>
<%--<br>--%>
<%--<c:out value="${people.id} ${people.age} ${people.name}"/>--%>
<%--<br>--%>

 <%--<c:choose>--%>
     <%--<c:when test="${people.id=='01'}">你的id是01</c:when>--%>
     <%--<c:otherwise>--%>
         <%--嘻嘻嘻不告诉你id--%>
     <%--</c:otherwise>--%>
 <%--</c:choose>--%>
 <jsp:useBean id="people" class="jstl.User"/>
<%
    List<User> users = new ArrayList<>();
    User u1 = new User("zxq",18,01);
    User u2 = new User("zzz",20,02);
    users.add(u1);
    users.add(u2);
    request.setAttribute("users",users);
%>
<c:forEach items="${requestScope.users}" var="people">
    <c:out value="${people.name}"/><br>
    <c:out value="${people.id}"/><br>
    <c:out value="${people.age}"/><br>
</c:forEach>
</body>
</html>
