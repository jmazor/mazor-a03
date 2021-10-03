package baseline;

import java.util.List;
import java.util.Random;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

public class Solution37 {

    public static int getNumLetters(int numNumbers, int numSpec, int minSize, Random rand) {
        // set letters + numNumbers + numSpec
        // make sure letters + numNumbers + numSpec is >= minSize
        // if not add to numLetters to make true
        // add random 0-5 to numLetters

    }

    public static int getNum(int index) {
        // return number at index
    }

    public static char getSpec(int index) {
        // return special char at index
    }

    public static int getLetter(int index) {
        // return letter at index
    }

    public static List<String> removeEntry(List<String>) {
        // loop through array
        // if
    }

    public static String getPassword(int numNumbers, int numSpec, int numLetters, Random rand) {
        // init string ret
        // create an arrayList of numNumbers, numSpec, numLetters
        // while numCount + specCount + letterCount != 0
        // String test = random nextInt.get(list.size())
        // if test = numNumbers
        // call String ret = concat.getNum(rand)
        // decrease numCount
        // if numCount equals 0
        // removeEntry(numNumbers)

        // if test = numSpec
        // call String ret = concat.getSpec(rand)
        // decrease numSpec
        // if numSpec equals 0
        // removeEntry(numSpec)

        // if test = numLetters
        // call String ret = concat.getLetter(rand)
        // decrease numLetter
        // if numLetter equals 0
        // removeEntry(numLetter)
    }

    public static void main(String[] args) {
        // prompt for min length
        // prompt for spec chars
        // prompt for numbers

        // call getNumLetters

        // call and print getPassword

    }
}
