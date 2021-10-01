package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidatorVWeak() {
        String password = "1234";
        assertEquals("very weak", Solution25.passwordValidator(password));
    }
    @Test
    void passwordValidatorWeak() {
        String password = "asdfgch";
        assertEquals("weak", Solution25.passwordValidator(password));
    }

    @Test
    void passwordValidatorStrong() {
        String password = "12345678a";
        assertEquals("strong", Solution25.passwordValidator(password));
    }
    @Test
    void passwordValidatorVeryStrong() {
        String password = "12345678a&";
        assertEquals("very strong", Solution25.passwordValidator(password));
    }

    @Test
    void passwordValidatorUnknownNums()
    {
        String password = "123456789";
        assertEquals("unknown strength", Solution25.passwordValidator(password));
    }

    @Test
    void passwordValidatorUnknownSpec()
    {
        String password = "&";
        assertEquals("unknown strength", Solution25.passwordValidator(password));
    }


}