package org.example.sectionFour;

import java.util.Random;
import java.util.Scanner;

public class ConsoleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //player health
        int player = 100;
        //enemy base stats
        String[] enemies = {"Draven", "Sion", "Kled", "Riven"};
        int enemyMaxHealth = 88;
        int enemyAttackDamage = 25;

        //base items/mechanics
        int recall = 50; //restores base health
        int item = 10; //adds 10 dmg
        int critChance = 5; //critical chance every 3 hits

    }
}
