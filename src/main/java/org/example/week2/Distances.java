package org.example.week2;

public class Distances {
    public static void main(String[] args) {

        //Start a list of distances in miles
        // Then create a new array with the corresponding distance in kilometers
        double [] miles = {1, 4, 10};
        double[] kilometers = new double[miles.length];

        for (int x = 0 ; x < miles.length; x++){
            double km = miles[x] / 1.6;
            kilometers[x] = km;
            }

        for (int x = 0; x < miles.length; x++) {
            System.out.println(miles[x] + " miles is equal to "
                    + kilometers[x] + "kilometers");
        }
    }
}
