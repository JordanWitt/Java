package org.example.sectionFour;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");


        String password = "password";
        System.out.println("Type in the password");
        String userGuess = scanner.nextLine(); // Use nextLine() to read the entire line
        while (true) {
            if (userGuess.equals(password)) {
                System.out.println("You've guessed correctly");
                break; // Exit the loop if the password is correct
            } else {
                System.out.println("Try again!");
                userGuess = scanner.nextLine(); // Read user input again
            }
        }
        scanner.close(); // Close the scanner after use


        System.out.println("Enter a number:");
        while (true) {
            try {
                int userInt = scanner.nextInt();
                // Process the user input here
                System.out.println("You entered: " + userInt);
                break; // Exit the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer:");
                scanner.nextLine(); // Consume the newline character
            }
        }
        scanner.close(); // Close the scanner after use
    }

}

