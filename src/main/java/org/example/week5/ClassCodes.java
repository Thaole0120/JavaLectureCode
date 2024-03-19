package org.example.week5;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {

        //Create a new HashMap of class codes, and class names that you are taking this semester
        Map<Integer, String> classCodes = new HashMap<>();
        classCodes.put(2545, "Java");
        classCodes.put(1425, "Datacom");
        classCodes.put(2560, "Web");
        classCodes.put(2417, " Android Programming");

        //Write a loop that prints all the class codes and names in the form " ITEC 2545 Java"
         for ( Integer classCode: classCodes.keySet()){
             String className = classCodes.get(classCode);
             System.out.println(("ITEC" + classCode + " " + className));
         }

         // Print the number of classes you are taking - size of the Hashmap

        System.out.println(" I am taking " + classCodes.size() + "classes");
         int numberOfClasses = classCodes.size();

         //Add this variable
        int searchCode = 2417; // Android Programming

        // Use if statement to check if this code is in the Hashmap and print class name if so.
        if ( classCodes.containsKey(searchCode)){
            System.out.println(" This class is found in the Hashmap. The class name is " + classCodes.get(searchCode));
        }else {
            System.out.println(searchCode + " not found ");
        }

        // Add this variable
        int searchCode2 = 2545;
        String className = classCodes.get(searchCode2);
        if ( className == null ){
            System.out.println(searchCode2 + "not found");
        }else {
            System.out.println(" This class is found in the Hashmap. The class name is " + className);
        }
    }
}
