package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseL extends JFrame{

    public void layoutStart(){

        setLayout(null);
        setSize(1000,1000);


        JButton jButton = new JButton("Center");
        jButton.setBounds(350,350,300,300);
        jButton.setBackground(Color.ORANGE);
        add(jButton);
        jButton.setVisible(true);

        jButton.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) { }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в наш мир!)");
            }
            public void mouseExited(MouseEvent e) { }
        });

        JButton jButtonEast = new JButton("EAST");
        jButtonEast.setBounds(0,350,300,300);
        add(jButtonEast);
        jButtonEast.setBackground(Color.RED);
        jButtonEast.setVisible(true);

        jButtonEast.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) { }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Дахране");
            }
            public void mouseExited(MouseEvent e) { }
        });


        JButton jButtonWest = new JButton("West");
        jButtonWest.setBounds(700,350,300,300);
        add(jButtonWest);
        jButtonWest.setBackground(Color.GREEN);
        jButtonWest.setVisible(true);

        jButtonWest.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) { }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Джидда");
            }
            public void mouseExited(MouseEvent e) { }
        });

        JButton jButtonNorth = new JButton("North");
        jButtonNorth.setBounds(350,0,300,300);
        add(jButtonNorth);
        jButtonNorth.setBackground(Color.CYAN);
        jButtonNorth.setVisible(true);

        jButtonNorth.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) { }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Novigrad");
            }
            public void mouseExited(MouseEvent e) { }
        });


        JButton jButtonSouth = new JButton("South");
        jButtonSouth.setBounds(350,700,300,300);
        jButtonSouth.setBackground(Color.PINK);
        add(jButtonSouth);
        jButtonNorth.setVisible(true);

        jButtonSouth.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) { }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Абха");
            }
            public void mouseExited(MouseEvent e) { }
        });


        setVisible(true);

    }

    public static void main(String[] args) {
        MouseL mouseL = new MouseL();
        mouseL.layoutStart();
    }

}

