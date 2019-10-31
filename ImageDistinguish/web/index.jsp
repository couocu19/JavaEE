<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/10/21
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<html>
  <head>
    <title>UploadLogoImage</title>
  </head>
  <body>
  <div id="logo">
    <div id="select">
      <form action="upload" method="post" enctype="multipart/form-data">
        <input type="file" name="logoImage"/><br><br>
        <input type="reset" value="重新选择"/>
        <input type="submit" value="确认提交"/>
      </form>
    </div>
  </div>

  </body>
</html>
