<%--
  Created by IntelliJ IDEA.
  User: 11583
  Date: 2019/6/24
  Time: 8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登陆</title>
</head>
<body>

<h1>
    JSP登陆演示
</h1>
<form id="loginForm" method="get" action="doLogin.jsp">
    <div>
    </div>
        <label for="userName">用户名：</label>
        <input id="userName" type="text" name="userName" value=""/>

        <label for="password">用户名密码</label>
        <input id="password" type="password" name="password" value="">
        <input type="submit" value="登陆">


</form>
</body>
</html>
