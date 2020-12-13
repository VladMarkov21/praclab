package fourthNum;

import secondNum.Item;

public interface Order {
    public void add(Item item);
    public boolean delete(String name);
    public int deleteAllWithName(String name);
    public int kol();
    public Item[] MasOrder();
    public int allPrize();
    public int kolByName(String name);
    public String[] nameInMas();
    public Item[] masItemSort();
}
