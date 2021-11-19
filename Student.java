//Cody Collins, AP CSA Unit 2, 8:41 am, v0.5

import java.util.Scanner;


public class Student {
    // These are INSTANCE variables
    private int studentNumber;
    private int gradeLevel;
    private double gradePointAvg;
    private String studentName;


    //Creating a constructor
    public Student() {
        this.studentNumber = 0;
        this.gradeLevel = 0;
        this.gradePointAvg = 0.0;
        this.studentName = "";
    }

    // Value Constructor
    public Student(int studentNumber, int gradeLevel, double gradePointAvg, String studentName) {
        this.studentNumber = studentNumber;
        this.gradeLevel = gradeLevel;
        this.gradePointAvg = gradePointAvg;
        this.studentName = studentName;
    }

    public Student(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.gradeLevel = 9;
        this.gradePointAvg = 4.0;
    }
    // More than one constructor is known as OVERLOADING

    public static void calcGPA() {

        int grade0;
        int grade1;
        int grade2;
        int grade3;
        int totalGrade;
        double newGPA;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the first grade ");
        grade0 = myScanner.nextInt();

        System.out.println("What is the second grade ");
        grade1 = myScanner.nextInt();

        System.out.println("What is the third grade ");
        grade2 = myScanner.nextInt();

        System.out.println("What is the fourth grade ");
        grade3 = myScanner.nextInt();

        totalGrade = grade0 + grade1 + grade2 + grade3;

        newGPA = totalGrade/4;

        System.out.println("Your GPA is " + newGPA);
    }

public static void newLine() {
    System.out.println();
}

public static void threeLine() {
    newLine();
    newLine();
    newLine();
}

//Parameters and arguments
public static void assignLunch(int gradeLevel) {
    String lunchPeriod;

    if (gradeLevel == 9) {
        lunchPeriod = "First Lunch";
        System.out.print("This student has ");
        System.out.println(lunchPeriod);
    } else if (gradeLevel == 10) {
        lunchPeriod = "Second Lunch";
        System.out.print("This student has ");
        System.out.println(lunchPeriod);
    } else if (gradeLevel == 11) {
        lunchPeriod = "Third Lunch";
        System.out.print("This student has ");
        System.out.println(lunchPeriod);
    } else {
        lunchPeriod = "Off Campus Lunch";
        System.out.print("This student has ");
        System.out.println(lunchPeriod);
    }
}

public static void assignLunchMultiple(int gradeLevel, double gradePointAvg) {
    String lunchPeriod;
    // Boolean AND, OR, NOT
    // && -- AND
    // || -- OR
    // ! - NOT

    if (gradeLevel == 9 || gradePointAvg <= 1.5) {
        lunchPeriod = "First Lunch";
        System.out.print("This student has ");
        System.out.println(lunchPeriod);
    } else if (gradeLevel == 10 && gradePointAvg > 2.0) {
        lunchPeriod = "Second Lunch";
        System.out.print("This student has ");
        System.out.println(lunchPeriod);
    } else if (gradeLevel == 11 && (gradePointAvg != 0.0)) {
        lunchPeriod = "Third Lunch";
        System.out.print("This student has ");
        System.out.println(lunchPeriod);
    } else {
        lunchPeriod = "Off Campus Lunch";
        System.out.print("This student has ");
        System.out.println(lunchPeriod);
    }
}
public static void main(String[] args) {
    /*
    System.out.println("Tahm Kench");
    threeLine();
    System.out.println("We meet again, fiddlesticks");
    */

    assignLunch(9);
    assignLunchMultiple(10, 1.5);
    assignLunchMultiple(11, 2.2);
    }
}


