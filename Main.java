import java.util.Scanner;

public class Main{
    private int studentNumber;
    private int gradeLevel;
    private double gradePointAvg;
    private String studentName;
}

public Student(){
    this.studentNumber = 0;
    this.gradeLevel = 0;
    this.gradePointAvg = 0.0;
    this.studentName = "";
}

public Student(int studentNumber, int gradeLevel, double gradePointAvg, String studentName){
    this.studentNumber = studentNumber;
    this.gradeLevel = gradeLevel;
    this.gradePointAvg = gradePointAvg;
    this.studentName = studentName;
}

public Student(int studentNumber, String studentName){
    this.studentNumber = studentNumber;
    this.studentName = studentName;
    this.gradeLevel = 9;
    this.gradePointAvg = 4.0;
}

public static void main(String[] args){
    Student student0 = new Student();
    Student student1 = new Student(12345678, 11, 0.37, "Dr. Strange");
}