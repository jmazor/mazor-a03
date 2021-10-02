package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution31 {

    //getHeartRate
    // Take age resting and intensity
    // TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
    // intensity must be decimal
    // round to the nearest whole number
    public static int getHeartRate(int restingHR, int age, int intensity) {
        return (int)Math.round((((220 - age) - restingHR) * (intensity / 100.0)) + restingHR);
    }

    // validateInput
    // try catch to convert String to int

    public static boolean validateInput(String input) {
        // Confirms value is an int
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        // input age and resting
        // validate input and convert to int
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int restingHR = 0;
        int age = 0;
        while (!flag) {
            System.out.print("Please Enter - Resting Pulse: ");
            String input = sc.nextLine();
            flag = validateInput(input);
            if (!flag)
                System.out.println("Sorry. That's not valid input.");
            else
                restingHR = Integer.parseInt(input);
        }
        flag = false;
        // validate input and convert to int
        while (!flag) {
            System.out.print("Please Enter - Age: ");
            String input = sc.nextLine();
            flag = validateInput(input);
            if (!flag)
                System.out.println("Sorry. That's not valid input.");
            else
                age = Integer.parseInt(input);
        }

        // print
        // Intensity   | Rate
        //-------------|--------
        System.out.println("\nResting Pulse: " + restingHR + "\t\tAge: " + age);
        System.out.println("Intensity\t | Rate");
        System.out.println("-------------|--------");
        // for loop 55 to 95 i+= 5
        for (int intensity = 55; intensity !=100; intensity+=5) {
            // print intensity% | getHeartRate(hr, age, i) in format
            System.out.println(intensity + "%\t\t\t | " + getHeartRate(restingHR, age, intensity) + " bpm");
        }

    }
}
