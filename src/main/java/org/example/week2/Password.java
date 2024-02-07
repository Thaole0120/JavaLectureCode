package org.example.week2;

import static input.InputUtils.stringInput;

public class Password {
    public static void main(String[] args) {

        String secretPassword = "kittens";

        System.out.println();
        String userPassword = stringInput("Enter the password");

        int maxGuesses = 5;

        //We have to check the password is correct before we let the user in
        //This loop will repeat while the password is NOT "kitten", the correct password
        while (!userPassword.equals(secretPassword) && maxGuesses > 1) {
            System.out.println("Password incorrect, access denied!");
            System.out.println("Try again");
            userPassword = stringInput("Enter the password");
            maxGuesses--;
        }

        if (maxGuesses > 1) {
            System.out.println("Correct password - access granted");
        } else {
            System.out.println("Max number of password attempts. ");
        }
    }
}
