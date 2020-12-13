package thirdNum;

import org.junit.Assert;
import org.junit.Test;
import secondNum.Dish;
import secondNum.Item;

public class TestMyList {
    @Test
    public void testAddArray(){
        Dish first =new Dish("Котлета","  ");
        Dish second =new Dish("Соус","  ");
        Dish third =new Dish("Курица","  ");
        Dish arr[] ={first,second,third};
        MyList myList= new MyList();
        myList.addArray(arr);
        Assert.assertEquals(3,myList.getNext());
        Assert.assertEquals(3,myList.size());
    }

}
