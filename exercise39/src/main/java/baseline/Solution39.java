package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.*;

public class Solution39 {

    public static void printList(List<Map<String, String>> employeeData) {
        System.out.println("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------");
        for (Map.Entry<String, String> entry : employeeData.get(0).entrySet()) {
            String[] temp = entry.getKey().split(", ");
            temp[1] = temp[1].concat(" ");
            System.out.printf("%-20s|", temp[1].concat(temp[0]));

            System.out.printf(" %-18s|", entry.getValue());
            System.out.printf(" %-20s%n",employeeData.get(1).get(entry.getKey()));
        }
    }

    public static void main(String[] args) {
        // init data
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

        printList(employeeData);


        // create a list contain maps
        // the map key is a String last name, First Name and the values is a list of strings
        // values are first name position and seperation date

        // call sortList

        // call printList
    }
}
