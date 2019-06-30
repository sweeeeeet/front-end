<%--
  Created by IntelliJ IDEA.
  User: 11583
  Date: 2019/6/26
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="seggment/header.jsp"%>

<form id="loginForm" method="get" action="test_forward.jsp">
    <div>
    </div>
    <label for="userName">用户名：</label>
    <input id="userName" type="text" name="userName" value=""/>

    <label for="password">用户名密码</label>
    <input id="password" type="password" name="password" value="">
    <input type="submit" value="登陆">


</form>

<%@include file="seggment/footer.jsp"%>
</body>
</html>
