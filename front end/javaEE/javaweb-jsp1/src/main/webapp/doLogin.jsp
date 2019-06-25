<%--
  Created by IntelliJ IDEA.
  User: 11583
  Date: 2019/6/24
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>

<%
String userName=request.getParameter("userName");
String password=request.getParameter("password");
if(userName==null||password==null){
    out.print("<h1>");
    out.print("请输入用户名和密码");
    out.print("</h1>");

}else{
    if("admin".equals(userName)&&"admin".equals(password)){
        out.print("欢迎");
        out.print(userName);
    }else{
        out.print("登陆失败");
    }
}
%>

</body>
</html>
