package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class Solution35 {

    public static List<String> inputData() {
        // create an ArrayList
        // add data until reach empty entry
        // return list
        Scanner sc = new Scanner(System.in);
        ArrayList<String> entryList = new ArrayList<>();
        String input = "";
        boolean flag = true;
        while (flag) {
            System.out.print("Enter a name: ");
            input = sc.nextLine();
            if (input.isBlank())
                flag = false;
            else {
                entryList.add(input);
            }
        }
        return entryList;
    }


    public static void main(String[] args) {
        // call input data
        ArrayList<String> entryList = (ArrayList<String>) inputData();
        // I removed the getWinner function because sonarLint complained
        Random rand = new Random();
        System.out.println("The winner is... " + entryList.get(rand.nextInt(entryList.size())) + ".");
        // print winner

    }
}
