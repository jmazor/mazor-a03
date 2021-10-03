package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution38 {

    public static class MyArray {
        private int[] array = new int[0];
        private int size = 0;


        public int[] getArray() {
            return array;
        }

        public int get(int i) {
            return array[i];
        }

        public int getSize() {
            return size;
        }

        public void addToArray(int x) {
            // create a new array of size n++
            int[] newArray = new int[size + 1];

            for (int i = 0; i < size; i++)
                newArray[i] = array[i];

            newArray[size] = x;
            array = newArray;
            ++size;
        }

        public void printArray() {
            for (int i = 0; i != size; ++i) {
                if (i == size - 1)
                    System.out.println(array[i] + ".");
                else
                    System.out.print(array[i] + " ");

            }
        }
    }



    public static MyArray getInput() {
        //get next line
        MyArray numbers = new MyArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces:");
        String input = sc.nextLine();
        String[] temp = input.split(" ");

        // for every item in line
        for (String num: temp){
            try  {
                int x = Integer.parseInt(num);
                numbers.addToArray(x);
            } catch (Exception e) {
                System.out.println("Invalid Input. Please Try Again");
                System.exit(0);

            }
        }
        return numbers;
    }

    public static MyArray filterEvenNumber(MyArray unfilteredArray) {
        // init new array
        MyArray evenArray = new MyArray();
        // test if num % 2 == 0
        for (int i = 0; i != unfilteredArray.getSize(); ++i) {
            if (unfilteredArray.get(i) % 2 == 0 && unfilteredArray.get(i) != 0)
                evenArray.addToArray(unfilteredArray.get(i));
        }

        //return array
        return evenArray;
    }


    public static void main(String[] args) {

        //call getInput
        MyArray numbers = getInput();
        //call filterEvenNumber
        numbers = filterEvenNumber(numbers);
        // print array
        System.out.print("The even numbers are ");
        numbers.printArray();

    }
}
