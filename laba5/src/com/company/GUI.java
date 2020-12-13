package com.company;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    GUI(String src){
        super("cat");
        //JPanel panel = new JPanel();
        ImageIcon img = new ImageIcon(src);
        JLabel imgLabel = new JLabel(img);
        setSize(500,500);
        add(imgLabel);
        //add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}