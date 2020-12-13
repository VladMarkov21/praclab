package nom2;

public class Main {
    public static void main(String[] args) {
        String array[]={"Hello","world","!"};
        UneversalArrayList<String> string= new UneversalArrayList<String>();
        string.setArray(array);
        // получим элемент по индексу
        System.out.println(string.getByIndex(1));
        string.out();
    }
}
