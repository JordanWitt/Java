package org.example.sectionFour;

public class BasicArithmetic {
    public static String arithmeticExpression(int x, int y){
        return         (x + y) +
                "\n" + (x * y) +
                "\n" + (x / y) +
                "\n" + (x - y) +
                "\n" + (x % y); //modulus, leave the remainder of the number left, divides and prints what's left over
    }
    public static void recursionMethod(int x, int y){
        if(x * y <= 0){
            System.out.println("----one----");
            return;
        }
        System.out.println("----two----");
        System.out.println(x + y);
        recursionMethod(x,y - 1);
        System.out.println("Finished");
    }
    public static void main(String[] args) {
        System.out.println(arithmeticExpression(11, 5));
        recursionMethod(10, 20);
    }
}
