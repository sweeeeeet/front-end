package com.sweeeeeet.github.ioc.schoolwork.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WyFrame extends Frame implements ActionListener {
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;

    public static int k;
    public WyFrame() {
        super("学生管理系统");
        setBackground(Color.lightGray);
        setLayout(null);
        setSize(340,280);
        this.setLocationRelativeTo(null);
        l1=new Label("username",Label.CENTER);
        l2=new Label("password",Label.CENTER);
        t1=new TextField();
        t2=new TextField();
        b1=new Button("login");
        b2=new Button("exit");
        l1.setBounds(40,45,80,30);
        l2.setBounds(40,100,80,30);
        t1.setBounds(150,55,100,25);
        t2.setBounds(150,90,100,25);
        b1.setBounds(50,145,60,30);
        b2.setBounds(145,145,60,30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l1);add(l2);add(t1);add(t2);add(b1);add(b2);

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){																				dispose();
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            k=1;
        if(e.getSource()==b2)
            k=2;
        repaint();
        if(k==1)
        {
            if(t1.getText().toString().trim().equals("201611010507")&& t2.getText().toString().trim().equals("915102"))
            {
                MyMenu tl=new MyMenu();
                this.setVisible(false);

            }
            else
            {
                if(t1.getText().toString().trim().equals("201611010507"))
                {
                    JOptionPane.showMessageDialog(this,"密码与用户名不匹配！");
                }
                else
                    JOptionPane.showMessageDialog(this,"用户名错误！");
            }
        }
        if(k==2)
        {
            dispose();
            System.exit(0);
        }
    }
}

