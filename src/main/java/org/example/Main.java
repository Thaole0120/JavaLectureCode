package org.example;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String userName = stringInput("Please enter your name: ");
        System.out.println("Welcome, " + userName);

        int howManyClasses = intInput("How many classes are you taking? ");
        System.out.println("You are taking " + howManyClasses + " classes");
    }
}
