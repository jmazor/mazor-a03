package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */


import java.lang.Math;
import java.util.Scanner;

public class Solution26 {

    // create a class called PaymentCalculator
    // Class has 3 private variables APR  (as percentage) Balance and Monthly payment

    // Class has one public method called calculate MonthsUntilPaidOff
    // Takes no paramters and does the formula
    public static class PaymentCalculator {
        double dailyRate;
        double cardBalance;
        double monthlyPayment;

        public PaymentCalculator () {

        }

        public void setAPR (double x) {
            this.dailyRate = (x/100.0)/365;
        }

        public int calculateMonthsUntilPaidOff() {
            double ret = ((-1.0/30.0) * (Math.log(1 + cardBalance/monthlyPayment * (1 - Math.pow(1 + dailyRate, 30)))) / (Math.log(1+ dailyRate)));
            ret += .999999999999999;
            return (int)ret;
        }
    }


    public static void main(String[] args) {
        // init a PaymentCalculator object called card
        // Ask for and set
        // balance
        // apr
        // monthly payment
        Scanner sc = new Scanner(System.in);
        PaymentCalculator card = new PaymentCalculator();
        System.out.print("What is your balance? ");
        card.cardBalance = sc.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        card.setAPR(sc.nextDouble());
        System.out.print("What is the monthly payment you can make? ");
        card.monthlyPayment = sc.nextDouble();
        // call card.MonthsUntilPaidOff
        System.out.println("It will take you " + card.calculateMonthsUntilPaidOff() + " months to pay off this card.");



    }


}
