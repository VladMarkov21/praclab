package nom4;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalog<String> string = new Catalog<String>();
        Catalog<Integer> integer = new Catalog<Integer>();

        // Создадим два массива и одну коллекцию
        List<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");
        list.add("f");
        Integer arr[] = {1, 12, 3, 4, 5};
        String mas[] = {"Hello", "world", "!", "oo", "pp"};
// ->
        string.setCatalog(list.iterator());
        try {
            string.getFirstFive();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        // ->
        integer.setCatalog(arr);
        try {
            integer.getFirstFive();
        } catch (IOException e) {
            System.err.println(e.getMessage());

        }
    }
}
