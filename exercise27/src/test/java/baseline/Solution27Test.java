package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInputNoError() {
        assertEquals("There were no errors found.", Solution27.validateInput("Justin", "Mazor", "33428", "AA-1234"));
    }

    @Test
    void validateInputFirstNameError() {
        assertEquals("The first name must be filled in.\nThe first name must be at least 2 characters long.\n", Solution27.validateInput("", "Mazor", "33428", "AA-1234"));

    }

    @Test
    void validateInputEmployeeID() {
        assertEquals("The employee ID must be in the format of AA-1234.\n", Solution27.validateInput("Justin", "Mazor", "33428", "AA1234"));
    }
}