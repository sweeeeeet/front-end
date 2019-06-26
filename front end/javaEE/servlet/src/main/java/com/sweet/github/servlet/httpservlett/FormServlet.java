package com.sweet.github.servlet.httpservlett;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author:sweet
 * Created:2019/6/24
 */
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer=resp.getWriter();
        writer.append("<html>")
                .append("<head>")
                .append("<title>")
                .append("登录")
                .append("</title>")
                .append("</head>")
                .append("<body>")
                .append("<form action='handlerServlet' method='post'>")
                .append("username:<input type='text' name='username'/></br>")
                .append("password:<input type='password' name='password'/></br>")
                .append("<input type='submit' value='submit'>" )
                .append("<input type='reset' value='reset'>")
                .append("</form>")
                .append("</body>")
                .append("</html>");
    }
}
