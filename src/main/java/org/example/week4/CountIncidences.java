package org.example.week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class CountIncidences {

    public static void main(String[] args) {

        List<Double> speeds = new ArrayList<>();

        int totalHours = 12;

        for(int hour = 0; hour < totalHours; hour++){
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            speeds.add(speed);

        }

        System.out.println(" All the speeds are: ");

        for (int hour = 0; hour < speeds.size(); hour++){
            double speed = speeds.get(hour);
            System.out.println(" Hour: %d Speed %.2f\n, hour, speed");
        }

        // Count the number of times the speed was 0

        int zeroCount = 0;

        for (double speed: speeds){
            if (speed == 0){
                zeroCount++;
            }

            System.out.println("Number of times speed was 0 ( no connection) : " + zeroCount);
        }
    }
}
