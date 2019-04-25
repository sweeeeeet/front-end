package www.github.sweeeeeet.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Author:sweet
 * Created:2019/4/20
 */
public class MySAX {
    /*SAX解析
    * 开发步骤：创建SAX解析器对象
    * 读取contact.xml文件
    * 注册事件监听器：DefaultHandler,扩展此类
    * 自定义一个类，继续    DefaultHandler，覆盖它里面的方法

     * */
    public static void main(String[] args) throws Exception {
        //创建SAXParser解析器对象,SAXParser是一个抽象类，他的实例需要通过工厂方法实现
        SAXParser parser=SAXParserFactory.newInstance().newSAXParser();//多态
        //解析
        //注册监听事件
        MyDefaultHandler1 handler2=new MyDefaultHandler1();
        parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("contact.xml"),handler2);
        String content=handler2.getString();
        System.out.println(content);
    }
}
