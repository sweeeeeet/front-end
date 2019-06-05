package com.github.sweeeeeet.web_xml;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:sweet
 * Created:2019/4/17
 */

    public class Contact {
    private String id;
    private String name;
    private String gender;
    private String phone;
    private String address;
    private String email;

    public Contact() {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



public static List<Contact> getContactXML() throws DocumentException {
    /*
     * 获取文本：先获取标签对象，再获取文本{
     * 1.父标签对象.elementText()
     * 2.标签对象.getText();
     * */
    //读取xml文件-->List<Concat>
    Document doc= new SAXReader()
            .read(Contact.class.getClassLoader().getResource("contact.xml"));
    //创建List集合
    List<Contact> list=new ArrayList<Contact>();
    //获取当前所有同名的contact 标签
    List<Element> conList=doc.getRootElement().elements("contact");
    for(Element e:conList){
        Contact contact=new Contact();
        contact.setId(e.attributeValue("id"));
        contact.setName(e.elementText("name"));
        contact.setEmail(e.elementText("email"));
        contact.setPhone(e.elementText("phone"));
        contact.setGender(e.elementText("gender"));
        contact.setAddress(e.elementText("address"));
        list.add(contact);
    }
    //遍历List集合
    for(Contact contact:list){
        System.out.println(contact);
    }

return list;
}


    public static void main(String[] args) {
        try {
            getContactXML();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


