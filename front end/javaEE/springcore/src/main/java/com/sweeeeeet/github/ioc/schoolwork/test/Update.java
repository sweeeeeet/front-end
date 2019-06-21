package com.sweeeeeet.github.ioc.schoolwork.test;

// 4.修改学生记录界面程序代码
import java.awt.*;
import java.awt.event.*;

public class Update extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6,l7;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Button b1,b2;
    public static String a1,a2,a3,a4,a5,a6,a7;
    public Update()
    {
        super("学生管理增加学生界面");
        setBackground(Color.lightGray);
        setLayout(null);
        l1=new Label("姓名",Label.CENTER);
        l2=new Label("性别",Label.CENTER);
        l3=new Label("出生日期",Label.CENTER);
        l4=new Label("学号",Label.CENTER);
        l5=new Label("计算机成绩",Label.CENTER);
        l6=new Label("英语成绩",Label.CENTER);
        l7=new Label("数学成绩",Label.CENTER);
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t4=new TextField();
        t5=new TextField();
        t6=new TextField();
        t7=new TextField();
        b1=new Button("确定");
        b2=new Button("退出");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(l4);add(t4);
        add(l5);add(t5);
        add(l6);add(t6);
        add(l7);add(t7);
        add(b1);add(b2);
        l1.setBounds(40,60,70,30);
        l2.setBounds(40,90,70,30);
        l3.setBounds(40,120,70,30);
        l4.setBounds(40,150,70,30);
        l5.setBounds(40,180,70,30);
        l6.setBounds(40,210,70,30);
        l7.setBounds(40,240,70,30);
        t1.setBounds(120,60,100,30);
        t2.setBounds(120,90,100,30);
        t3.setBounds(120,120,100,30);
        t4.setBounds(120,150,100,30);
        t5.setBounds(120,180,100,30);
        t6.setBounds(120,210,100,30);
        t7.setBounds(120,240,100,30);
        b1.setBounds(100,280,80,30);
        b2.setBounds(200,280,80,30);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
                System.exit(0);
            }
        });//关闭窗口
        setSize(400,350);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        String strCmd=e.getActionCommand();
        if(strCmd.equals("退出")){ this.hide();}
        if(strCmd.equals("确定"))
        {
            a1=t1.getText();
            String a2=t2.getText();
            char c1[]=a2.toCharArray();
            a3=t3.getText();
            a4=t4.getText();
            a5=t5.getText();
            a6=t6.getText();
            a7=t7.getText();
            Insert.tl.name=a1;
            Insert.tl.sex=c1[0];
            Insert.tl.birthday=a3;
            Insert.tl.number=a4;

            Insert.tl.setcompScore( Integer.parseInt(a5.trim()));
            Insert.tl.setengScore(Integer.parseInt(a6.trim()));
            Insert.tl.setmathScore(Integer.parseInt(a7.trim()));
        }
        repaint();
    }
}

