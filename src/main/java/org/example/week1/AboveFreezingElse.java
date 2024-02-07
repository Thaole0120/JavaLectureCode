package org.example.week1;

import static input.InputUtils.doubleInput;

public class AboveFreezingElse {
    public static void main(String[] args) {
        double temp = doubleInput("Enter today's temperature in F");

        //Indentation in if blocks is optional
        //It's a standard convention and helps readability

        if (temp > 32){
            System.out.println("It's above freezing"); // If the condition is true, this line will run.
        } else {
            System.out.println("It's below freezing"); // Otherwise, this will run if the condition is false.
        }
    }
}
