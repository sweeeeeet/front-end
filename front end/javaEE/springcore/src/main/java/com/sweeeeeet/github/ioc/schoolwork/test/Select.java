package com.sweeeeeet.github.ioc.schoolwork.test;

// 5.查找学生记录界面程序设计
import java.awt.*;
import java.awt.event.*;

public class Select extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    Button b1,b2;

    public Select()
    {
        super("学生管理查询学生界面");
        setBackground(Color.lightGray);
        setLayout(null);
        l1=new Label("姓名",Label.CENTER);
        l2=new Label("性别",Label.CENTER);
        l3=new Label("出生日期",Label.CENTER);
        l4=new Label("学号",Label.CENTER);
        l5=new Label("计算机成绩",Label.CENTER);
        l6=new Label("英语成绩",Label.CENTER);
        l7=new Label("数学成绩",Label.CENTER);
        l8=new Label("最大值",Label.CENTER);
        l9=new Label("最小值",Label.CENTER);
        l10=new Label("平均值",Label.CENTER);
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t4=new TextField();
        t5=new TextField();
        t6=new TextField();
        t7=new TextField();
        t8=new TextField();
        t9=new TextField();
        t10=new TextField();
        b1=new Button("查询");
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
        add(t8);add(t9);add(t10);
        add(l8);add(l9);add(l10);

        l1.setBounds(40,60,70,30);
        l2.setBounds(40,90,70,30);
        l3.setBounds(40,120,70,30);
        l4.setBounds(40,150,70,30);
        l5.setBounds(40,180,70,30);
        l6.setBounds(40,210,70,30);
        l7.setBounds(40,240,70,30);
        l8.setBounds(40,270,70,30);
        l9.setBounds(40,300,70,30);
        l10.setBounds(40,330,70,30);

        t1.setBounds(120,60,100,30);
        t2.setBounds(120,90,100,30);
        t3.setBounds(120,120,100,30);
        t4.setBounds(120,150,100,30);
        t5.setBounds(120,180,100,30);
        t6.setBounds(120,210,100,30);
        t7.setBounds(120,240,100,30);
        t8.setBounds(120,270,100,30);
        t9.setBounds(120,300,100,30);
        t10.setBounds(120,330,100,30);
        b1.setBounds(100,370,80,30);
        b2.setBounds(200,370,80,30);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
                System.exit(0);
            }
        });
        setSize(400,450);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String strCmd=e.getActionCommand();
        if(strCmd.equals("退出")) this.hide();
        if(strCmd.equals("查询"))
        {
            t1.setText(Insert.tl.name.toString());
            t2.setText(String.valueOf(Insert.tl.sex));
            t3.setText(Insert.tl.birthday);
            t4.setText(Insert.tl.number);
            t5.setText(String.valueOf(Insert.tl.getcompScore()));
            t6.setText(String.valueOf(Insert.tl.getengScore()).toString());
            t7.setText(String.valueOf(Insert.tl.getmathScore()).toString());
            t8.setText(String.valueOf(Insert.tl.getMaxScore()));
            t9.setText(String.valueOf(Insert.tl.getMinScore()));
            t10.setText(String.valueOf(Insert.tl.getAverScore()));
        }
        repaint();
    }
}

