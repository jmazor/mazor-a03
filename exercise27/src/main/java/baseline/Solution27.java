package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */


import java.util.Scanner;

public class Solution27 {

    // validate method

    // return concated string
    public static String validateFirstName(String firstName, String ret) {
        // first name and last name size >= 2
        if (firstName.isEmpty()) {
            ret = ret.concat("The first name must be filled in.\n");
        }
        if (firstName.length() <= 2) {
            ret = ret.concat("The first name must be at least 2 characters long.\n");
        }
        return ret;
    }

    public static String validatelastName(String lastName, String ret) {
        if (lastName.isEmpty()) {
            ret = ret.concat("The last name must be filled in.\n");
        }
        if (lastName.length() <= 2) {
            ret = ret.concat("The last name must be at least 2 characters long.\n");
        }
        return ret;
    }

    public static String validateEmployeeID(String employeeID, String ret) {
        String employeeFormat = "The employee ID must be in the format of AA-1234.\n";
        if (employeeID.length() != 7)
            ret = ret.concat(employeeFormat);
            // Ensures that char 0 and 1 are letters
        else if (!Character.isLetter(employeeID.charAt(0)) || (!Character.isLetter(employeeID.charAt(1)))) { // id first 2 must be chars
            ret = ret.concat(employeeFormat);
        } else if (employeeID.charAt(2) != '-') { // id[3] must be hyphen
            ret = ret.concat(employeeFormat);
            // Ensures that char 3 4 6 and 6 are Numbers
        } else if (!Character.isDigit(employeeID.charAt(3)) || !Character.isDigit(employeeID.charAt(4)) || !Character.isDigit(employeeID.charAt(5)) || !Character.isDigit(employeeID.charAt(6))) {
            ret = ret.concat(employeeFormat);
        }
        return ret;
    }

    public static String validateZipCode(String zipCode, String ret) {
        // zipcode must contain only numbers and be 5 digits
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
        return ret;
    }

    public static String validateInput (String firstName, String lastName, String zipCode, String employeeID) {
        String ret = "";
        ret = validateFirstName(firstName, ret);
        ret = validatelastName(lastName, ret);
        ret = validateEmployeeID(employeeID, ret);
        ret = validateZipCode(zipCode, ret);

        if (ret.isEmpty())
            ret = "There were no errors found.";

        return ret;
    }

    public static void main(String[] args) {
        // lastname
        // zip
        // id
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = sc.nextLine();
        System.out.print("Enter the employee id: ");
        String employeeID = sc.nextLine();

        // call validate method
        System.out.print(validateInput(firstName, lastName, zipCode, employeeID));

    }
}
