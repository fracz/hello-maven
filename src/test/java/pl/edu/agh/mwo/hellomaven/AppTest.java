package pl.edu.agh.mwo.hellomaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    /**
     * Sample test.
     */
    @Test
    public void sampleTest() {
        Assertions.assertTrue(true);
    }

    @Test
    public void testRandomDiceRoll() {
        int randomNumber = new App().getRandomNumber();
        Assertions.assertEquals(4, randomNumber, "The dice is not fair.");
    }
}
