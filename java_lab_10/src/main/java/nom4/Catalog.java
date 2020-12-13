package nom4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Catalog<T> implements Icatalog{
     private ArrayList<T> arrayList =new ArrayList<T>();
    public void setCatalog(Iterator iterator) {
        while (iterator.hasNext()){
            arrayList.add((T) iterator.next());
        }
    }

    public void setCatalog(Object[] mas) {

        for(int i=0;i< mas.length;i++){
            arrayList.add((T) mas[i]);
        }
    }

    public void getFirstFive() throws IOException {

        if(arrayList.size()<5) throw new IOException("Размер коллекции меньше 5");
        for(int i=0;i<5;i++){
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();
    }
}
