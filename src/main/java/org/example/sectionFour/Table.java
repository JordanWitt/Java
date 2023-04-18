package org.example.sectionFour;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter a number between 1 and 10");

            int userInt = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            String choice;
            System.out.println("You entered:");
            System.out.println(userInt);

            System.out.println("Here is your table");
            System.out.println("Number \t|Square \t|Cubed");
            System.out.println("------ \t|------ \t|-----");
            for (int i = 1; i <= userInt; i++) {
                int squared = i * i;
                int cubed = i * i * i;
                System.out.println(i + "\t\t|" + squared + "\t\t\t|" + cubed);
            }
            System.out.println("Would you like to go again? (Y/N)");
            choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }
        scanner.close();
    }
}
