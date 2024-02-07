package org.example.week1;

import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {

        String college = stringInput("Which college do you attend? ");

        if (college.equalsIgnoreCase("MCTC")){ //Cannot use == because two strings are not the same. Use "equals()" instead.
            System.out.println("Yay, MCTC!");
        } else {
            System.out.println("Too bad, you should check out MCTC. ");
        }
    }
}
