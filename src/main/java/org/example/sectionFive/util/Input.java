package org.example.sectionFive.util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    //STRING INPUT
    public String getString() {
        System.out.println("Enter something: ");
        return scanner.nextLine();
    }

    //BOOLEAN Y/N
    public boolean yesNo() {
        System.out.println("Enter yes or no to continue: ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("y")) {
            System.out.println("You entered: ");
            return true;
        } else if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("n")) {
            System.out.println("You entered: ");
        }return false;
    }

    //MAX MIN INT
    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d", min, max);//error printing with println and print
        int input = scanner.nextInt();
        if (input > min && input < max) {
            return input;
        } else {
            System.out.println("Sorry, that's not within range");
        }
        return input;
    }

    //GET INT
    public int getInt() {
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        return input;
    }

    //GET DOUBLE MIN MAX
    public double getDouble(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        double input = scanner.nextInt();
        if (input > min && input < max) {
            return input;
        } else {
            System.out.println("Sorry, that's not within range");
        }
        return input;
    }
    //GET DOUBLE
    public double getDouble(){
        System.out.println("Enter a number: ");
        return scanner.nextDouble();
    }
}
