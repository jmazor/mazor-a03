package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {

    @Test
    void getNumLetters() {
        assertEquals(13, Solution37.getNumLetters(5, 5, 15, 3));
    }

    @Test
    void removeEntry() {
        ArrayList<String> printThis = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Solution37.removeEntry(printThis, "c");
        assertEquals(2, printThis.size());
    }

    @Test
    void getPassword() {
    }
}