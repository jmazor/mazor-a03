package baseline;

import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

public class Solution37 {

    // String constants because of sonarLint
    private static final String NUMBERS = "numNumbers";
    private static final String LETTERS = "numLetters";
    private static final String SPECIAL = "numSpec";

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

    public static void removeEntry(List<String> list, String entry) {
        // loop through array
        for (int i = 0; i != list.size(); ++i) {
            // test each value at index is equal to employee
            if (list.get(i).equals(entry)) {
                list.remove(i);
                break;
            }
        }
    }

    public static String getPassword(int numNumbers, int numSpec, int numLetters, Random rand) {
        // init string ret
        String password = "";
        final ArrayList<String> specialCharList = new ArrayList<>(Arrays.asList("!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", "/", ":",
                ";", "<", "=", ">", "?", "@", "[", "\\", "]", "^", "_", "`", "{" , "}", "|", "~" ));
        final ArrayList<String> numList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        final ArrayList<String> letterList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
        // create an arrayList of numNumbers, numSpec, numLetters
        ArrayList<String> printThis = new ArrayList<>(Arrays.asList(NUMBERS, SPECIAL, LETTERS));
        // while numNumbers + specCount + letterCount != 0
        while (numNumbers + numSpec + numLetters != 0) {
            // String test = random nextInt.get(list.size())
            String test = printThis.get(rand.nextInt(printThis.size()));
            // if test = numNumbers
            switch (test) {
                case NUMBERS -> {
                    if (numNumbers <= 0) {
                        // removeEntry(numNumbers)
                        removeEntry(printThis, NUMBERS);
                        // SONARLINT WONT LET ME JUST USE AN ELSE
                        break;
                    }

                    // call String ret = concat.getNum(rand)
                    password = password.concat(numList.get(rand.nextInt(numList.size())));

                    // decrease numCountCharacter.isLetter(password.charAt(i))
                    numNumbers--;
                }
                // if numCount equals 0
                case LETTERS -> {
                    // if test = numLetters
                    // if numLetter equals 0
                    //remove entry numLetters
                    if (numLetters <= 0) {
                        removeEntry(printThis, LETTERS);
                        // SONARLINT WONT LET ME JUST USE AN ELSE
                        break;
                    }
                    // call String ret = concat.getLetter(rand)
                    String letter = letterList.get(rand.nextInt(letterList.size()));
                    // randomly decide if uppercase
                    if (rand.nextInt(2) == 1) {
                        letter = letter.toUpperCase();
                    }
                    password = password.concat(letter);
                    // decrease numLetter
                    numLetters--;
                }
                // if test = numSpec
                case SPECIAL -> {
                    // removeEntry(numSpec)
                    if (numSpec <= 0) {
                        removeEntry(printThis, SPECIAL);
                        // SONARLINT WONT LET ME JUST USE AN ELSE
                        break;
                    }
                    password = password.concat(specialCharList.get(rand.nextInt(specialCharList.size())));
                    // call String ret = concat.getSpec(rand)
                    // decrease numspec
                    numSpec--;
                }
                // if numspec equals 0

                default -> System.out.println("Error");
            }
        }
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
