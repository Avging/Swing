package src.com.alarm.joptionpane;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPaneDemo1 extends JFrame {
    public static void main(String[] args) {
        new JOptionPaneDemo1();
    }

    public JOptionPaneDemo1() {
        JButton button1 = new JButton("消息对话框");
        JButton button2 = new JButton("确认对话框");

        //为第一个按钮绑定单击事件
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //消息对话框
                JOptionPane.showMessageDialog(button1,"提示消息");
                JOptionPane.showMessageDialog(button1,"提示消息","标题",JOptionPane.INFORMATION_MESSAGE);  //错误
                JOptionPane.showMessageDialog(button1,"提示消息","标题",JOptionPane.ERROR_MESSAGE);  //提示
                JOptionPane.showMessageDialog(button1,"提示消息","标题",JOptionPane.WARNING_MESSAGE);  //警告
                JOptionPane.showMessageDialog(button1,"提示消息","标题",JOptionPane.QUESTION_MESSAGE);  //询问
                JOptionPane.showMessageDialog(button1,"提示消息","标题",JOptionPane.PLAIN_MESSAGE);  //无图标消息
            }
        });
    }
}
