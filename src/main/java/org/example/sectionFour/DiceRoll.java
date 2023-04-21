package org.example.sectionFour;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] sides = {1,2,3,4,5,6};
        int luckyNumber = 8;
        int attempt = 0;

        boolean running = true;

        while (running) {
            int diceOne = sides[random.nextInt(sides.length)];
            int diceTwo = sides[random.nextInt(sides.length)];
            int roll = diceOne + diceTwo;


            System.out.println("Would you like to roll the dice? (Y/N)?");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Y")) {
                if (roll == luckyNumber) {
                    System.out.println("You Win");
                    System.out.println("You rolled " + roll);
                }else
                    System.out.println("Sorry you didn't get the lucky number. Try Again!");
            }
            attempt++;
            if(input.equalsIgnoreCase("Y")){
                continue;
            }else
                running = false;
            System.out.println("Thanks for playing " +
                    "\n Here are your number of attempts: " + attempt);

        }
    }
}
