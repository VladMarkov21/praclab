package nom3;

import nom3.Array;

/*
3.	Реализовать метод, который возвращает любой элемент массива по индексу.
 */
public class Main {
    public static void main(String[] args) {
        Array<String> array1= new Array<String>();
        array1.add("first");
        array1.add("second");
        array1.add("third");
        array1.out();
        Array<Integer> array2=new Array<Integer>();
        array2.add(1);
        array2.add(2);
        array2.add(3);
        System.out.print("Доступ по индексу:"+ "\n");
        System.out.println(array1.getByIndex(1));
        System.out.println(array2.getByIndex(0)+"\n");
        array2.out();
    }
}
