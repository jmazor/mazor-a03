package baseline;

import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

public class Solution37 {

    public static int getNumLetters(int numNumbers, int numSpec, int minSize, int extra) {
        // set letters + numNumbers + numSpec
        int numLetters = numNumbers + numSpec;
        // make sure letters + numNumbers + numSpec is >= minSize
        // if not add to numLetters to make true
        if (numLetters + numNumbers + numSpec < minSize) {
            numLetters += minSize - (numLetters + numNumbers + numSpec);
        }
        // randomly add up to extra letters
        numLetters  += extra;
        return numLetters;
    }


    public static String getLetters(int numLetters, Random rand) {
        final ArrayList<String> letterList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
        String ret = "";
        for (int i = 0; i != numLetters; ++i) {
            String letter = letterList.get(rand.nextInt(letterList.size()));
            if (rand.nextInt(2) == 0)
                letter = letter.toUpperCase();
            ret = ret.concat(letter);
        }
        return ret;
    }

    public static String getNumbers(int numLetters, Random rand) {
        final ArrayList<String> numList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        String ret = "";
        for (int i = 0; i != numLetters; ++i) {
                ret = ret.concat(numList.get(rand.nextInt(numList.size())));
        }
        return ret;
    }

    public static String getSpecial(int numLetters, Random rand) {
        final ArrayList<String> specialCharList = new ArrayList<>(Arrays.asList("!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", "/", ":",
                ";", "<", "=", ">", "?", "@", "[", "\\", "]", "^", "_", "`", "{" , "}", "|", "~" ));
        String ret = "";
        for (int i = 0; i != numLetters; ++i) {
                ret = ret.concat(specialCharList.get(rand.nextInt(specialCharList.size())));
        }
        return ret;
    }


    public static String getPassword(int numNumbers, int numSpec, int numLetters, Random rand) {
        // init string ret
        String password = "";
        // while numNumbers + specCount + letterCount != 0

        password = password.concat(getLetters(numLetters, rand));
        password = password.concat(getNumbers(numNumbers, rand));
        password = password.concat(getSpecial(numSpec, rand));

        //Randomize order
        password = scramble(password, rand);
        return password;
    }

    public static int getInput(String prompt) {

        int ret;
        Scanner sc = new Scanner(System.in);
        String input;
        // does not loop to count invalid entries
        while (true) {
            System.out.print(prompt);
            input = sc.nextLine();
            try {
                ret = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.println("Sorry, That is not valid input.");
            }
        }
        // returns 0 if invalid or input if valid
        return ret;
    }

    
    public static String scramble(String password, Random rand)
    {
        // Convert your string into a simple char array:
        char[] a = password.toCharArray();
        for( int i=0 ; i != a.length ; i++ )
        {
            int j = rand.nextInt(a.length);
            // Swap letters
            char temp = a[i]; a[i] = a[j];  a[j] = temp;
        }

        return new String(a);
    }


    public static void main(String[] args) {
        Random rand = new Random();
        // prompt for min length
        int minLength = getInput("What's the minimum length? ");
        // prompt for spec chars
        int numSpec = getInput("How many special characters? ");
        // prompt for numbers
        int numNumbers = getInput("How many numbers? ");

        // call getNumLetters

        // This call can be incorporated into getPassword but has been left in main for unit testing
        int numLetters = getNumLetters(numNumbers, numSpec, minLength, rand.nextInt(3));

        // call and print getPassword
        System.out.println("Your password is " + getPassword(numNumbers, numSpec, numLetters, rand));


    }
}
