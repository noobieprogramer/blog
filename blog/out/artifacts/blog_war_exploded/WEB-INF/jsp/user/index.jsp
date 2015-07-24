<%--
  Created by IntelliJ IDEA.
  User: kdlbj__
  Date: 15/7/14
  Time: 上午12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <title>首页</title>
  <base href="<%=basePath%>">
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
  <link rel="stylesheet" href="css/user/index.css">
  <script src="js/jquery-1.11.3.js"></script>
  <script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="wrapper">
    <div class="header">
      <div class="name">
        Kdlbj__
      </div>
    </div>
  </div>
</body>
</html>
