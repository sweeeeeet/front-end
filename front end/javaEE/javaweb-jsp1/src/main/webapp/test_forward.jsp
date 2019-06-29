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
<jsp:forward page="test_user.jsp">
    <jsp:param name="email" value="hao123@192.com"></jsp:param>
    <jsp:param name="skill" value="java,c++"></jsp:param>
</jsp:forward>

</body>
</html>
