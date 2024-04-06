package org.example.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) {

        String filename = "ReadNumberFromFile.java";
        int maxLineLength = 100;

        //try with resources handling here
        try (BufferedReader reader = new BufferedReader(new FileReader("ReadNumberFromFile.java"))) {
        boolean linesToolong = false;
        int numbersOfLinesTooLong = 0;

            String line = reader.readLine();
            int lineCounter = 1;
            while (line != null){
                //System.out.println(line);
                if (line.length() > maxLineLength) {
                    System.out.println("The line" + lineCounter + " is too long");
                    System.out.println(line);
                    linesToolong = true;
                }

                    lineCounter ++;
                line = reader.readLine();
            }

            if (linesToolong){
                System.out.println("There were" + numbersOfLinesTooLong + " lines that were too long");
            }else {
                System.out.println("There were no lines that were too long");
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + filename + "because " + e);
        }
    }
}
