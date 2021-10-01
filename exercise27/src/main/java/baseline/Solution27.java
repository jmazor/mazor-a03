package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */


import java.util.Scanner;

public class Solution27 {

    // validate method
    // make sure first and last name exists
    // first name and last name size >= 2
    // id first 2 must be chars
    // id[3] must be hyphen
    // zipcode must contain only numbers and be 5 digits

    // return concated string
    public static String validateInput (String firstName, String lastname, String zipCode, String employeeID) {
        String ret = "";
        if (firstName.isEmpty()) {
            ret = ret.concat("The first name must be filled in.\n");
        }
        if (firstName.length() <= 2) {
            ret = ret.concat("The first name must be at least 2 characters long.\n");
        }
        if (lastname.isEmpty()) {
            ret = ret.concat("The last name must be filled in.\n");
        }
        if (lastname.length() <= 2) {
            ret = ret.concat("The last name must be at least 2 characters long.\n");
        }


        if (employeeID.length() != 7)
            ret = ret.concat("The employee ID must be in the format of AA-1234.\n");
        // Ensures that char 0 and 1 are letters
        else if (!Character.isLetter(employeeID.charAt(0)) || (!Character.isLetter(employeeID.charAt(1)))) {
            ret = ret.concat("The employee ID must be in the format of AA-1234.\n");
        } else if (employeeID.charAt(2) != '-') {
            ret = ret.concat("The employee ID must be in the format of AA-1234.\n");
        // Ensures that char 3 4 6 and 6 are Numbers
        } else if (!Character.isDigit(employeeID.charAt(3)) || !Character.isDigit(employeeID.charAt(4)) || !Character.isDigit(employeeID.charAt(5)) || !Character.isDigit(employeeID.charAt(6))) {
            ret = ret.concat("The employee ID must be in the format of AA-1234.\n");
        }
        if (zipCode.length() != 5) {
            ret = ret.concat("The Zip code must be a 5 digit number.\n");
        }
        else {
            for (int i = 0; i != 5; ++i) {
                if (!Character.isDigit(zipCode.charAt(i))) {
                    ret = ret.concat("Zip code must be a 5 digit number.\n");
                    break;
                }
            }
        }

        if (ret.isEmpty())
            ret = "There were no errors found.";

        return ret;
    }

    public static void main(String[] args) {
        // lastname
        // zip
        // id
        // call validate method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = sc.nextLine();
        System.out.print("Enter the employee id: ");
        String employeeID = sc.nextLine();

        System.out.print(validateInput(firstName, lastName, zipCode, employeeID));

    }
}
