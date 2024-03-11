package org.example.week3;

public class Marathon {
    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10; // used to increase by 10%

        marathonSchedule(currentDistance, targetDistance, percentIncrease);
    }
        public static void marathonSchedule(double currentDistance, double targetDistance, double percentIncrease){
        int week = 1;
        // loop until the current distance is greater than the target distance
        // the loop will count the number of weeks
        while (currentDistance < targetDistance){
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance + percentIncrease; // increase by 10%
            week++; // count the number of weeks

        }
        // need to print one more line - the distance tht is greater than the marathon distance
        System.out.println(week+ " " + currentDistance);

    }
}
