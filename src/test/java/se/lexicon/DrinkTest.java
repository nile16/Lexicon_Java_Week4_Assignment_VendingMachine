package se.lexicon;

import org.junit.Assert;
import org.junit.Test;

public class DrinkTest {

    @Test
    public void examine() {
        //Arrange
        Drink drink = new Drink("Milk", 10, 150);
        String result;

        //Act
        result = drink.examine();

        //Assert
        Assert.assertEquals("Milk, Price: 10, Kcal: 150", result);
    }

    @Test
    public void use() {
        //Arrange
        Drink drink = new Drink("Milk", 10, 150);
        String result;

        //Act
        result = drink.use();

        //Assert
        Assert.assertEquals("The milk is drunken", result);
    }
}
