package org.example.sectionFive.util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    String stringInput;
    int intInput;

   private void getString(){
        stringInput = scanner.nextLine();
    }
    private boolean yesNo() {
        if (stringInput.equalsIgnoreCase("Y"))
            return true;
        else
            System.out.println("Exiting program");
        System.exit(0);
        return false;
    }
    private int getTwoInt(int min, int max){
        System.out.println("Enter in two numbers");
        intInput = scanner.nextInt();
        System.out.println(intInput);
        return (min + max);
    }
    private int getInt(int x){
        System.out.println("Enter in a number");
        intInput = scanner.nextInt();
        System.out.println(intInput);
        return x;
    }
}
