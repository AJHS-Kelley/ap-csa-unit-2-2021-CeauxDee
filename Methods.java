//Cody Collins, AP CSA Unit 2, 8:41 am, v0.5

import java.util.Scanner;

public static void Methods(String[] args){

public class Methods {
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
}
}

public static void newLine(){
    System.out.println();
}

public static void threeLine(){
    newLine();
    newLine();
    newLine();
}


