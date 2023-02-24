package com.avging.main;

import javax.swing.*;

public class Delete {
    public Delete() {
        JFrame frame = new JFrame("删除学生信息");
        JPanel jp = new JPanel();
        JLabel label1 = new JLabel("学生学号：");
        JTextField jf = new JTextField(16);
        JButton button = new JButton("确认删除");

        jp.add(label1);
        jp.add(jf);
        jp.add(button);
        frame.add(jp);

        Util.initFrame(frame,250,150,false);
    }
}
