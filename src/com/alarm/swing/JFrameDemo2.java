package com.alarm.swing;

import javax.swing.*;

public class JFrameDemo2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("frame example");//创建顶层容器JFrame对象
        JPanel panel = new JPanel();//创建中间容器JPanel对象
        JButton button = new JButton("click");//定义组件，如按钮
        panel.add(button);
        frame.add(panel);
        Util.initFrame(frame,250,150,false);
    }
}
