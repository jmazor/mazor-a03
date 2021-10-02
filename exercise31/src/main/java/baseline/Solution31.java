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


    // validates input
    // I could remove this boolean flag but sonarLint complains about continue and break
    public static int getInput(String name) {
        int ret = 0;
        Scanner sc = new Scanner(System.in);
        // I would not do this but sonarLint made me
        boolean flag = false;
        // loops until valid input
        while (!flag) {
            System.out.print("Please Enter - " + name + ": ");
            String input = sc.nextLine();
            try {
                ret = Integer.parseInt(input);
                flag = true;
            } catch (Exception e) {
                System.out.println("Sorry. That's not valid input.");
            }
        }
        return ret;
    }

    public static void main(String[] args) {

        // input age and resting
        // validate input and convert to int
        int restingHR = getInput("Resting Heart Rate");
        int age = getInput("Age");

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
