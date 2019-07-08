package com.sweet.github.servlet.httpservlett;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

/**
 * Author:sweet
 * Created:2019/6/24
 */
public class UpoadFile extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part part=req.getPart("filename");
        InputStream is= part.getInputStream();
        String appUploadPath = req.getServletContext().getRealPath("/upload");
        File file=new File(appUploadPath,part.getSubmittedFileName());
                if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();

                }
        OutputStream out=new FileOutputStream(file);
        byte[] buff=new byte[1024];
        int len=-1;
        while ((len=is.read(buff))!=-1){
            out.write(buff,0,len);

        }
        out.close();
        is.close();
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer=resp.getWriter();
        writer.append("<html>")
                .append("<head>")
                .append("<meta charset='UTF-8'>")
                .append("<title>File</title>")
                .append("</head>")
                .append("<body>")
                .append("<a href='>")
                .append("/upload/").append(part.getSubmittedFileName())
                .append("'>")
                .append("上传的文件")
                .append("</a>")
                .append("</body>")
                .append("</html>");


    }
}
