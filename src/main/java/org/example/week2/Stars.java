package org.example.week2;

public class Stars {
    public static void main(String[] args) {

        //Display a square of *
        int size = 5;

        // The outer loop prints one row per loop repeat
        for (int x = 0 ; x < size ; x++){

            //Inner for loop. Print a star 5 times for each row
            for (int y = 0 ; y < size; y++){
                //Use System.out.print not println . This doesn't add the new line
                // at the end of the output, so all the stars are on the same line
                System.out.print("*");
            }

            //And then move to the next line
            System.out.println();
        }
    }
}
