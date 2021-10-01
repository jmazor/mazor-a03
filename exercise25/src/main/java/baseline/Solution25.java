package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution25 {

    // passwordValidator Function
    // initialize char count number count and special char count
    // loop through each char of string
    // if charcount < 8 and num == 0 return very weak
    // if char count < 8 return weak
    // if char count + num is > 8 && num > 1 return strong
    // if char count + num is > 8 && num > 1 && specialchar > 1 return very strong


    public static String passwordValidator(String password) {
        int charCount = 0;
        int numCount = 0;
        int specCount = 0;
        for (int i  = 0; i != password.length(); ++i) {
            if (Character.isDigit(password.charAt(i))) {
                numCount++;
            } else if  (Character.isLetter(password.charAt(i))) {
                charCount++;
            } else {
                specCount++;
            }
        }
        int total = charCount + numCount + specCount;
        if (total < 8 && charCount == 0 && specCount == 0) {
            return "very weak";
        } else if (total < 8 && numCount == 0 && specCount == 0) {
            return "weak";
        } else if (total >= 8 && numCount != 1 && specCount != 0 && charCount != 0) {
            return "very strong";
        } else if (total >= 8 && numCount >= 1 && charCount != 0) {
            return "strong";
        } else {
            return "unknown strength";
        }
    }


    // Input a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password for Strength Testing: ");
        String password = sc.nextLine();
        System.out.println("The password '" + password + "' is a " +  passwordValidator(password) + " password");

    }


}
