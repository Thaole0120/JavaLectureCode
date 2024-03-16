package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class Removing2 {

    public static void main(String[] args) {

        // Create a list of class names
        List<String> classNames = new ArrayList<>();

        // Add class names to the list
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info tech Concepts");

        for (String name : classNames) {
            System.out.println(name);
            //     classNames.remove(0); // error
        }

        System.out.println();

        for (int i = 0; i < classNames.size(); i++) {
            // index - if need to know the index as well as the data
            System.out.println(classNames.get(i));
            classNames.remove(0);
        }

        System.out.println();
        while (!classNames.isEmpty()) {
            String name = classNames.remove(0);
            System.out.println(name);
        }

        System.out.println(classNames);

    }
}
