package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {

    public static List<Integer> getInput() {
        // init ArrayList
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> ret = new ArrayList<>();
        // while flag != false
        boolean flag = true;
        String input;
        while (flag) {
            // scan input
            System.out.print("Enter a number: ");
            input = sc.nextLine();
            // if input equals done flag = false
            if (input.equals("done"))
                flag = false;
            // else try parseInt
            else {
                try { // add validated input to list
                    ret.add(Integer.parseInt(input));

                } catch (Exception e) { // catch
                    System.out.println("Sorry. That is not valid");
                }
            }

        }
        return ret;
    }

    public static double getAvg(List<Integer> list) {
        // for every index add up all values and divide by number of values
        int sum = 0;
        for (int i = 0; i != list.size(); ++i) {
            sum += list.get(i);
        }
        return (double)sum / list.size();
    }

    public static int getMin(List<Integer> list) {
        // for every index test number to see if < than last
        int min = Integer.MAX_VALUE;
        for (int i = 0; i != list.size(); ++i) {
            if (list.get(i) < min)
                min  = list.get(i);
        }
        return min;
    }

    public static int getMax(List<Integer> list) {
        // for every index test number see if > than last
        int max = Integer.MIN_VALUE;
        for (int i = 0; i != list.size(); ++i) {
            if (list.get(i) > max)
                max  = list.get(i);
        }
        return max;
    }

    public static double getStd(List<Integer> list) {
        // for every value find the square distance to the mean
        double std = 0;
        double avg = getAvg(list);
        // sum values
        for(int i = 0; i != list.size(); ++i) {
            std += Math.pow(list.get(i) - avg, 2);
        }
        // divide by number of values
        // square root
        return Math.sqrt(std/list.size());

    }


    public static void printList(List<Integer> list) {
        System.out.print("Numbers: ");
        for (int i = 0; i != list.size(); ++i) {
            System.out.print(list.get(i));
            // prints comma unless on last num
            if (i != list.size() - 1)
                System.out.print(", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // call get input
        ArrayList<Integer> stats = (ArrayList<Integer>)getInput();
        // print numbers
        printList(stats);

        // call and print getAvg
        System.out.printf("The average is %.1f%n", getAvg(stats));
        // call and print getMin
        System.out.printf("The minimum is %d%n", getMin(stats));
        // call and print getMax
        System.out.printf("The maximum is %d%n", getMax(stats));
        // call and print getStd
        System.out.printf("The standard deviation is is %.2f%n", getStd(stats));

    }
}
