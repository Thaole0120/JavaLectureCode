package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteArray {
    public static void main(String[] args) throws Exception {

        String[] months = {"Jan", "Feb", "Mar"};

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("month.txt"));

        for (int i = 0 ; i < months.length; i++){
            String month = months[i];
            bufferedWriter.write(month + "\n");
            bufferedWriter.newLine();
        }

    }
}
