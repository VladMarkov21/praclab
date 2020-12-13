package fourthNum;

import org.junit.Assert;
import org.junit.Test;
import secondNum.Dish;
import secondNum.Drink;
import secondNum.Item;

public class TestRestaurantOrder {
    @Test
    public void Test(){
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        Dish firstDish = new Dish(100,"Котлета","Очень вкусная котлета");
        Dish secondDish = new Dish(150,"Торт Киевский","Торт");
        Drink firstDrink = new Drink(90,"Кола","Сильногазированный напиток");
        Drink secondDrink = new Drink(100,"Лате","Кофе");
        Assert.assertEquals(0,restaurantOrder.kol());
        restaurantOrder.add(firstDish);
        restaurantOrder.add(firstDrink);
        restaurantOrder.add(secondDish);
        restaurantOrder.add(secondDrink);
        Assert.assertEquals(4,restaurantOrder.kol());
        Assert.assertEquals(1,restaurantOrder.kolByName("Котлета"));

        String name[] ={"Котлета","Кола","Торт Киевский","Лате",null,null,null,null,null,null};
        Assert.assertEquals(name,restaurantOrder.nameInMas());

        Assert.assertEquals(1,restaurantOrder.kolByName("Котлета"));
        Item item[] =restaurantOrder.masItemSort();
        for(Item items:item){
            if(items!=null)
            System.out.print(items.name()+" ");
        }


    }
}
