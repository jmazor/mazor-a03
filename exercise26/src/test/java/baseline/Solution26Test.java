package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {

   @Test
    void paymentCalculator() {
        Solution26.PaymentCalculator card = new Solution26.PaymentCalculator(12, 5000, 100);
        assertEquals(70, card.calculateMonthsUntilPaidOff());
    }


    @Test
    void roundCent (){
        double val = 100.891;
        assertEquals(100.90, Solution26.roundCent(val));
    }
}