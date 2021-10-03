package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {

    @Test
    void getSearch() {
        List<Map<String, String>> employeeData = new ArrayList<>();
        Map<String, String> employeePosition = new TreeMap<>();
        Map<String, String> employeeSeparation = new TreeMap<>();
        employeePosition.put("Johnson, John", "Manager");
        employeeSeparation.put("Johnson, John", "2016-12-31");

        employeePosition.put("Xiong, Tou", "Software Engineer");
        employeeSeparation.put("Xiong, Tou", "2016-10-05");

        employeePosition.put("Michaelson, Michaela", "District Manager");
        employeeSeparation.put("Michaelson, Michaela", "2015-12-19");

        employeePosition.put("Jacobson, Jake", "Programmer");
        employeeSeparation.put("Jacobson, Jake", "");

        employeePosition.put("Jackson, Jacquelyn", "DBA");
        employeeSeparation.put("Jackson, Jacquelyn", "");

        employeePosition.put("Webber, Sally", "Web Developer");
        employeeSeparation.put("Webber, Sally", "2015-12-18");
        employeeData.add(employeePosition);
        employeeData.add(employeeSeparation);

        List<Map<String, String>> newData = Solution40.getSearch(employeeData, "Jac");


        List<Map<String, String>> expectedData = new ArrayList<>();
        Map<String, String> expectedEmployeePosition = new TreeMap<>();
        Map<String, String> expectedEmployeeSeparation = new TreeMap<>();

        expectedEmployeePosition.put("Jacobson, Jake", "Programmer");
        expectedEmployeeSeparation.put("Jacobson, Jake", "");

        expectedEmployeePosition.put("Jackson, Jacquelyn", "DBA");
        expectedEmployeeSeparation.put("Jackson, Jacquelyn", "");
        expectedData.add(expectedEmployeePosition);
        expectedData.add(expectedEmployeeSeparation);

        assertEquals(expectedData, newData);


    }
}