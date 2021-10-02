package baseline;

import java.util.Scanner;

public class Solution29 {

    // isValid method
    // takes a string
    // trys to convert to int
    // tests if == 0

    public static boolean isValid(String input) {
        int val = 0;
        try {
            val = Integer.parseInt(input);
        } catch (Exception e) {
            return false;
        }
        return (val != 0);
    }

    // rule of 72 function
    //takes a value divides by 72 returns an int
    public static int investmentCalc(int rate) {
        return 72/rate;
    }

    public static void main(String[] args) {

        // for loop until data is validated
        // if value == 0 call next
        // if value != numeric call next
        // else break
        Scanner sc = new Scanner(System.in);
        int rate = 0;
        String input = "";
        boolean flag = false;

        while (!flag) {
            System.out.print("What is the rate of return? ");
            input = sc.nextLine();
            flag = isValid(input);
            // I can avoid testing this but I did not want my function to print
            if (!flag)
                System.out.println("Sorry. That's not valid input.");
        }

        rate = Integer.parseInt(input);

        System.out.println("It will take " + investmentCalc(rate) + " years to double your initial investment.");
        }
        // call 72 funciton
        // print output

}
