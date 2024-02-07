package org.example.week1;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMCTC {
    public static void main(String[] arg) {
        double miles = positiveDoubleInput("How many miles from uour house to MCTC? ");
        double km = miles * 1.6;
        System.out.println("You live " + km + " kilometers from school");

        // Check if the user live more than 10 miles away?

        if (miles > 10) {
            System.out.println("You live more than 10 miles away. ");
        } else if (miles == 10){
            System.out.println("You live exactly 10 miles away. ");
        } else {
            System.out.println("You live less than 10 miles away. ");
        }
    }
}