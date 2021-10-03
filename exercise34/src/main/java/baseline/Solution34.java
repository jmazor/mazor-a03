package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.*;

public class Solution34 {


    public static void removeRecord(List<String> employeeList, String employee) {
        // loop through array
        for (int i = 0; i!= employeeList.size(); ++i) {
            // test each value at index is equal to employee
            if (employeeList.get(i).equals(employee)) {
                employeeList.remove(i);
                break;
            }
        }
    }

    public static void printList(List<String> employeeList) {
        // Print size of array
        System.out.println("There are " + employeeList.size() + " employees: ");
        // loop through and print each record
        for (int i = 0; i != employeeList.size(); ++i) {
            System.out.println(employeeList.get(i));
        }
    }

    public static void main(String[] args) {
        // Init array with 5 employees
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("John Smith", "Jackie Johnson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        // printList
        printList(employeeList);
        // Input employee to be removed
        System.out.print("\nEnter an employee name to remove: ");
        Scanner sc = new Scanner(System.in);
        // call removeRecord(employee)
        removeRecord(employeeList, sc.nextLine());
        System.out.println();
        // printList
        printList(employeeList);

    }
}
