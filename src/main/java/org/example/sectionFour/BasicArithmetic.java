package org.example.sectionFour;

public class BasicArithmetic {
    public static String arithmeticExpression(int x, int y){
        return         (x + y) +
                "\n" + (x * y) +
                "\n" + (x / y) +
                "\n" + (x - y);
    }
    public static void main(String[] args) {
        System.out.println(arithmeticExpression(10, 5));
    }
}
