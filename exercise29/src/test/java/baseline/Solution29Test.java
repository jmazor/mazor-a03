package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void isValidZero() {
        assertEquals(false, Solution29.isValid("0"));
    }

    @Test
    void isValidString() {
        assertEquals(false, Solution29.isValid("hello"));
    }

    @Test
    void isValidTrue() {
        assertEquals(true, Solution29.isValid("10"));
    }

    @Test
    void investmentCalc() {
        assertEquals(18, Solution29.investmentCalc(4));
    }
}