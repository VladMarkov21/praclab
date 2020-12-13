package thirdNum;

import secondNum.Item;

public class MyList {
    private Item mials[] = new Item[100];
    private int next;
    private int last;

    public int getNext() {
        return next;
    }


    public MyList(){
        next=0;
        last=-1;
    }
    public void add(Item item){
        mials[next]=item;
        next++;
        last++;
    }
    public Item[] toArray(){
        return mials;
    }
    public void addArray(Item arr[]){
        for(int i=0;i< arr.length;i++){
            mials[next]=arr[i];
            next++;
            last++;
        }
    }
    public int size(){
        int i=0;
        while (mials[i]!=null){
            i++;

        }
        return i;
    }

    public Item[] getAllItem(){
        return mials;
    }

    public int getallprize(){
        int prize=0;
        for(int i=0;i< mials.length;i++ ){
            if (mials[i]!=null)
            prize+=mials[i].prize();
        }
        return  prize;
    }

    public int getAllSizeByEnterName(String name_){
        int kol=0;
        for(int i=0;i<mials.length;i++){
            if(mials[i]!=null) {
                if (mials[i].name().equals(name_)) kol++;
            }
        }
        return  kol;
    }
    public String[] getAllName(){
        String name[]= new String[9];
        int pozition=0;
        for(int i=0;i<mials.length;i++){
            name[pozition]=mials[i].name();
            pozition++;
        }
        return name;
    }


}
