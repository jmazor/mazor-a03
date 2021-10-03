package baseline;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 2, 3, 4, 8, 6, 1, 5));

    @Test
    void getAvg() {
        assertEquals(4.5, Solution36.getAvg(list));
    }

    @Test
    void getMin() {
        assertEquals(1, Solution36.getMin(list));

    }

    @Test
    void getMax() {
        assertEquals(8, Solution36.getMax(list));
    }

    @Test
    void getStd() {
        DecimalFormat decimalFormatter = new DecimalFormat("#.###");
        assertEquals(2.291, Double.parseDouble(decimalFormatter.format(Solution36.getStd(list))));
    }
}