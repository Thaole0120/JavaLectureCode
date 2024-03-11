package org.example.week3;

public class StringFormatting{
    public static void main(String[] args) {

    String college = "MCTC";
    String className = "Java Programming";
    int classCode = 2545;
    int credits = 6;
    double averageGrade = 84.545345;
    boolean isOnline = true;

    System.out.println("This class code is " + classCode);

    System.out.println("This class is " + classCode + " " + className + ". It is taught at "
            + college + ". It is " + credits + " credits, the average grade is " + averageGrade
            + "%. Is it online? " + isOnline + ".");

    //%d = int
    //%s = String, anything else
    //%f = double
    System.out.printf("This class is %d %s. It is taught at %s. It is %d credits, the average " +
            "grade is %f. It is online? %s.", classCode, classCode, college, credits, averageGrade, isOnline );

        System.out.printf("The average grade is %f\n", averageGrade);
    }
}
