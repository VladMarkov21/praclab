package nom3;

import java.util.ArrayList;

public class Array<E> implements IArray {
    private ArrayList<E> arrayList= new ArrayList<E>();

    public E getByIndex(int index) throws ArrayIndexOutOfBoundsException{
        if(arrayList.size()>index){
            return arrayList.get(index);
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Неверный индекс");
        }
    }

    public void add(Object element) {

        arrayList.add((E) element);
    }

    public void out() {
        for(Object element:arrayList){
            System.out.print(element+" ");

        }
        System.out.println("\n");
    }


}
