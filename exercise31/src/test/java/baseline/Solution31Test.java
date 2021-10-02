package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void getHeartRate() {
        assertEquals(191, Solution31.getHeartRate(65, 22, 95));
    }

}