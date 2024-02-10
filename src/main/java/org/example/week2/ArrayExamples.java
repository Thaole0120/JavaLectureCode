package org.example.week2;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        // Example int array
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 100;
 //       numbers[5] = 3;

        String[] classNames =  {"Java", "C#", "Web", "Android", "iOS"}; //List these class in an order.
        //     classNames[0] = "Java";   * don't need these code to save time of typing.
        //     classNames[1] = "C#";
        //     classNames[2] = "Web";

        System.out.println("One of the second year classes is " + classNames[2]);

        int numberOfClasses = classNames.length;
        System.out.println("There are " + numberOfClasses + " classes.");

        for (int x=0; x<classNames.length; x++) { //Print all the classes.
            System.out.println("A class name is " + classNames[x]);
        }

        System.out.println(Arrays.toString(classNames)); // Use Arrays.toString to print array.

    }
}
