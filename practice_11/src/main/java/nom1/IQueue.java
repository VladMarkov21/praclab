package nom1;

public interface IQueue<E> {
    public void addqueu(E element);
    public E element();
    public E dequeue();
    public  int size();
    public boolean isEmpty();
    public void clear();
}
