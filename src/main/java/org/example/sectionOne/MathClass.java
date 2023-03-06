package org.example.sectionOne;

public class MathClass {
    public static void main(String[] args) {
        int result =  Math.round(1.1F); //rounds to the nearest whole
        System.out.println(result);
        double result1 = Math.ceil(123.2);//anything over the whole is rounded to next highest int
        System.out.println(result1);
        int result2 = (int) Math.floor(234.9); // drops the decimal to a whole
        System.out.println(result2);
        int result3 = (int) (Math.random() * 50);
        System.out.println(result3);
    }
}
