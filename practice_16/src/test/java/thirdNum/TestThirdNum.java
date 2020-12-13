package thirdNum;

import org.junit.Assert;
import org.junit.Test;
import secondNum.Dish;
import secondNum.Drink;
import secondNum.Item;

public class TestThirdNum {
    @Test
    public void Test(){

        Drink firstDrink = new Drink(1,"Сок","Вишневый сок");
        Drink secondDrink = new Drink(2,"Кофе","Капучино");
        Drink thirdDrink = new Drink(3,"Чай","Зелёный");
        Drink fourth = new Drink(4,"Кофе","Лате");
        Drink drink[] = {firstDrink,secondDrink,thirdDrink,fourth};


        InternetOrder internetOrder = new InternetOrder(drink);
        Assert.assertEquals(4,internetOrder.getAllItem());
        Assert.assertEquals(10,internetOrder.getAllPrize());
        Assert.assertEquals(2,internetOrder.getAllSizeByEnterName("Кофе"));
    }

}
