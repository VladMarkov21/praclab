package Interface;

import Logik.MenuItem;

public interface OrdersManager {
    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem item);
    public IOrder[] getOrder();
    public int ordersCostSummary();
    public int ordersQuantity();
}
