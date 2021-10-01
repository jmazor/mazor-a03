/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

package baseline;

import java.util.Scanner;


public class Solution24 {
    //create a function called anagram which takes 2 strings
    // reverses string 2 and compares
    // if equal returns true
    public static boolean isAnagram(String a, String b) {
        b =  new StringBuilder(b).reverse().toString();
        return a.equals(b);
    }



    public static void main(String[] args) {

        System.out.print("Enter the first string: ");
        //input data as strings
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.print("Enter the second string: ");
        String b = sc.nextLine();
        // call anagram function and print result

        if (isAnagram(a,b)) {
            System.out.println("\"" + a + "\" and  \"" + b + "\" are anagrams.");
        }
        else
            System.out.println("\"" + a + "\" and \"" + b + "\" are not anagrams.");
    }



}
