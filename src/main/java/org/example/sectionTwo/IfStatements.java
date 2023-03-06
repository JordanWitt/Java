package org.example.sectionTwo;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
       int temp = 32;
       if(temp > 30){
           System.out.println("It's still fucking cold");
           System.out.println("wear a coat");
       }
       else if (temp > 20 && temp<= 30) { //add the else if clause on a new line to make the code look cleaner
           System.out.println("wow, go outside");
       }else {
           System.out.println("brrrrr");
       }
    }
}
