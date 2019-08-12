<%--
  Created by IntelliJ IDEA.
  User: mmciel
  Date: 2019/8/11
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${APP_PATH}/air/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit"    value="dddddd">
</form>
</body>
</html>
