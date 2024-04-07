package org.example.week8_object;

public class ITECCourseManager {

    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310,20);

        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425,30);

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse softwareDevelopmentProjects = new ITECCourse("Software Development Projects", 2903, 24);
        softwareDevelopmentProjects.addStudent("Gus");
        softwareDevelopmentProjects.addStudent("Harry");
        softwareDevelopmentProjects.addStudent("Izzy");
        softwareDevelopmentProjects.addStudent("Jake");

        int totalEnrolled = softwareDevelopmentProjects.getNumberOfStudents();
        System.out.println("The " + softwareDevelopmentProjects.getName() + " class has " + totalEnrolled + " students");
        System.out.println("ITEC" + softwareDevelopmentProjects.getCode() + " " + softwareDevelopmentProjects.getName());

        softwareDevelopmentProjects.setMaxStudents(30);
        softwareDevelopmentProjects.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Made up course" , 1234, 3);
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Miriam");
        smallCourse.removeStudent("Kirby");
        smallCourse.addStudent("Nita");

        smallCourse.writeCourseInfo();
    }
}
