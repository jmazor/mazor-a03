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

    @Test
    void testPasswordScramble() {
        String newPassword = Solution37.scramble(password, rand);
        int dCount = 0;
        for (int i = 0; i != password.length(); ++i) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)))
                ++dCount;
        }
        int lCount = 0;
        for (int i = 0; i != password.length(); ++i) {
            if (Character.isLetter(password.charAt(i)))
                ++lCount;
        }
        int sCount = 0;
        for (int i = 0; i != password.length(); ++i) {
            if (Character.isDigit(password.charAt(i)))
                ++sCount;
        }

        boolean flag = false;
        // makes sure same data in different order
        if (dCount == 5 && lCount == 10 && sCount == 5 && !password.equals(newPassword))
            flag = true;

        assertEquals(true, flag);
    }
}