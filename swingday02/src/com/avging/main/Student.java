package com.avging.main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringWriter;
import java.sql.*;
import java.util.HashMap;

public class Student {
    JTextArea txtDeptInfo;
    public static void main(String[] args) {
        JFrame frame = new JFrame("学生管理系统");
        JPanel p = new JPanel();
        JLabel label1 = new JLabel("账号：");
        JTextField jf = new JTextField(20);
        JLabel label2 = new JLabel("密码：");
        JPasswordField jp = new JPasswordField(20);
        JButton button = new JButton("登录");

        HashMap<String,String> hm = new HashMap<>();
        hm.put("2201","1122hh");

        button.addActionListener(new ActionListener() {//绑定登录按钮的单击事件
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jf.getText();//获取账号
                String text1 = jp.getText();//获取密码
//                System.out.println("text = " + text);
//                System.out.println("text1 = " + text1);
                if(hm.containsKey(text) && hm.containsValue(text1)) {
                    frame.setVisible(false);
                    new MainUI();
                }

            }
        });
        p.add(label1);
        p.add(jf);
        p.add(label2);
        p.add(jp);
        p.add(button);
        frame.add(p);
        Util.initFrame(frame,250,150,false);
    }

    public void searchInfoByAll() {
        Connection con = null;  //声明连接变量
        try{
            Class.forName("com.mysql.jdbc.Driver");//加载驱动程序类
            //建立与数据库的连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/he");
            Statement stat = con.createStatement();//创建语句类对象
            ResultSet rs = null;
            rs = stat.executeQuery("select * from departments");  //执行查询返回结果
            txtDeptInfo.append("dept_code" + "      " + "deptname" + "\n");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
