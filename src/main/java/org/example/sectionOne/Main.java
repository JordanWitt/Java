package org.example.sectionOne;//always terminate statement with semicolon
import java.util.Date;

public class Main {
    public static void main(String[] args) { //void means it will not return a value
        int age = 30; //int type of variable and age is the identifier 30 is the value
        int myAge = 28;
        int hisAge = myAge; //somewhat redundant
        System.out.println(myAge);
        System.out.println("Hello world!"); //where code is being written in console
        System.out.println(age);

        //primitive types are used for storing simple values
        //reference used for storing complex objects

        //primitive types
        //byte  1 [-128, 125]
        //short 2 [-32k, 32k]
        //int   4 [-2b. 2b]
        //long  8
        //double 8
        //float 4

        //primitive types
        byte ageTwo = 28;
        long viewCount = 5_323_435_234L; //adding an L at the int allows it to read as a long instead of int
        float price = 10.99F; //adding F to declare as a float
        char letter = 'A';
        boolean isValidated = false;
        //all above are reserved keywords

        Date now = new Date(); //new instance of the onject
        System.out.println(now);

        for (byte i = 0; i < ageTwo; i++) {
            System.out.println(ageTwo); //prints ageTwo 28 times

        }
    }
}