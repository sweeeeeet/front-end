package com.sweet.github.servlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.time.LocalDateTime;

/**
 * Author:sweet
 * Created:2019/6/24
 */

@WebFilter(
        urlPatterns = "/*",
        initParams = {
                @WebInitParam(name = "logging_prefix",value = "Request"),
                @WebInitParam(name =
                        "logging_filename", value = "filter.logging")
        }
)
public class LoggingFilter implements javax.servlet.Filter {
    private String prefix="";
    private String loggingFile;
    PrintWriter writer;


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.prefix = filterConfig.getInitParameter("logging_prefix");
        this.loggingFile = filterConfig.getInitParameter("logging_filename");

        String webAppRoot = filterConfig.getServletContext().getRealPath("/");
        try {
            this.writer=new PrintWriter(new File(webAppRoot,this.loggingFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Logging filter init called");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Logging filter dofilter called");
        String url = ((HttpServletRequest) request).getRequestURI();
        this.writer.println(this.prefix+" "+LocalDateTime.now()+" "+url);
        this.writer.flush();
    }

    @Override
    public void destroy() {
        System.out.println("filter destory called");
    }
}
