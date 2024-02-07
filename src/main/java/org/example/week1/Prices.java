package org.example.week1;

import static input.InputUtils.*;

public class Prices {
    public static void main(String[] args) {
        String productName = stringInput("What is the name of the product? "); // Import static method "input.InputUtilss.stringInput
        double price = positiveDoubleInput("What does " + productName + " cost? "); // Use positiveDouble input to prevent negative number.
        int quantity = positiveIntInput("How many " + productName + " to sell?");

        double totalPrice = price * quantity;

        System.out.println(quantity + " of " + productName + " at $" + price + " each cost $" + totalPrice);
        System.out.printf("%d of %s at %.2f each costs $%.2f", quantity, productName, price, totalPrice);
    }
}
