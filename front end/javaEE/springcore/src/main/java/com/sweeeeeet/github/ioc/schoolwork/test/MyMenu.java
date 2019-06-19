package com.sweeeeeet.github.ioc.schoolwork.test;

// 2.系统主界面程序代码（含有菜单）
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class MyMenu extends Frame implements ActionListener
{
    public MyMenu()
    {
        super("学生管理系统");
        setSize(400,300);
        setBackground(Color.lightGray);
        setVisible(true);
        setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();								  									    System.exit(0);
            }
        });
        Menu file=new Menu("文件");
        MenuItem exit=new MenuItem("退出");
        file.add(exit);
        Menu student=new Menu("学生信息管理");
        MenuItem ins=new MenuItem("增加学生信息");
        MenuItem del=new MenuItem("删除学生信息");
        MenuItem upd=new MenuItem("修改学生信息");
        MenuItem sel=new MenuItem("查找学生信息");
        student.add(ins);student.add(del);student.add(upd);student.add(sel);
        MenuBar hyf=new MenuBar();
        hyf.add(file);hyf.add(student);
        setMenuBar(hyf);
        exit.addActionListener(this);
        ins.addActionListener(this);
        del.addActionListener(this);
        upd.addActionListener(this);
        sel.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String strCmd=e.getActionCommand();
        if(strCmd.equals("退出")){
            System.exit(0);
        }
        if(strCmd.equals("增加学生信息")){
            Insert ins=new Insert();
        }

        if(strCmd.equals("删除学生信息")){
            Insert del=null;
        }
        if(strCmd.equals("修改学生信息")){
            Update upd=new Update();
        }
        if(strCmd.equals("查询学生信息")){
            Select sel=new Select();
        }
        repaint();
    }
}

