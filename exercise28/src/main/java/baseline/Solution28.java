package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution28 {
    // adder function
    // takes a value
    // takes a sum
    // returns previous value + entered number
    public static int getSum(int value, int sum) {
        return value + sum;
    }

    public static void main(String[] args) {
        // init value to 0
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        // For loop calling adderMethod
        for (int i = 0; i != 5; ++i) {
            System.out.print("Enter a number: ");
            sum = getSum(sc.nextInt(), sum);
        }
        // print final value
        System.out.println("The total is " + sum + ".");
    }
}
