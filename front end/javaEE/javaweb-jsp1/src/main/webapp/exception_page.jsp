<%--
  Created by IntelliJ IDEA.
  User: 11583
  Date: 2019/6/26
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
errorPage="error_page.jsp" %>
<html>
<head>
    <title>测试Exception</title>

</head>
<body>
<%
//若在脚本块里写代码遭成异常，会将错误信息以乱码打印到终端
    //因此使用errorPage="error_page.jsp" 使异常转发到指定页面
    out.print(10/0);
%>
</body>
</html>
