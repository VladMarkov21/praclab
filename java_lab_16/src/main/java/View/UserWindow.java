package View;

import Logik.Dish;
import Logik.Drink;
import Logik.DrinkTypeEnum;
import Logik.InternetOrder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class UserWindow extends JFrame {
    private JPanel panel;
    private JMenuBar menuBar;
    private JTextArea textArea;
    private InternetOrder internetOrder;

    public UserWindow(){
        super("Кабинет пользователя");
         internetOrder = new InternetOrder();



        setSize(700,500);
        this.panel=new JPanel();
        this.menuBar= new JMenuBar();
        this.textArea= new JTextArea(1,1);
        textArea.setFont(new Font("TimesRoman",Font.BOLD,30));
        textArea.setBackground(Color.lightGray);




        JMenu drink=new JMenu("Добавить напитки");
        JMenu dish = new JMenu("Добавить блюдо");
        JMenu do_ = new JMenu("Оформить заказ");


        //JMenu menucolor= new JMenu("Получить данные по всем пользователям");

        add(textArea);


        JMenuItem do__= new JMenuItem("Приступить к оформлению заказа");

        JMenuItem juice= new JMenuItem("Сок");
        JMenuItem water= new JMenuItem("Вода");
        JMenuItem wine= new JMenuItem("Вино");

        JMenuItem rice= new JMenuItem("Рис");
        JMenuItem chiken= new JMenuItem("Курица");
        JMenuItem potatoes= new JMenuItem("Картошка");
        do__.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                EndWindow endWindow = new EndWindow(internetOrder);
                endWindow.setVisible(true);
            }
        });

        juice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Drink drink1= new Drink(100,"Сок"," ", DrinkTypeEnum.Juice);
                internetOrder.add(drink1);
                textArea.setText("Сок добавлен в заказ ");
            }
        });

        water.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Drink drink1= new Drink(90,"Вода"," ", DrinkTypeEnum.Water);
                internetOrder.add(drink1);
                textArea.setText("Вода добавлена в заказ ");
            }
        });
        wine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Drink drink1= new Drink(300,"Вино"," ", DrinkTypeEnum.Wine);
                internetOrder.add(drink1);
                textArea.setText("Вино добавлено в заказ ");
            }
        });
        rice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dish dish1= new Dish(100,"Рис"," ");
                internetOrder.add(dish1);
                textArea.setText("Рис добавлен в заказ ");
            }
        });
        rice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dish dish1= new Dish(100,"Рис"," ");
                internetOrder.add(dish1);
                textArea.setText("Рис добавлен в заказ ");
            }
        });
        chiken.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dish dish1= new Dish(150,"Курица"," ");
                internetOrder.add(dish1);
                textArea.setText("Курица добавлена в заказ ");
            }
        });
        potatoes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dish dish1= new Dish(80,"Картошка"," ");
                internetOrder.add(dish1);
                textArea.setText("Картошка добавлена в заказ ");
            }
        });





        JMenuItem menu_postClient = new JMenuItem("Добавить клиента");
        menu_postClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });


        drink.setMnemonic(KeyEvent.VK_C);
        dish.setMnemonic(KeyEvent.VK_C);
        do_.setMnemonic(KeyEvent.VK_C);

        drink.add(juice);
        drink.add(water);
        drink.add(wine);
        dish.add(rice);
        dish.add(chiken);
        dish.add(potatoes);
        do_.add(do__);


        menuBar.add(drink);
        menuBar.add(dish);
        menuBar.add(do_);

        //menuBar.add(menucolor);

        setJMenuBar(menuBar);


    }
}
