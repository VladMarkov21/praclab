package secondNum;

public class TablesOrderManager {
    private int pozition;
    private Order[]  ordertable = new  Order[100];
    public TablesOrderManager(){
        pozition=0;
    }
    public void addOrder(Order order){
        ordertable[pozition]=order;
        pozition++;
    }
    public Order getOrderByIndex(int i){
        if(i>-1 && i<ordertable.length){
            return  ordertable[i];
        }
        return  null;
    }
}
