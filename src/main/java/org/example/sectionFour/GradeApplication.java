package org.example.sectionFour;

import java.util.Scanner;

public class GradeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            String choice;
            System.out.println("Enter a numerical grade from 0 to 100");
            int userGrade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("You've entered:");
            System.out.println(userGrade);

            if (userGrade == 88 || userGrade == 100) {
                System.out.println("You received an A");
            } else if (userGrade == 80 || userGrade == 87) {
                System.out.println("You received a B");
            } else if (userGrade == 67 || userGrade == 79) {
                System.out.println("You received a C");
            } else if (userGrade == 60 || userGrade == 66) {
                System.out.println("You received a D");
            } else
                System.out.println("You received an F");

            System.out.println("Would you like to go again? (Y/N)");
            choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Y")){
                break;
            }
        }
        scanner.close();
    }
}
