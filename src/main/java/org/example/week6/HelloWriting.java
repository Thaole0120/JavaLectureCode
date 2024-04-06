package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException {

        // file will be created if it does not exist
        // file will be overwritten if it does exist!
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Hello!\n");
        bufferedWriter.newLine();
        bufferedWriter.write("More data here\n");
        bufferedWriter.newLine();
        bufferedWriter.write("Goodbye!\n");
        bufferedWriter.newLine();

        bufferedWriter.close(); // don't forget to close!!!

        FileWriter writer2 = new FileWriter("hello.txt", true); // append flag - true means add data to the end.
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Other data");
        bufferedWriter2.newLine();
        bufferedWriter2.write("Hello Programmer");
        bufferedWriter2.newLine();
        bufferedWriter2.write("End of file");
        bufferedWriter2.newLine();

        bufferedWriter2.close();
    }

}


