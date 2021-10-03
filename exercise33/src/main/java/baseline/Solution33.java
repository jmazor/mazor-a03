package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class Solution33 {


    public static void main(String[] args) {
        //Ask What is your question
        System.out.print("What's your question?\n> ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        Random rand =  new Random();
        // init array answers[] with "Yes" "No" "Maybe" "Ask again later." (in this order)
        List<String> answers = new ArrayList<>(List.of("Yes", "No", "Maybe", "Ask again later."));
        // call getRand()
        // print  answers[getRand()]
        System.out.println(answers.get(rand.nextInt(4)));
    }
}
