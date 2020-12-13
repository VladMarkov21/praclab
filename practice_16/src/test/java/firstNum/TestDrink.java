package firstNum;

import firstNom.Drink;
import org.junit.Assert;
import org.junit.Test;

public class TestDrink {
    @Test
    public void Test(){
        Drink drink = new Drink("Cola","Сильно газированный напиток");
        Assert.assertEquals("Cola",drink.getName());
        Assert.assertEquals(drink.getText(),"Сильно газированный напиток");
        Assert.assertEquals(drink.getPrize(),0);
    }
}
