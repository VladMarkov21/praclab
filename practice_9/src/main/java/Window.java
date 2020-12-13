import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class Window extends JFrame {


    private LabClassDriver labClassDriver;
    private JPanel panel;
    private JMenuBar menuBar;
    private JTextArea textArea;
    private JButton button_add;
    private JButton button_sort;
    private JTextArea area1;
    JTextField name, sername, middle_name, inn;


    public Window() {
        super("User table");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        labClassDriver = new LabClassDriver();
        // Создание текстовых полей
        name = new JTextField(15);
        name.setToolTipText("Имя");
        sername = new JTextField(15);
        sername.setToolTipText("Фамилия");
        middle_name = new JTextField(15);
        middle_name.setToolTipText("Отчество");
        inn = new JTextField(15);
        inn.setToolTipText("ИНН");
        button_add = new JButton("Добавить заказ");
        button_sort = new JButton("Сортировать по ИНН");
        button_add.setSize(60, 70);
        button_sort.setSize(60, 70);
        final JTextArea area1 = new JTextArea(100, 45);
        area1.setFont(new Font("Dialog", Font.PLAIN, 14));
        area1.setTabSize(10);

        button_sort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labClassDriver.sort(0, labClassDriver.size() - 1);
                area1.setText( labClassDriver.toString());


            }
        });

        button_add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                try {
                    int inn_ = Integer.parseInt(inn.getText());
                    if (labClassDriver.find(inn_)) {
                        labClassDriver.addPerson(name.getText(), sername.getText(), middle_name.getText(), Integer.parseInt(inn.getText()));

                        area1.setText("         Заказ добавлен!");
                    } else area1.setText("Пользователь с указанным ИНН не существует");

                } catch (NumberFormatException ex) {
                    area1.setText("      " +
                            "     Ошибка при вводе данных, повторите ввод !   ");

                    System.err.println(ex.getMessage());
                }


            }
        });


        // Настройка шрифта
        sername.setFont(new Font("Dialog", Font.PLAIN, 14));
        sername.setHorizontalAlignment(JTextField.RIGHT);
        name.setHorizontalAlignment(JTextField.RIGHT);
        middle_name.setHorizontalAlignment(JTextField.RIGHT);
        inn.setHorizontalAlignment(JTextField.RIGHT);
        // Слушатель окончания ввода


        // Создание панели с текстовыми полями
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));

        contents.add(name);
        contents.add(sername);
        contents.add(middle_name);
        contents.add(inn);
        contents.add(button_add);
        contents.add(button_sort);
        contents.add(new JScrollPane(area1));

        setContentPane(contents);
        // Определяем размер окна и выводим его на экран
        setSize(500, 700);
        setVisible(true);


    }


}
