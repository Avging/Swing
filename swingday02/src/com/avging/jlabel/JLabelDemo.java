package com.avging.jlabel;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo extends JFrame {
    public static void main(String[] args) {
        new JLabelDemo();
    }

    public JLabelDemo() {
        JLabel label = new JLabel();
        label.setText("励锋科技");
        label.setFont(new Font("隶书",Font.BOLD|Font.ITALIC,36));
        label.setForeground(Color.red);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(label);  //将标签添加到主窗体中
        this.setVisible(true);
        this.setSize(250,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
