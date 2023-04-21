package org.example.sectionFour;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] sides = {1,2,3,4,5,6};

        int diceOne = sides[random.nextInt(sides.length)];
        int diceTwo = sides[random.nextInt(sides.length)];
    }
}
