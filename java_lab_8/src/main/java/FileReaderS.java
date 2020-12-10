import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderS {
    private String text;
    private FileWriter file;
    public FileReaderS(String text) throws IOException {
        this.text=text;
        file= new FileWriter("D:/Projects/Java_lab/java_lab_8/src/main/java/file.txt",true);
    }
    public void addStroka() throws IOException {
        file.write("\n");
        file.write(text);
        file.flush();
    }
    public void SshowTsext(){
        try(FileReader reader = new FileReader("D:/Projects/Java_lab/java_lab_8/src/main/java/file.txt")) {
            System.out.println("Text in file:");
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
