package com.alarm.swing;

import javax.swing.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//创建顶层容器JFrame对象
        JButton button = new JButton("click");//定义组件，如按钮
        frame.add(button);//将组件加入到顶层容器
    }
}
