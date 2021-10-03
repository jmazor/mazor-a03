package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void filterEvenNumber() {
        Solution38.MyArray test = new Solution38.MyArray();
        for (int i = 0; i != 11; ++i) {
            test.addToArray(i);
        }
        test = Solution38.filterEvenNumber(test);
        int[] expected  = {2, 4, 6, 8 ,10};
        assertArrayEquals(expected, test.getArray());
    }
}