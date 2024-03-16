package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Create a new ArrayList of Strings
        List<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Thao");
        arrayList.add("MCTC");

        String firstWord = arrayList.get(0); //Use 0 to get the element at the first position in the ArrayList.

        // Iterate through the elements of the ArrayList using a for-each loop
        for (String s : arrayList) {
            // Print the current element
            System.out.println(s);

            // Print the uppercase version of the current element
            System.out.println(s.toUpperCase());

            // Print the length of the current element
            System.out.println(s.length());
        }

        // Print the entire ArrayList
        System.out.println(arrayList);
    }
}

