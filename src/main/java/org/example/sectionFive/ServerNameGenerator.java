package org.example.sectionFive;

import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives =   {"Vibrant", "Serene", "Whimsical",
                "Majestic", "Enchanting", "Lively",
                "Tranquil", "Radiant", "Blissful",
                "Captivating"};
        String[] nouns      =   {"Banana", "Squirrel", "Potato",
                "Chicken", "Donut", "Unicorn",
                "Waffle", "Pickle", "Monkey", "Noodle"};
        Random random = new Random();
        String serverName = adjectives[random.nextInt(adjectives.length)] + " " +
                nouns[random.nextInt(nouns.length)];

        System.out.println("Generated server name: " + serverName);
    }
}
