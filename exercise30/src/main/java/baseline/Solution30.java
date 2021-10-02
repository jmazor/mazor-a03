package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

public class Solution30 {

    //printTable method
    // nested for loops
    // both loops 1-12
    // inside loop multiplies and prints both counter values
    // print new line when inside loop ends
    public static void printTable() {
        for (int i = 1; i != 13; ++i) {
            for (int y = 1; y!= 13; ++y) {
                System.out.printf(" %3d ", i*y);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //call printTable
        printTable();
    }
}
