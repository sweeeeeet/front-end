<%--
  Created by IntelliJ IDEA.
  User: 11583
  Date: 2019/6/26
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>内置对象pageContext</title>

</head>
<body>
<%
session.setAttribute("username","jack");
%>
<h1>姓名<%=pageContext.getSession().getAttribute("userName")%></h1>
<%
    //跳转
pageContext.forward("login.jsp");
%>
</body>
</html>
