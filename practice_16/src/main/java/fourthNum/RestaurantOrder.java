package fourthNum;

import secondNum.Item;



public class RestaurantOrder implements Order {
    private int pozition;
    private Item mials[];
    private final int size=10;

    public RestaurantOrder(){
        this.mials= new Item[size];
        this.pozition=0;
    }

    public void add(Item item) {
        mials[pozition]=item;
        pozition++;
    }

    public boolean delete(String name) {
        int i=0;
        while(!name.equals(mials[i].name()) && i<size ){
            i++;
        }
        if(i!=size-1) {
            mials[i] = null;
            return true;
        }
        return  false;
    }

    public int deleteAllWithName(String name) {
        int kol=0;
        for(int i=0;i< mials.length;i++){
            if(mials[i].name().equals(name)){
                mials[i]=null;
                kol++;
            }
        }
        return kol;
    }

    public int kol() {
        int kol=0;
        for (Item mial : mials) {
            if (mial != null) kol++;
        }
        return kol;
    }

    public Item[] MasOrder() {
        return mials;
    }

    public int allPrize() {
        int prize=0;
        for(Item item:mials){
            prize+=item.prize();
        }
        return prize;
    }

    public int kolByName(String name) {
        int kol=0;
        for(Item item: mials) {

            if (item!= null) {
                if (item.name().equals(name)) kol++;
            }
        }
        return kol;
    }

    public boolean checkName(String name,String[] names){

        for(String item:names){
            if(item!=null)
            if(item.equals(name)) return  false;
        }
        return  true;
    }

    public String[] nameInMas() {
        String[] name= new String[size];
        int pozition=0;

        for(Item item :mials) {
            if (item != null) {
                if (this.checkName(item.name(),name) && item.name()!=null) {
                    name[pozition] = item.name();
                    pozition++;
                }
            }
        }
        return name;
    }

    public Item[] masItemSort() {

        for (int i = 0; i < mials.length; i++) {


            Item min = mials[i];
            int min_i = i;

            for (int j = i+1; j < mials.length; j++) {

                if (mials[j] != null) {
                    if (mials[j].prize() < min.prize()) {
                        min = mials[j];
                        min_i = j;
                    }
                }
            }

            if (i != min_i) {
                Item tmp = mials[i];
                mials[i] = mials[min_i];
                mials[min_i] = tmp;
            }
        }

        return this.mials;
    }
}
