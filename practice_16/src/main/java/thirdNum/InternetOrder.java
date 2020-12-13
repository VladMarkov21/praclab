package thirdNum;

import secondNum.Item;

public class InternetOrder {
    private MyList myList = new MyList();

    public InternetOrder(Item mas[]){
        myList.addArray(mas);
    }

    public void add(Item mials){
        myList.add(mials);
    }

    public int getAllItem(){

        return  myList.size();
    }

    public Item[] getArray(){
        return myList.getAllItem();
    }

    public int getAllPrize(){
        return  myList.getallprize();
    }

    public int getAllSizeByEnterName(String name){
        return myList.getAllSizeByEnterName(name) ;
    }

    public String[] getAllNameByEnter(){
        return  myList.getAllName();
    }




}
