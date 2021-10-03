package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
    Random rand = new Random();
    String password = Solution37.getPassword(5, 5, 10, rand);
    @Test
    void testPasswordNum() {
        int count = 0;
        for (int i = 0; i != password.length(); ++i) {
            if (Character.isDigit(password.charAt(i)))
                ++count;
        }
        assertEquals(5, count);
    }

    @Test
    void testPasswordLetter() {
        int count = 0;
        for (int i = 0; i != password.length(); ++i) {
            if (Character.isLetter(password.charAt(i)))
                ++count;
        }
        assertEquals(10, count);
    }

    @Test
    void testPasswordSpec() {
        int count = 0;
        for (int i = 0; i != password.length(); ++i) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)))
                ++count;
        }
        assertEquals(5, count);
    }
}