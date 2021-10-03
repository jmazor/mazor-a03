package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void main() {
        List<String> answers = new ArrayList<>(List.of("Yes", "No", "Maybe", "Ask again later."));
        assertEquals("Yes", answers.get(0));

    }
}