package org.example.week8_object;

import java.security.PublicKey;

public class Pool {
    //instance variables
    private String name;  //field, or a variable
    private double length; //another field
    private String address;
    private double maxDepth;

    public Pool(String poolName, double poolLength){
        name = poolName;
        length = poolLength;
    }

    //instance method
    //Instance is another word for an object
    //an instance of a class
    // A pool is an instance of the

    public double distanceForLaps(int laps){
        //10 laps of pool of length 50, that's 500 meters.
        double total = laps * this.length;
        return total;
    }

    public String toString(){
      String description = this.name + " pool is " + length + "meters long.";
      return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0 || length > 1000 ){
            return;
        }
        this.length = length;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }
}
