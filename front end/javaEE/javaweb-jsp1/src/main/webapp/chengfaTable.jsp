<%--
  Created by IntelliJ IDEA.
  User: 11583
  Date: 2019/6/23
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法表</title>
</head>
<body>
<div>

    <%--
    1*1=1
    1*2=2 2*2=4
    1*3=3 2*3=6 3*3=9
    --%>
    <%!
        String printTable(){
            StringBuilder sb=new StringBuilder();
            sb.append("<h1>").append("基于表达式实现的九九乘法表").append("</h1>");
            for(int i=1;i<10;i++){
                for(int j=1;j<=i;j++){
                    sb.append(j)
                            .append("*")
                            .append(i)
                            .append("=")
                            .append(i*j)
                    .append(" ");
                }
                sb.append("</br>");
            }
            return sb.toString();
        }
    %>

        <%--利用表达式打印输出--%>
    <%=printTable()%>


</div>


<div>
    <%!
    void printTable2(JspWriter out) throws Exception{
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                out.println(j+"*"+i+"="+j*i+"&nbsp;&nbsp;&nbsp;&nbsp;");
            }
            out.println("</br>");
        }
    }
    %>
    <h1>九九乘法表：基于脚本输出</h1>
    <%
    printTable2(out);
    %>
</div>
</body>
</html>
