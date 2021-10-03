package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void main() {
        ArrayList<String> entryList = new ArrayList<>();
        entryList.add("justin");
        entryList.add("james");
        assertEquals("james", entryList.get(1));
    }
}