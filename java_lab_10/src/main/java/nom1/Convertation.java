package nom1;

import java.util.LinkedList;

public class Convertation<T> implements IConvertation {
    private LinkedList<T> linkedList= new LinkedList<T>();

    public LinkedList<T> convert(Object[] mas) {
        for(int i=0;i< mas.length;i++){
            linkedList.add((T) mas[i]);
        }
        return linkedList;
    }

    public void out() {

        for(T peremen: linkedList){
            System.out.print(peremen+" ");

        }
        System.out.println();
    }
}
