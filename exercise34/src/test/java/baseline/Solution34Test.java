package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void removeRecord() {
        ArrayList<String> employeeList = new ArrayList<String>(Arrays.asList("John Smith", "Jackie Johnson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        Solution34.removeRecord(employeeList, "Chris Jones");
        assertEquals(4, employeeList.size());
    }

}