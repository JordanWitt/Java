package org.example.sectionOne;

public class ArithmeticExpressions {
    public static void main(String[] args) {
        int result = 10 + 3;
        System.out.println(result);
        result = 10 / 3;
        System.out.println(result);
        double result2 = (double)10 / (double)3;
        //prints a double result
        System.out.println(result2);
        int x = 1;
        x += 2; //+= augmented assignment operator/ or compound
        System.out.println(x);
        int q = 10 + 3 * 2;
        System.out.println(q);
    }
}
