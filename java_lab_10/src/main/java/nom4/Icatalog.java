package nom4;

import java.io.IOException;
import java.util.Iterator;

public interface Icatalog<T> {
    public void setCatalog(Iterator<T> iterator);
    public void setCatalog(T mas[]);
    public void getFirstFive() throws IOException;
}
