import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner In= new Scanner(System.in);
        String stroka= In.nextLine();

        FileReaderS file= new FileReaderS(stroka);

        file.addStroka();
        file.SshowTsext();
    }
}
