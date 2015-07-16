<%--
  Created by IntelliJ IDEA.
  User: kdlbj__
  Date: 15/7/13
  Time: 上午3:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
  <head>
    <title></title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="css/index.css">
  </head>
  <body>
    <h2>web</h2>
    <h3>やりましだね</h3>
    <h4>やり直す</h4>
  </body>
</html>
