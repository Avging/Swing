package src.com.alarm.jdialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogDemo2 extends JFrame {
    public static void main(String[] args) {
        new JDialogDemo2();
    }

    //定义一个对话框
    private JDialog dialog = new JDialog(JDialogDemo2.this,"");
    //创建三个按钮
    JButton button1 = new JButton("模态对话框");
    JButton button2 = new JButton("非模态对话框");
    JButton button3 = new JButton("确定");
    public JDialogDemo2()  {
        //为第一个按钮注册单击事件监听器
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //创建一个模态对话框
                dialog = new JDialog(JDialogDemo2.this,true);
                dialog.setLayout(new FlowLayout());  //采用流式布局
                JLabel label = new JLabel("这是模态对话框");  //创建标签
                dialog.add(label);  //将标签添加到对话框
                dialog.add(button3);  //将按钮添加到对话框
                dialog.setTitle("模态对话框");  //设置对话框的标题
                dialog.setBounds(80,80,100,100);  //设置对话框的显示位置
                dialog.setVisible(true);
            }
        });

        //为第二个按钮注册单击事件监听器
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //创建一个非模态对话框
                dialog = new JDialog(JDialogDemo2.this,false);
                dialog.setLayout(new FlowLayout());
                JLabel label = new JLabel("这是非模态对话框");
                dialog.add(label);
                dialog.add(button3);
                dialog.setTitle("非模态对话框");
                dialog.setBounds(80,80,100,100);
                dialog.setVisible(true);
            }
        });

        //为第三个按钮注册单击事件监听器
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();  //关闭对话框
            }
        });

        this.setLayout(new FlowLayout());  //窗体采用流式布局
        this.add(button1);  //主窗体添加第一个按钮
        this.add(button2);  //主窗体添加第二个按钮
        this.setTitle("父窗体");  //为主窗体设置标题
        this.setVisible(true);
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
