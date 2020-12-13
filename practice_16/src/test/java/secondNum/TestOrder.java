package secondNum;

import org.junit.Assert;
import org.junit.Test;
import secondNum.Dish;
import secondNum.Drink;
import secondNum.Order;

public class TestOrder {
    @Test
    public void testAdd(){
        Order order = new Order();
        Dish dish = new  Dish("Котлета по киевски","Очень вкусеая котлета");
        order.add(dish);
        Assert.assertEquals(order.getByIndex(0),dish);
    }
    @Test
    public void testDelete(){
        Order order = new Order();
        Drink drink = new Drink("Кола","Сильно газированный напиток");
        order.add(drink);
        Assert.assertEquals(drink,order.getByIndex(0));
        order.delete(drink);
        Assert.assertEquals(null,order.getByIndex(0));

    }
}
