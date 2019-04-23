package www.github.sweeeeeet.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Author:sweet
 * Created:2019/4/20
 */
/*
* 事件处理程序
* 逻辑需要自己定义
*需求：将concat.xml文件原封不动的打印出来
*
* */
public class MyDefaultHandler1 extends DefaultHandler {
    //构造一个字符串缓冲区StringBuilder
    private StringBuilder sb=new StringBuilder();
    //定义成员方法
    public  String getString(){
        return sb.toString();
    }



    /*
    * 文档开始时 触发此方法
    * */
    @Override
    public void startDocument() throws SAXException {
        System.out.println("MyDefaultHandler.startDocument：文档开始了");
    }

   /**
   * @Description: 当遇见开始标签时触发方法
   * @Param:  qName:开始标签名称
    * attributes 属性列表
   * @return:
   */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        sb.append("<"+qName);
        //attribute遍历，获取每一个属性，属性值中的双引号需要转义
        sb.append(">");

        System.out.println("startElement:"+qName);
    }

    /**
    * @Description: 当遇到标签的文本触发
    * @Param:  ch:字符数组
     *          start:从某个位置开始获取文本
     *          length:指定长度：实际长度
    * @return:
    */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //遇到文本，每次读取的都是当前文本的实际内容
        String content=new String(ch,start,length);
        System.out.println("characters:"+content);
    }


    /**
    * @Description: qName:结束标签名称
    * @Param:
    * @return:
    */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        sb.append("</"+qName+">");
        System.out.println();
    }


}
