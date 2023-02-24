package com.avging.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Set;

public class Check {
    public Check() {
        JFrame frame = new JFrame("查询学生信息");
        JPanel jp = new JPanel();
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(2201,"张三");
        hm.put(2202,"李四");
        hm.put(2203,"王五");
        hm.put(2204,"赵六");
        hm.put(2205,"田七");

        JLabel label1 = new JLabel("学号" + "       " + "姓名" + "                  ");
        jp.add(label1);
        Set<Integer> keys = hm.keySet();
        for (Integer key : keys) {
            String value = hm.get(key);
            JLabel label = new JLabel(key + "      " + value + "                  ");
            jp.add(label);
        }

        frame.add(jp);


        Util.initFrame(frame,250,150,false);
    }
}
