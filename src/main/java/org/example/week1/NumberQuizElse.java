package org.example.week1;

import static input.InputUtils.intInput;

public class NumberQuizElse {
    public static void main(String[] args) {

        int secretNumber =  6;

        int guess = intInput("Guess the number I am thinking of");

        //If the guess is equal to secret number, the user guessed correctly
        if (guess == secretNumber){
            System.out.println("You guessed correctly!");
        } else {
            System.out.println(" Sorry, I was thinking of " + secretNumber); //Otherwise, they did not guess right and then tell them the right answer.
        }
    }
}
