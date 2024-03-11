package org.example.week3;

import static input.InputUtils.*;

public class Tires {
    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Get the number of tires to compare from the user
        int numberOfTiresToCompare = positiveIntInput("Enter number of tires to compare");

        // Create an array to store tire reports
        String[] tireReports = new String[numberOfTiresToCompare];

        // Loop through each tire for comparison
        for (int t = 0; t < numberOfTiresToCompare; t++) {
            // Get tire information and store the report in the array
            String report = getTireInfo();
            tireReports[t] = report;
        }

        // Print the tire reports in a table format
        printReportTable(tireReports);
    }

    // Method to print the tire reports in a table format
    private static void printReportTable(String[] tireReports) {
        for (int t = 0; t < tireReports.length; t++) {
            System.out.println(tireReports[t]);
        }
    }

    // Method to get information about a tire
    public static String getTireInfo() {
        // Get user input for tire name, price, and warranty miles
        String tireName = stringInput("Enter name of tire");
        double price = doubleInput("Enter price for " + tireName);
        double miles = doubleInput("Enter warranty miles for " + tireName);

        // Calculate the price per thousand miles for the tire
        double pricePerThousandMiles = price / miles * 10000;

        // Return a formatted string with tire information
        return "The " + tireName + " tire costs $" +
                pricePerThousandMiles + " dollars per thousand miles";
    }
}