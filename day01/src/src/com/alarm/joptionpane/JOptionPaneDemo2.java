package src.com.alarm.joptionpane;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPaneDemo2 extends JFrame {
    public static void main(String[] args) {
        new JOptionPaneDemo2();
    }

    public JOptionPaneDemo2() {
        JButton button1 = new JButton("消息对话框");
        JButton button2 = new JButton(("确认对话框"));
        JButton button3 = new JButton("选项对话框");

        //为第二个按钮绑定单击事件
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //确认对话框
                JOptionPane.showMessageDialog(button2,"确认信息");
                JOptionPane.showMessageDialog(button2,"确认信息","标题",JOptionPane.DEFAULT_OPTION);
                JOptionPane.showMessageDialog(button2,"确认信息","标题",JOptionPane.YES_NO_OPTION);
                JOptionPane.showMessageDialog(button2,"确认信息","标题",JOptionPane.YES_NO_CANCEL_OPTION);
                JOptionPane.showMessageDialog(button2,"确认信息","标题",JOptionPane.OK_CANCEL_OPTION);
                JOptionPane.showMessageDialog(button2, "确认信息", "标题", JOptionPane.OK_CANCEL_OPTION);
            }
        });
    }
}
