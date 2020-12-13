package nom2;

public interface Queue<E> {
    public boolean add(E element);
    public E element();
    public E peek();
    public E pool();
}
