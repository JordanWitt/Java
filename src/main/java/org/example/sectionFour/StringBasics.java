package org.example.sectionFour;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            String noEducation = "We don't need no education";
            String noThought = "We don't need no thought control";
            String wrong = "wrong";

            String userInput;

            System.out.println("Do we need education? (Y/N)");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("Y")) {
                System.out.println(wrong);
            } else
                System.out.println(noEducation + "\n" + noThought);

            System.out.println("Would you like to answer again? (Y/N)");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("Y")) {
                break;
            }
        }
        scanner.close();
    }
}
