package org.example;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10]; //the size of the array
        numbers[0] = 1; //index always starts at 0
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10; //java reads arrays as strings so print accordingly
        System.out.println(java.util.Arrays.toString(numbers)); //now ran as a string in the console but reads the array
        //above example is the long way.

        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(java.util.Arrays.toString(numbers2));
        //cleaner version
        System.out.println(numbers2.length);
        //arrays hav fixe length
    }
}
