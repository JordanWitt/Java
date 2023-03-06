package org.example.sectionOne;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("You are old" + " " + age);
        scanner.nextLine();
        String message = scanner.nextLine();
        System.out.println("what is tyler" + " " + message);
    }
}
