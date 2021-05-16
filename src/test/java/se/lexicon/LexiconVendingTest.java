package se.lexicon;

import org.junit.Assert;
import org.junit.Test;

public class LexiconVendingTest {
    @Test
    public void addCurrency() {
        //Arrange
        LexiconVending vend = new LexiconVending();
        int result;

        //Act
        vend.addCurrency(1);
        vend.addCurrency(2);
        vend.addCurrency(5);
        vend.addCurrency(10);
        vend.addCurrency(20);
        vend.addCurrency(50);
        vend.addCurrency(100);
        vend.addCurrency(200);
        vend.addCurrency(500);
        vend.addCurrency(1000);
        vend.addCurrency(555);

        //Assert
        result = vend.getBalance();
        Assert.assertEquals(1888, result);
    }

    @Test
    public void request() {
        //Arrange
        LexiconVending vend = new LexiconVending();
        int result1, result2;
        Product purchase1, purchase2;
        vend.addCurrency(20);

        //Act
        purchase1 = vend.request(0);
        purchase2 = vend.request(0);

        //Assert
        result2 = vend.getBalance();
        Assert.assertEquals("Name: Apple, Price: 12", purchase1.examine());
        Assert.assertNull(purchase2);
        Assert.assertEquals(8, result2);
    }

    @Test
    public void endSession() {
        //Arrange
        LexiconVending vend = new LexiconVending();
        int result1, result2;
        vend.addCurrency(5);

        //Act
        result1 = vend.endSession();

        //Assert
        result2 = vend.getBalance();
        Assert.assertEquals(5, result1);
        Assert.assertEquals(0, result2);
    }

    @Test
    public void getDescription() {
        //Arrange
        LexiconVending vend = new LexiconVending();
        String result;

        //Act
        result = vend.getDescription(0);

        //Assert
        Assert.assertEquals("Name: Apple, Price: 12", result);
    }

    @Test
    public void getBalance() {
        //Arrange
        LexiconVending vend = new LexiconVending();
        int result;

        vend.addCurrency(10);

        //Act
        result = vend.getBalance();

        //Assert
        Assert.assertEquals(10, result);
    }

    @Test
    public void getProducts() {
        //Arrange
        LexiconVending vend = new LexiconVending();
        String[] result;

        //Act
        result = vend.getProducts();

        //Assert
        Assert.assertEquals("0. Name: Apple, Price: 12", result[0]);
    }
}
