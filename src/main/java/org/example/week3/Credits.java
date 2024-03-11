package org.example.week3;

import static input.InputUtils.intInput;

public class Credits {
    public static void main(String[] args) {
    int required = intInput("How many credits does your program requires?");
    int earned = intInput("How many credeits have you earned?");
    int needed = howManyCreditsToGraduate(required, earned);
        System.out.println("You need " + needed + " credits. ");

    }

    public static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned){
        int creditToGraduate = creditsNeeded - creditsEarned;
        return creditToGraduate;
    }

}
