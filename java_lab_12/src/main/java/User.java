import java.io.IOException;
import java.util.Scanner;

public class User {
    private String stroka;
    Parse parse = new Parse();

    public void enterPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Придумайте и введите новый пароль!");
        this.stroka = scanner.nextLine();
        this.verify(stroka);
    }

    public void verify(String stroka) {
        try {
            parse.findSize(stroka);
            parse.findMinValue(stroka);
            parse.findSize(stroka);
            System.out.println("Пороль успешно сохранен !");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
