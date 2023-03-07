package org.example.sectionTwo;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while ((!input.equals("quit"))){
            System.out.println("Inout: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue; //doesn't get echoed back, moves back to the beginning of a loop
            if(input.equals("quit"))
                break;//terminates a loop
            System.out.println(input);
        }
    }//going to continue to run the while loop until the user types quit, once quit is typed it breaks out of the loops and exits program
}
