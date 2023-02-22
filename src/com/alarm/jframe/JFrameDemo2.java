package com.alarm.jframe;



import javax.swing.*;

public class JFrameDemo2 extends JFrame {
    public static void main(String[] args) {
        new JFrameDemo2();
    }

    public JFrameDemo2()  {
        this.setTitle("第一个JFrame");
        this.setVisible(true);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
