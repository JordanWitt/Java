package org.example.sectionFour;

import java.util.Random;
import java.util.Scanner;

public class ConsoleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //player health
        int player = 100;
        int playerDamage = 30;
        //enemy base stats
        String[] enemies = {"Draven", "Sion", "Kled", "Riven"};
        int enemyMaxHealth = 75;
        int enemyAttackDamage = 25;

        //turret
        int turret = 50;
        int numAttacks = 0;

        //base items/mechanics
        int recall = 50; //restores base health
        int enemyRecall = 45;
        int item = 10; //adds 10 dmg
        int critChance = 5; //critical chance every 3 hits
        int armour = 5; //armour for the tank champs
        int lifeSteal = 5; //life-steal

        boolean running = true;
        boolean minionsSpawned = false;
        boolean recalled = false;

        System.out.println("-----WELCOME TO SUMMONERS RIFT-----");
        GAME:
        while (running) {
            if (!minionsSpawned) {
                try {
                    System.out.println("Minions will appear in 5 seconds");
                    Thread.sleep(5000);
                    System.out.println("Minions arrived to lane");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                minionsSpawned = true;
            }
            String enemy = enemies[random.nextInt(enemies.length)]; // random enemy on kill
            System.out.println("\t# " + enemy + " arrived to lane #\n");

            while (enemyMaxHealth > 0) { // iteration of attacks/player options
                System.out.println("\tYour HP: " + player); //player health
                System.out.println("\tYour Damage: " + playerDamage);
                if(enemy.equals("Sion")||enemy.equals("Riven")){
                    enemyMaxHealth += armour;
                } else if (enemy.equals("Draven")|| enemy.equals("Kled")) {
                    enemyAttackDamage += lifeSteal;
                }
                System.out.println("\t" + enemy + "'s HP: " + enemyMaxHealth); //enemy health
                System.out.println("\tEnemy Damage: " + enemyAttackDamage);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1 Attack");
                System.out.println("\t2 recall");
                System.out.println("\t3 Surrender!\n"); //player options

                String input = scanner.nextLine();
                if(input.equals("1")){
                    enemyMaxHealth -= playerDamage; //enemy loss
                    player -= enemyAttackDamage; //losing health

                    numAttacks++;
                    if(numAttacks % 3 ==0 && recalled){
                        playerDamage *= 2;
                        System.out.println("\tCRITICAL STRIKE");
                    }
                    System.out.println("\t You strike the " + enemy + " for " + playerDamage + " damage");
                    System.out.println("\t You receive " + enemyAttackDamage + " in retaliation!");

                    if(player <= 1) {
                        System.out.println("\t DEFEAT");
                        break;
                    }
                } else if (input.equals("2")) {
                    recalled = true; //checks that the player recalled
                    player += recall; //gaining health
                    playerDamage += (lifeSteal + critChance + item);
                    //enemy
                    enemyMaxHealth += enemyRecall;
                    enemyAttackDamage += (lifeSteal + critChance + item);
                }else if(input.equals("3")){
                    System.out.println("Would you like to surrender? (Y/N)");
                    input = scanner.nextLine();
                    if(!input.equalsIgnoreCase("N")){
                        System.out.println("DEFEAT");
                    }else if (player < 1) {
                        System.out.println("TIP: recalling restores 30 HP in game");
                    }else
                        System.out.println("Continue on");
                }
            }
        }
        //end of while loop
    }
}