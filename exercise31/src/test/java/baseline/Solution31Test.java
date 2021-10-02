package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void getHeartRate() {
        assertEquals(191, Solution31.getHeartRate(65, 22, 95));
    }

    @Test
    void validateInputTrue() {
        assertEquals(true, Solution31.validateInput("1234"));
    }

    @Test
    void validateInputFalse() {
        assertEquals(false, Solution31.validateInput("123dsa4"));
    }
}