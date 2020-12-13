package View;

import Logik.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainWindow extends JFrame {
    private JPanel panel;
    private JMenuBar menuBar;
    private JTextArea textArea;
    private JTextField email,root;
    private JButton enter;
    private JLabel label;



    public MainWindow(){
        super("Система заказов");
        setSize(400,300);
        this.panel=new JPanel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создание текстовых полей
        email = new JTextField(15);
        email.setText("id@mail.ru");
        enter =new JButton("Вход");
        label = new JLabel("Авторизация : ");

        root = new JTextField(15);
        root.setText("user");
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email_= email.getText();
                String root_= root.getText();
                if(root_.equals("admin")){
                    AdminWindow adminWindow = new AdminWindow();
                    adminWindow.setVisible(true);

                }else if(root_.equals("user")){
                    ///
                    UserWindow userWindow = new UserWindow();
                    userWindow.setVisible(true);
                }
            }
        });


         /*middle_name = new JTextField(15);
        middle_name.setToolTipText("Отчество");
        */










        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(label);
        contents.add(email);

        contents.add(root);
        contents.add(enter);



        setContentPane(contents);
        // Определяем размер окна и выводим его на экран
        setSize(500, 400);
        setVisible(true);

    }
}
