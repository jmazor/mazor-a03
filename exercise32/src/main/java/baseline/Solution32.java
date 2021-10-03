package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;
import java.util.Random;

public class Solution32 {
    // Constant string literal
    private static final String FAILURE = "Sorry. That's not valid input.";

    // I added this for unit testing
    public static String testNumber(int guess, int randNum) {
        // if guess < number return too low Guess Again:
        // if guess >  number return too high Guess Again:
        if (guess == 0 ) {
            return (FAILURE + " Guess Again: ");
        } else if (guess > randNum) {
            return ("Too high. Guess Again: ");
        } else if (guess < randNum) {
            return ("Too low. Guess Again: ");
        }
        return "";
    }

    public static int guessNumber(int randNum) {
        // int difficulty sets range
        int count = 0;
        int guess = 0;
        // I have my number ask user for guess
        System.out.print("I have my number. What's your guess: ");
        // while guess != number
        while (guess != randNum) {
            guess = getGuess();
            System.out.print(testNumber(guess, randNum));
            // ++count
            ++count;
        }

        return count;
    }

    //validates input
    public static int getDifficulty() {
        int ret = 0;
        Scanner sc = new Scanner(System.in);
        // I would not do this but sonarLint made me
        boolean flag = false;
        // loops until valid input
        while (!flag) {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            String input = sc.nextLine();
            try {
                ret = Integer.parseInt(input);
                flag = true;
            } catch (Exception e) {
                System.out.println(FAILURE);
            }
            if (ret > 3) {
                System.out.println(FAILURE);
                flag = false;
            }
        }
        // if 1 set range to 10
        // 2 set range to 100
        // 3 set range to 1000
        if (ret == 1) {
            ret = 10;
        } else if (ret == 2) {
            ret = 100;
        } else {
            ret = 1000;
        }
        return ret;
    }

    public static int getGuess() {

        int ret;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // does not loop to count invalid entries
        try {
            ret = Integer.parseInt(input);
        } catch (Exception e) {
            ret = 0;
        }
        // returns 0 if invalid or input if valid
        return ret;
    }

    public static boolean getPlayAgain() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Do you wish to play again (Y/N): ");
            input = sc.nextLine();
                if (input.length() == 1) {
                    if (input.charAt(0) == 'y' || input.charAt(0) == 'Y') {
                        return true;
                    } else if (input.charAt(0) == 'n' || input.charAt(0) == 'N') {
                        return false;
                    } else {
                        System.out.println(FAILURE);
                    }
                }
                else {
                    System.out.println(FAILURE);
                }
        }
    }


    public static void main(String[] args) {
        // prompt user for input
        boolean flag = true;
        System.out.println("Let's play Guess the Number!\n");
        while (flag) {
            int difficulty = getDifficulty();

            // generate random number
            Random rand =  new Random();
            int randNum = rand.nextInt(difficulty) + 1;

            // call guessNumber
            int numTries = guessNumber(randNum);
            // Print you got it in guessNumber(difficulty) tries
            System.out.println("You got it in " + numTries + " guesses!");

            // Ask to play again
            System.out.println();
            flag = getPlayAgain();
            System.out.println();
        }

    }
}
