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
    <title>这是测试include</title>
</head>
<body>
<%@include file="seggment/header.jsp"%>
<p>这是body的内容</p>
<p>这是body的内容</p>
<p>这是body的内容</p>
<p>这是body的内容</p>
<%--动作语句--%>
<%--flush="true":会自动调用缓冲区--%>
<jsp:include page="seggment/footer.jsp" flush="true">

</body>
</html>
