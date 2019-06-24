<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.*" %>
<%--
  Created by IntelliJ IDEA.
  User: 11583
  Date: 2019/6/23
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第一个jsp页面</title>
</head>
<body>
<h1>欢迎来到JSP页面</h1>
<%--jsp注释，html页面中不可见--%>
<!--html注释，客户端页面可见-->


<%
    //脚本中的单行注释
    String datetime = LocalDateTime.now().toString();
    out.println(datetime);
%>

<div>
<%
    StringBuilder sb = new StringBuilder();
    sb.append("java")
    .append(" ")
    .append(" php");
    out.println(sb);
%>
</div>


<%--html代码中包含jsp脚本语言--%>
<div>
    <%--声明变量--%>
    <%!
    String name="jack";
    int add(int a,int b){
        return a+b;
        }
    %>


    <p>名称
        <%--脚本语言代码--%>
        <%
        out.println(name);
        %>
        计算求和1+2：
        <%
        out.println(add(1,2));
        %>
    </p>

</div>

<div>
    <%--将map中的元素按照表格打印--%>


    <table>
        <thead>
        <tr>
            <td>

            </td>
            <td>
                城市
            </td>
            <td>
                景点
            </td>
        </tr>
        </thead>
        <tbody>
        <%!
            Map<String,List<String>> map=new HashMap<>();
        %>
        <%
            map.put("西安",Arrays.asList("大雁塔","兵马俑"));
            map.put("宝鸡",Arrays.asList("太白山","法门寺"));
            map.put("咸阳",Arrays.asList("乾陵","茂陵"));
            int i=0;
        for(Map.Entry<String,List<String>> entry:map.entrySet()) {

            String city=entry.getKey();
            List<String> spots=entry.getValue();
            for(String spot:spots){
                i++;

                %>

        <tr>
            <td>
                <%
                out.println(i);
                %>
            </td>
            <td>
                <%
                    out.println(city);
                %>
            </td>
            <td>
                <%
                    out.println(spot);
                %>
            </td>
        </tr>
       <%
               }
           }
           %>

        </tbody>

    </table>
</div>

<div>
    <p>
        表达式的用法
    </p>
    <%!
        String css="color: aquamarine";
    %>
    <p style="<%=css%>">
        姓名：<%=name%>
    </p>

</div>
</body>
</html>

