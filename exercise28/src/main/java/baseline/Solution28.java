package baseline;

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
        // For loop calling adderMethod
        // print final value
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i != 5; ++i) {
            System.out.print("Enter a number: ");
            sum = getSum(sc.nextInt(), sum);
        }
        System.out.println("The total is " + sum + ".");
    }
}
