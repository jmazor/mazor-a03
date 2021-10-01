package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {

    @Test
    void main() {
        Solution26.PaymentCalculator card = new Solution26.PaymentCalculator(12, 5000, 100);
        assertEquals(70, card.calculateMonthsUntilPaidOff());
    }
}