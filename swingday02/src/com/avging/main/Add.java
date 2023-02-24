package com.avging.main;

import javax.swing.*;

public class Add {
    public Add() {
        JFrame frame = new JFrame("添加学生");
        JPanel jp = new JPanel();
        JLabel label1 = new JLabel("学生学号：");
        JTextField jf = new JTextField(16);
        JLabel label2 = new JLabel("学生姓名：");
        JPasswordField jw = new JPasswordField(16);
        JButton button = new JButton("添加");

        jp.add(label1);
        jp.add(jf);
        jp.add(label2);
        jp.add(jw);
        jp.add(button);
        frame.add(jp);

        Util.initFrame(frame,250,150,false);
    }
}
