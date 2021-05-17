package se.lexicon;

import org.junit.Assert;
import org.junit.Test;

public class FruitTest {

    @Test
    public void examine() {
        //Arrange
        Fruit fruit = new Fruit("Apple", 12, 70);
        String result;

        //Act
        result = fruit.examine();

        //Assert
        Assert.assertEquals("Apple, Price: 12, Kcal: 70", result);
    }

    @Test
    public void use() {
        //Arrange
        Fruit fruit = new Fruit("Apple", 12, 70);
        String result;

        //Act
        result = fruit.use();

        //Assert
        Assert.assertEquals("The apple is eaten", result);
    }
}
