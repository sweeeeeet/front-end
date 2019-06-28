<%--
  Created by IntelliJ IDEA.
  User: 11583
  Date: 2019/6/24
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>处理Request Form提交数据</title>

</head>
<body>
<%
    //获取请求的参数值，会产生乱码的问题，因为浏览器的默认编码是ISO-8859-1
    request.setCharacterEncoding("UTF-8");
    String userName = request.getParameter("userName");
    String[] skills = request.getParameterValues("skill");

%>

<p> 用户名：<%out.print(userName);%></p>

<p>用户技能</p>
<ol>
    <%
        for (String skill : skills) {
    %>
    <li>
        <%
            out.print(skill);
        %>
    </li>
    <%
        }
    %>

</ol>
</body>
</html>
