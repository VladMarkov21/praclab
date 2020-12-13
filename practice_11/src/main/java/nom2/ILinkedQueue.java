package nom2;

public interface ILinkedQueue<E> {
    public boolean add(E element);
    public boolean contains(E object);
    public boolean isEmpty();
    public E peek();
    public E pool();
}
