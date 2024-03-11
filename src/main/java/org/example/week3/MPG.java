package org.example.week3;

import static input.InputUtils.doubleInput;

public class MPG {
    public static void main(String[] args) {
        // Get user input for miles driven and gallons of gas used
        double miles = doubleInput("Enter number of miles driven: ");
        double gas = doubleInput("Enter gallons of gas used: ");

        // Calculate miles per gallon using the milesPerGallon method
        double mpg = milesPerGallon(miles, gas);

        // Display the result to the user
        System.out.println("The MPG for this journey is " + mpg + " miles per gallon ");
    }

    // Method to calculate miles per gallon
    public static double milesPerGallon(double miles, double gallonOfGas) {
        // Calculate and return miles per gallon
        double mpg = miles / gallonOfGas;
        return mpg;
    }
}