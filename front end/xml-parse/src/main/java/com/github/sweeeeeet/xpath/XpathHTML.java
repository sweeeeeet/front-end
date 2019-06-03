package com.github.sweeeeeet.xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

/**
 * Author:sweet
 * Created:2019/4/20
 */
public class XpathHTML {
    public static void main(String[] args) throws DocumentException {
        //1.读文件，使用绝对路径
        SAXReader saxReader=new SAXReader();
        //获取document对象
        Document document= saxReader.read(XpathHTML.class.getClassLoader().getResource("contact.xml"));


    }
}
