package secondNum;

import org.junit.Assert;
import org.junit.Test;
import secondNum.*;

public class TestNum2 {
    @Test
    public void TestNum2(){
        TablesOrderManager tablesOrderManager = new TablesOrderManager();
        Order firstOrder =new Order();
        Order secondOrder = new Order();

        Dish firstDish= new Dish("Котлета по Киевски ","Очень вкусная котлета");
        Drink firstDrink= new Drink("Кола","Сильно сладкий напиток");
        Dish secondDish = new Dish("Суп","Суп от шефа");
        Drink secondDrink= new Drink("Текила","Алкагольный напиток");

        firstOrder.add(firstDish);
        firstOrder.add(firstDrink);
        secondOrder.add(secondDrink);
        secondOrder.add(secondDish);
        tablesOrderManager.addOrder(firstOrder);
        tablesOrderManager.addOrder(secondOrder);

        Item mials = tablesOrderManager.getOrderByIndex(0).getByIndex(1);
        Assert.assertEquals(firstDrink,mials);

    }
}
