package org.example.sectionFour;

import java.util.Scanner;

public class ControlLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

// Do this instead
        boolean confirmation = userInput.equals("y");
        if(confirmation == Boolean.parseBoolean(String.format("y"))){
            System.out.println("goodbye");
        }else
            System.out.println("continue");
    }
}
