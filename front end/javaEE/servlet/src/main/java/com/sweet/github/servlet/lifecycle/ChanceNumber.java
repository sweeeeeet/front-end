package com.sweet.github.servlet.lifecycle;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author:sweet
 * Created:2019/6/22
 */
public class ChanceNumber extends HttpServlet {
    private int chanceNumber;
    private ServletContext servletConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //通过ServletConfig对象取得web.xml中配置的参数
        String chanceNumberStr = config.getInitParameter("chance_Number");
        this.chanceNumber = Integer.valueOf(chanceNumberStr);
        //每个web应用程序只有一个上下文ServletContext
        //有了ServletContext，就可以共享应用程序中所有资料处访问得到的信息
        //并且可以动态注册web对象
        this.servletConfig = config.getServletContext();
        System.out.println("Servlet 初始化");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet service");
        String name=req.getParameter("name");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer=resp.getWriter();
        writer.append("<html>")
                .append("<head>")
        .append("<title>")
                .append("机会查看")
                .append("</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>");
        Object value=this.servletConfig.getAttribute(name);
        if(value==null){
            this.servletConfig.setAttribute(name,this.chanceNumber);
        }
        int chance= (int) this.servletConfig.getAttribute(name);
        if(chance>0){
            chance--;
            this.servletConfig.setAttribute(name,chance);
            writer.append(name)
                    .append("剩余")
                    .append(String.valueOf(chance))
                    .append("次机会");
        }else{
            writer.append("没有机会了");
        }

        writer.append("</h1>")
                .append("</body>")
                .append("</html>");
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);

    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("servlet销毁");
    }
}
