package View;

import Logik.Dish;
import Logik.Drink;
import Logik.DrinkTypeEnum;
import Logik.InternetOrder;
import Logik.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class EndWindow extends JFrame {

    private InternetOrder internetOrder;
    private JPanel panel;
    private JMenuBar menuBar;
    private JTextArea textArea;


    public EndWindow(final InternetOrder internetOrder){
        super("Оформить заказ");
        this.internetOrder=internetOrder;


        setSize(700,500);
        this.panel=new JPanel();
        this.menuBar= new JMenuBar();
        this.textArea= new JTextArea(1,1);
        textArea.setFont(new Font("TimesRoman",Font.BOLD,20));
        textArea.setBackground(Color.lightGray);




        JMenu allmenu=new JMenu("Мой заказ ");
        JMenu prize = new JMenu("Цена заказа");
        JMenuItem allmenu_ =new JMenuItem("Вывести на экран");
        JMenuItem prize_= new JMenuItem("Вывести на экран");
        //JMenu  = new JMenu("Оформить заказ");


        //JMenu menucolor= new JMenu("Получить данные по всем пользователям");

        add(textArea);



        allmenu_.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String context =new String();
                MenuItem menuItem[]=internetOrder.getItems();
                for(MenuItem menuItem1:menuItem){
                    if(menuItem1!=null)
                    context+=menuItem1.toString()+" \n";
                }
                textArea.setText(context);

            }
        });
        prize_.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String prize=String.valueOf(internetOrder.costTotal());
                textArea.setText(prize);
            }
        });











        allmenu.setMnemonic(KeyEvent.VK_C);
        prize.setMnemonic(KeyEvent.VK_C);

        allmenu.add(allmenu_);
        prize.add(prize_);



        menuBar.add(allmenu);
        menuBar.add(prize);

        //menuBar.add(menucolor);

        setJMenuBar(menuBar);


    }
}
