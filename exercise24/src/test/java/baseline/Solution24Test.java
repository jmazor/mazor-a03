package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagramTrue() {
        String a = "top";
        String b = "pot";
        assertEquals(true, Solution24.isAnagram(a, b));

    }

    @Test
    void isAnagramFalse()
    {
        String a = "top";
        String b = "top";
        assertEquals(false, Solution24.isAnagram(a, b));
    }


    @Test
    void main() {
    }
}
