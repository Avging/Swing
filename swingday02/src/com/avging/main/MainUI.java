package com.avging.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI {
    public MainUI(){
        JFrame frame = new JFrame("学生管理系统");
        FlowLayout flowLayout = new FlowLayout();
        JPanel jp = new JPanel();
        JButton button1 = new JButton("添加");
        JButton button2 = new JButton("查询");
        JButton button3 = new JButton("删除");
        jp.add(button1);
        jp.add(button2);
        jp.add(button3);
        frame.add(jp);

        //绑定添加按钮的单击事件
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Add();
            }
        });

        //绑定查询按钮的单击事件
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Check();
            }
        });

        //绑定删除按钮的单击事件
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Delete();
            }
        });

        Util.initFrame(frame,250,150,false);
    }
}
