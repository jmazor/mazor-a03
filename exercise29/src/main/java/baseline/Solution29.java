package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution29 {

    // isValid method
    // takes a string
    // trys to convert to int
    // tests if == 0

    public static boolean isValid(String input) {
        int val = 0;
        // Confirms value is an int
        try {
            val = Integer.parseInt(input);
        } catch (Exception e) {
            return false;
        }
        // Confirms value is not zero
        return (val != 0);
    }

    // rule of 72 function
    //takes a value divides by 72 returns an int
    // rounds up to next year
    public static int investmentCalc(int rate) {
        return (int)((72.0/rate)+.99999999);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rate = 0;
        String input = "";
        boolean flag = false;

        // for loop until data is validated
        while (!flag) {
            System.out.print("What is the rate of return? ");
            input = sc.nextLine();
            flag = isValid(input);
            // I can avoid testing this but I did not want my isValid method to print
            if (!flag)
                System.out.println("Sorry. That's not valid input.");
        }
        // convert string to int (confirmed valid)
        rate = Integer.parseInt(input);
        // call 72 funciton
        // print output
        System.out.println("It will take " + investmentCalc(rate) + " years to double your initial investment.");
        }


}
