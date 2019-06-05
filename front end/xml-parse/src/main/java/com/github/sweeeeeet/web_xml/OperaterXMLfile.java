package com.github.sweeeeeet.web_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Author:sweet
 * Created:2019/4/17
 */
public class OperaterXMLfile {

    public static void main(String[] args) throws Exception {
        /*
         * 1.添加一个空文档，添加标签添加属性
         * 2.修改标签的属性，修改文本内容
         * 3.删除标签
         * */

            //*添加相关的空文档，携带一个根节点，有且仅有一个createDocument(Element rootElement)
            Document document=DocumentHelper.createDocument();
            //*创建根节点
            Element root= document.addElement("contact-list");

//*创建子节点
            Element conEle=    root.addElement("contact");
            //*添加属性{1.使用节点对象.attribute().setValue()
//            Attribute idAttr= conEle.attribute("id");
//            idAttr.setValue("001");

            //          2.添加属性和属性值：如果属性名称一样，值会被覆盖}
            //2.
             conEle.addAttribute("id","004");




            //*设置文本内容
            //读取文本所在标签对象
          //  conEle.element("name").setText("王五");
                root.addElement("name").setText("王五");
//删除节点
      //  document.getRootElement().element("concat").detach();



            //添加到E盘
            //创建输出流对象
            OutputStream outputStream=new FileOutputStream(
                    new File("D:\\Test\\contact.xml"));
            /*
             * createPrettyPrint：优雅文件格式，有空格
             * createCompactFormat():紧凑格式，用于部署上线
             * */
            OutputFormat format=OutputFormat.createPrettyPrint();
            format.setEncoding("utf-8");
            //创建输出对象，传递流对象和输出格式
            XMLWriter writer=new XMLWriter(outputStream,format);
            writer.write(document);
            writer.close();



        }
}
