package org.example.week1;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {

        //When taking Welding classes at MCTC, you must dress safely.
        // You should wear cotton or wool clothes. And, you should wear closed-toe shoes.

        // This program checks if a student is dressed safely for welding.

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes? ");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes? ");
        boolean closedToeShoes = yesNoInput("Are you wearing closed-tow shoes? ");

        if ( (cottonClothes || woolClothes) && closedToeShoes) { //Use () to separate compared pairs
            System.out.println("You are dressed safely. ");
        } else {
            System.out.println("You must wear cotton or wool clothes and closed toe shoes. ");
        }
    }
}
