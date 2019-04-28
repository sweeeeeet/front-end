package www.github.sweeeeeet.sax;


import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Author:sweet
 * Created:2019/4/20
 */
public class MySAXDemo2 {
    /*SAX解析
    * 解析contact.xml，遇到xml标签时，将Contact联系人对象
    *
    * 开发步骤：
    * 1.构造List<Contact>
    *  2.遇到contact开始标签，创建一个联系人对象，封装属性
    *  3.遇到结束标签，读完之后，将contact 联系人对象添加到List<Contact>
    *  4.遍历集合
    * * */

    /*
    * 通讯录程序：dom解析的方式
    * 功能实现： 添加联系人 add()
    *           修改联系人update()
    *           删除联系人del()
    *           查询所有联系人findAll()
    *           退出
    *
    * */

    public static void main(String[] args) throws Exception {
        //创建SAXParser解析器对象,SAXParser是一个抽象类，他的实例需要通过工厂方法实现
        SAXParser parser=SAXParserFactory.newInstance().newSAXParser();//多态
        //解析
        //注册监听事件
        MyDefaultHandler2 handler2=new MyDefaultHandler2();
        parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("contact.xml"),handler2);


    }
}
