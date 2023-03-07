package org.example.sectionTwo;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        String input = "";
        do{
            System.out.println("Input: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.next().toLowerCase();
        }while (!input.equals("quit"));
    }// do while loops will get executed at least once  even if the condition is false
    //do while are rarely used but have certain cases, whle is used more
}

