package org.example.sectionTwo;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        String input = "";
        while (!input.equals("quit")){
            System.out.println("Input: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.next().toLowerCase();
        }
    }// will keep asking for inout until user types in the string of quit
}
