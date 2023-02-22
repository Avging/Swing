package com.alarm.swing;

import javax.swing.*;

public class HelloJava {
    JFrame frame;
    JPanel panel;
    JLabel label;
    public HelloJava(){  //构造方法
        frame = new JFrame("Hello Java");//创建窗体对象frame
        panel = new JPanel();
        label = new JLabel("Hello Java");//创建一文本标签
        panel.add(label);
//        frame.setVisible(true);//设置窗体的可见性
//        frame.setSize(400,400);//设置窗体的大小
        frame.add(panel);
        Util.initFrame(frame,250,150,false);
    }

    public static void main(String[] args) {
        HelloJava obj = new HelloJava();
    }
}
