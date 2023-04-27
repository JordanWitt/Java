package org.example.sectionFive.util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    String stringInput;
    int intInput;

   public void getString(){
       System.out.println("Tell me something");
        stringInput = scanner.nextLine();
       System.out.println("You entered " + stringInput);
    }
    public boolean yesNo() {
        System.out.println("Enter (Y/N)");
        if (stringInput.equalsIgnoreCase("Y"))
            return true;
        else
            System.out.println("Exiting program");
        System.exit(0);
        return false;
    }
    public int getTwoInt(int min, int max){
        System.out.println("Enter in two numbers");
        intInput = scanner.nextInt();
        System.out.println("You entered " + intInput);
        return (min + max);
    }
    public int getInt(int x){
        System.out.println("Enter in a number");
        intInput = scanner.nextInt();
        System.out.println("You entered " + intInput);
        return x;
    }
}
