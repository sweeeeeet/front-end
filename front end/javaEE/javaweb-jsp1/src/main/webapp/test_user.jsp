<%--
  Created by IntelliJ IDEA.
  User: 11583
  Date: 2019/6/26
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
request.setCharacterEncoding("UTF-8");
    String userName = request.getParameter("userName");
    String password=request.getParameter("password");

%>

<p>用户名：<%=userName%></p>
<p>用户密码：<%=password%></p>
<p>邮箱：<%=request.getParameter("email")%>></p>
<p>技能：<%=request.getParameter("skill")%>></p>

</body>
</html>