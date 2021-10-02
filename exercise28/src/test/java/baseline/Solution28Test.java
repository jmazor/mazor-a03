package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void getSumSimple() {
        assertEquals(15, Solution28.getSum(5, 10));
    }

    @Test
    void getSumLoop () {
        int ret = 0;
        for (int i = 0; i != 5; ++i) {
            ret = Solution28.getSum(i, ret);
        }
        assertEquals(10, ret);
    }
}