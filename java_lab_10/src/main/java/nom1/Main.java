package nom1;

public class Main {
    public static void main(String[] args) {
        String mas_string[]= {"hello","world","!"};

        Integer mas_integer[]= {1,2,3};
        Convertation<String> str=new Convertation<String>();
        Convertation<Integer> integer= new Convertation<Integer>();
        str.convert(mas_string);
        integer.convert(mas_integer);

        str.out();
        integer.out();
    }
}
