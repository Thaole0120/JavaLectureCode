package org.example.week2;

public class ForLoop {
    public static void main(String[] args) {

        //print number from 1 to 5
        for (int x=1; x <= 5; x++) {
            System.out.println(x);
        }

        // Print 10,9,8...0
        for (int x=10; x>=0; x--){
            System.out.println(x + "...");
        }
        System.out.println("Rocket Launch!!!");
    }
}
