package nom3;

import java.util.ArrayList;

public interface IArray<E> {

    public E getByIndex(int index) throws ArrayIndexOutOfBoundsException;
    public void add(E element);
    public void out();


}
