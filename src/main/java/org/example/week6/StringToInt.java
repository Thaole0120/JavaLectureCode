package org.example.week6;

public class StringToInt {
    public static void main(String[] args) {

        //Try running this in the debugger
        String hopeThisIsANumber = "50"; // use a number, and a string like


        try{
            int number  = Integer.parseInt(hopeThisIsANumber);
            System.out.println("The number is " + number);
        }catch (NumberFormatException e){
            System.out.println(hopeThisIsANumber + " is not a valid number");
        }

        System.out.println("This is the end of the program");
    }
}
