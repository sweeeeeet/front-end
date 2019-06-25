<%--
  Created by IntelliJ IDEA.
  User: 11583
  Date: 2019/6/24
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户选择技能</title>
</head>
<body>

<h2>用户选择</h2>
<form id="skill_form" method="post" action="request_handle.jsp">
    <table>
        <tr>
            <td>用户名</td>
            <td>
                <input type="text" name="userName" id="userName" value="" placeholder="请输入用户名">

            </td>
        </tr>
        <tr>
            <td>技能</td>
            <td>
                <%--多选框checkbox
                单选框：radio
                --%>
                <input type="checkbox" name="skill" value="java"/>java
                <input type="checkbox" name="skill" value="c语言"/>c语言
                <input type="checkbox" name="skill" value="c++"/>c++
                <input type="checkbox" name="skill" value="php"/>php
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>

</form>

</body>
</html>
