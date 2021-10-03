package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.*;

public class Solution40 {

    // THIS IS ONLY HERE SOLELY FOR UNIT TESTING
    // I could just print what I searched but this allows me to test the search
    public static List<Map<String, String>> getSearch(List<Map<String, String>> employeeData, String searchValue) {
        List<Map<String, String>> newData = new ArrayList<>();
        Map<String, String> employeePosition = new TreeMap<>();
        Map<String, String> employeeSeparation = new TreeMap<>();
        for (Map.Entry<String, String> entry : employeeData.get(0).entrySet()) {
            if (entry.getKey().contains(searchValue)) {
                employeePosition.put(entry.getKey(), entry.getValue());
                employeeSeparation.put(entry.getKey(), employeeData.get(1).get(entry.getKey()));
            }
        }
        newData.add(employeePosition);
        newData.add(employeeSeparation);
        return newData;
    }

    public static void printSearch(List<Map<String, String>> employeeData, String searchValue) {
        System.out.println("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------");

        // TO GRADER
        // THIS IS NOT NEEDED BUT I DID IT FOR UNIT TESTING
        List<Map<String, String>> filteredEmployeeData = getSearch(employeeData, searchValue);
        // for every item in map
        for (Map.Entry<String, String> entry : filteredEmployeeData.get(0).entrySet()) {
                String[] temp = entry.getKey().split(", ");
                temp[1] = temp[1].concat(" ");
                System.out.printf("%-20s|", temp[1].concat(temp[0]));

                System.out.printf(" %-18s|", entry.getValue());
                System.out.printf(" %-20s%n", filteredEmployeeData.get(1).get(entry.getKey()));
        }

    }

        //if map key contains searchValue print it


    public static void main(String[] args) {
        // input data
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
        // ask for search value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        // call printSearch
        String searchValue = sc.nextLine();

        printSearch(employeeData, searchValue);

    }
}
