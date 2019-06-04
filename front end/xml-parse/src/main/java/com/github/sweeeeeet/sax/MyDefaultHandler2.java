package com.github.sweeeeeet.sax;
import com.github.sweeeeeet.web_xml.Contact;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:sweet
 * Created:2019/4/20
 */
/*
 * 事件处理程序
 * 逻辑需要自己定义
 *
 * */
public class MyDefaultHandler2 extends DefaultHandler {
    List<Contact> list = new ArrayList<Contact>();
    private Contact contact = null;
    private String curTag;

    public List<Contact> getList() {
        return list;
    }


    /*
     * 文档开始时 触发此方法
     * */
    @Override
    public void startDocument() throws SAXException {

    }

    /**
     * @Description: 当遇见开始标签时触发方法
     * @Param: qName:开始标签名称
     * attributes 属性列表
     * @return:
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        curTag = qName;
        //如何判断读到的是开始标签
        if (qName.equals("contact")) {
            contact = new Contact();
            String id = attributes.getValue("id");
            contact.setId(id);
        }
    }

    /**
     * @Description: 当遇到标签的文本触发
     * @Param: ch:字符数组
     * start:从某个位置开始获取文本
     * length:指定长度：实际长度
     * @return:
     */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //遇到文本，每次读取的都是当前文本的实际内容
        String content=new String(ch,start,length);
        //判断curTag是name 还是phone...
        if("name".equals(curTag)){
            contact.setName(content);

        }
        if("phone".equals(curTag)){
            contact.setPhone(content);
        }
        if("email".equals(curTag)){
            contact.setEmail(content);

        }
        if("address".equals(curTag)){
            contact.setAddress(content);
        }
        if("gender".equals(curTag)){
            contact.setGender(content);
        }



    }


    /**
     * @Description: qName:结束标签名称
     * @Param:
     * @return:
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("contact")){
            System.out.println(contact);
        }
    }


}
