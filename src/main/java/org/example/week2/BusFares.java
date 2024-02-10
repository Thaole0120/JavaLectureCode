package org.example.week2;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {

//       final int NUMBER_OF_DAYS = 7; // Use keyword final to indicate a constant value

        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double total = 0;
        // Off by one error , change day = 1 to day = 0 to start with Monday.
        for (int day = 0; day < dayNames.length ; day++){
            String dayName = dayNames[day];
            double amountSpent =
                    doubleInput("What did you spend on bus fares on day " + dayName);

            total = total + amountSpent;
        }
        System.out.printf("Total for the week = $%.2f" , total);
    }
}
