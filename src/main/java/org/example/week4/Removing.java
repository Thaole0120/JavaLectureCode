package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

       List<String> classNames = new ArrayList<>();
        // Add class names to the list
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info tech Concepts");

        // Print the list of class names
        System.out.println(classNames);

        // Remove "Programming Logic" from the list and print the updated list
        boolean wasRemoved = classNames.remove("Programming Logic");
        System.out.println(classNames + " " + wasRemoved);

        // Remove the element at index 0 (the first element) from the list and print the updated list
        classNames.remove(0);  //int primitive type - index are primitive
        System.out.println(classNames);

        // Replace the element at index 1 with "Systems Analysis" and print the updated list
        classNames.set(1, "Systems Analysis");
        System.out.println(classNames);

        // Check if the list contains "C# Programming" and print the result
        String search = "C# Programming";
        if (classNames.contains("C# Programming")) {
            System.out.println("The list does contain " + search);
        } else {
            System.out.println("The list does not contain C#");
        }

        // Print the size of the list
        System.out.println(classNames.size());

        // Clear the list and print the updated list and size
        classNames.clear();
        System.out.println(classNames);
        System.out.println(classNames.size());

        // Check if the list is empty and print the result
        System.out.println(classNames.isEmpty());

    }
}
