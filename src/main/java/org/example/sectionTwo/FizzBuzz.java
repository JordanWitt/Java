package org.example.sectionTwo;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();
        if(number % 5 == 0 && number % 3 == 0) //most complex needs to be executed first and generic below to ensure it gets ran,
            System.out.println("FizzBuzz");
        else if (number % 3 == 0 )
            System.out.println("Buzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println("Can't compile " + number);
    }
}
//most specific conditions needs to be on the top