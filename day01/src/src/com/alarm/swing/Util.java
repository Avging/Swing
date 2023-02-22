package src.com.alarm.swing;

import javax.swing.*;
import java.awt.*;

public class Util {
    public static void initFrame(JFrame frame, int width, int height, boolean flag) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();  //一个工具类
        Dimension d = toolkit.getScreenSize();   //获取屏幕此尺寸
        int x = (int)d.getWidth();
        int y = (int)d.getHeight();
        frame.setBounds((x-width)/2,(y-height)/2,width,height);  //设置坐标以及长宽
        frame.setVisible(true);   //设置可见性
        if (flag) {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //设置关闭是关闭程序还是最小化
        }
    }

    public static void initJDialog(JDialog jDialog,int width,int height) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        int x = (int)d.getWidth();
        int y = (int)d.getHeight();
        jDialog.setBounds((x-width)/2,(y-height)/2,width,height);
        jDialog.setVisible(true);
    }
}