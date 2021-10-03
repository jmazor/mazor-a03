package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {
    @Test
    void testNumberLow() {
        assertEquals("Too low. Guess Again: ", Solution32.testNumber(5, 10));
    }

    @Test
    void testNumberHigh() {
        assertEquals("Too high. Guess Again: ", Solution32.testNumber(10, 9));
    }

    @Test
    void testNumberInvalid() {
        assertEquals("Sorry. That's not valid input. Guess Again: ", Solution32.testNumber(0, 19));
    }
}