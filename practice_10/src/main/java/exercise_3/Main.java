package exercise_3;

public class Main {
    public static void main(String[] args) {
        Client client= new Client();


         ImageDocument imageDocument =  client.createNewImage(); /* создадим фотографию */
        System.out.println(client.createOpenImage(imageDocument)); /* выведем фотографию */
    }
}
