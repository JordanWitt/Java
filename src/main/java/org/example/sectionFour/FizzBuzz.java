package org.example.sectionFour;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter in a number:");
        int input = scanner.nextInt();
        System.out.println("you typed:");
        System.out.println(input);

        if(input % 3 == 0 && input % 5 == 0){
            System.out.println("FizzBuzz");
        }else if
            (input % 5 ==0){
            System.out.println("Buzz");
            }
        else
            System.out.println("Fizz");
    }
}
