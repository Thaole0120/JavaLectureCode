package org.example.week6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        final String filename = "ITEC_Classes.txt";
        //Write lines to the file "ITEC 2545 Java" and "ITEC 2560 Web" etc.
        List<String> classNames = List.of("Java" , "Web", "C#");

        // List<String> classes = new ArrayList<>();
        //classes.add("Java");
        //classes.add("Web");
        //classes.add("C#");


        List<Integer> classCodes = List.of(2545, 2560, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ITEC_Classes.txt"));

        for (int i = 0 ; i < classNames.size(); i++) {
            String name = classNames.get(i);
            int code = classCodes.get(i);
            String outputLine = (String.format("ITEC %d %s \n",code, name));
            bufferedWriter.write(outputLine);
        }

        bufferedWriter.close();


        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        List <String> classDescription = new ArrayList<>();

        String line = bufferedReader.readLine();

        while (line != null ){
            classDescription.add(line);
            line = bufferedReader.readLine();

        }

        System.out.println("End of file reached");
        System.out.println(classDescription);

    }
}
