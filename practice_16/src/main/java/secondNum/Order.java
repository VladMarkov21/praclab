package secondNum;

public class Order {
    private int pozition;
    private Item dish[]= new Item[100];

    public Order(){
        this.pozition=0;
    }
    public void add(Item newMials){
        dish[pozition]=newMials;
        pozition++;
    }
    public boolean delete(Item mials){
        for(int i=0;i< dish.length;i++){
            if(dish[i]==mials) dish[i]=null;
            return  true;
        }
        return false;
    }
    public Item getByIndex(int i){
        if(i>-1 && i< dish.length)
        return dish[i];
        return null;
    }


}
