package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator() {
        String password = "1234";
        assertEquals("very weak", Solution25.passwordValidator(password));

        password = "asdfgch";
        assertEquals("weak", Solution25.passwordValidator(password));

        password = "12345678a";
        assertEquals("strong", Solution25.passwordValidator(password));

        password = "12345678a&";
        assertEquals("very strong", Solution25.passwordValidator(password));

        password = "123456789";
        assertEquals("unknown strength", Solution25.passwordValidator(password));

        password = "&";
        assertEquals("unknown strength", Solution25.passwordValidator(password));
    }
}