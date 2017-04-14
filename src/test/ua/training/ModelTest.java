package ua.training;

import org.junit.Assert;
import org.junit.Test;


public class ModelTest {
    private static final Model model = new Model();


    @Test
    public void testFixedRand() throws Exception {
        int min = 0;
        int max = 100;
        for (int i = 0; i < 100; i++) {
            int randNumber = model.rand();
            Assert.assertTrue(randNumber >= min && randNumber <= max);
        }
    }

    @Test
    public void testFlexibleRand() throws Exception {
        int min = 5;
        int max = 15;
        for (int i = 0; i < 100; i++) {
            int randNumber = model.rand(min, max);
            Assert.assertTrue(randNumber >= min && randNumber <= max);
        }
    }

    @Test
    public void testAddNumber() throws Exception {
        for (int i = 0; i < 100; i++) {
            int randNumber = model.rand();
            model.addNumber(randNumber);
        }
        Assert.assertEquals(100, model.getStatistic().size());
    }

    @Test
    public void testGetStatistic() throws Exception {
        Assert.assertNotNull(model.getStatistic());
    }

    @Test
    public void testCheckEquality() throws Exception {
        int number1 = 10;
        int number2 = 20;
        boolean result1 = model.checkNotEqual(number1, number2);
        Assert.assertTrue(result1);
    }

}