package com.github.sweeeeeet.xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * Author:sweet
 * Created:2019/4/20
 */
public class XpathDemol {
    public static void main(String[] args) throws DocumentException {
        Document doc=new SAXReader().read(XpathDemol.class.getClassLoader().getResource("contact.xml"));
  //定义变量
        String xpath=null;

        //选中concat-list下的concat标签
        xpath="/concat-list/concat";

        //不分层级选中第一个concat标签
        xpath="//concat[1]";

        //不分层级 选中最后一个concat标签
        xpath="//concat[last()]";

        //选中带name属性的concat标签
        xpath="//concat[@name]";

        //逻辑与
        xpath="//concat[@name='zhangsan' and @id='1']";
        //选中文本内容为李四的name标签

        xpath="//name[text()='李四']";
        //2使用xpath技术定位节点，遍历
        //selectSingleNode(表达式)
        //selectSingleNodes()
      List<Node> list =  doc.selectNodes(xpath);
      for(Node node:list){
          System.out.println(node);
      }
    }

}
