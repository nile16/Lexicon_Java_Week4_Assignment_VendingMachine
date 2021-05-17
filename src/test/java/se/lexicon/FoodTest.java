package se.lexicon;

import org.junit.Assert;
import org.junit.Test;

public class FoodTest {

    @Test
    public void examine() {
        //Arrange
        Food food = new Food("Sandwich", 20, 200);
        String result;

        //Act
        result = food.examine();

        //Assert
        Assert.assertEquals("Sandwich, Price: 20, Kcal: 200", result);
    }

    @Test
    public void use() {
        //Arrange
        Food food = new Food("Sandwich", 20, 200);
        String result;

        //Act
        result = food.use();

        //Assert
        Assert.assertEquals("The sandwich is consumed", result);
    }
}
