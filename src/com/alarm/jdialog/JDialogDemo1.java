package com.alarm.jdialog;

import javax.swing.*;

public class JDialogDemo1 {
    public static void main(String[] args) {
        JDialog d = new JDialog();
        d.setTitle("对话框");
        d.setVisible(true);
        d.setSize(300,300);
        d.setLocationRelativeTo(null);
    }
}
