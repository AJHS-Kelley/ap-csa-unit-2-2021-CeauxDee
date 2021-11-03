//Cody Collins, AP CSA Unit 2, 8:41 am, v0.0

import java.util.Scanner;

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
    }
}



