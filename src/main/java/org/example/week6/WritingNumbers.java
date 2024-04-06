package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        FileWriter writer = new FileWriter("number.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(Integer.toString(data1) + "\n");
        bufferedWriter.write(Integer.toString(data2)+ "\n");
        bufferedWriter.write(data3 + "\n"); //int number argument

        bufferedWriter.write(number + "\n");
        bufferedWriter.write("test"); //write a string

        bufferedWriter.close();
    }
}
