package ua.training;

import org.junit.Assert;
import org.junit.Test;


public class ModelTest {

    @Test
    public void testFixedRand() throws Exception {
        Model model = new Model();
        for (int i = 0; i < 100; i++) {
            model.rand();
            int randNumber = model.getSecretNumber();
            Assert.assertTrue(randNumber >= GlobalValues.PRIMARY_MIN_BARRIER
                                    && randNumber <= GlobalValues.PRIMARY_MAX_BARRIER);
        }
    }

    @Test
    public void testFlexibleRandForFiveAndFifteen() throws Exception {
        Model model = new Model();
        int min = 5;
        int max = 15;
        model.setMinAndMaxRange(min, max);
        for (int i = 0; i < 100; i++) {
            model.rand();
            int randNumber = model.getSecretNumber();
            Assert.assertTrue(randNumber >= min && randNumber <= max);
        }
    }

    @Test
    public void testFlexibleRandForTenAndSixty() throws Exception {
        Model model = new Model();
        int min = 10;
        int max = 60;
        model.setMinAndMaxRange(min, max);
        for (int i = 0; i < 100; i++) {
            model.rand();
            int randNumber = model.getSecretNumber();
            Assert.assertTrue(randNumber >= min && randNumber <= max);
        }
    }


    @Test
    public void testCheckEquality() throws Exception {
        Model model = new Model();
        int number1 = 10;
        int number2 = 20;
        boolean result1 = model.checkNotEqual(number1, number2);
        Assert.assertTrue(result1);
    }

}