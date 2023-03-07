package org.example.sectionTwo;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana"};
        for(int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        for(String fruit : fruits)
            System.out.println(fruit); //shorthand version, can't be arranged dec, and index can't be accessed
    }
}
