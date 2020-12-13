package Logik;

import Interface.IOrder;
import Interface.OrdersManager;

public class TableOrdersManager implements OrdersManager {
    private IOrder[] orders;

    public int itemsQuantity(String itemName) {
        return 0;
    }

    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    public IOrder[] getOrder() {
        return new IOrder[0];
    }

    public int ordersCostSummary() {
        return 0;
    }

    public int ordersQuantity() {
        return 0;
    }
}
