package com.alarm.jframe;

import javax.swing.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("第一个JFrame");
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
}
