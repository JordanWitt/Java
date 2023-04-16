package org.example.sectionFour;

public class JavaTwo {
    public static <string> void main(String[] args) {
        {
            System.out.println("Code inside of curly braces should be indented");
            System.out.println("with four spaces");
        }
        int myNumber = 12 + 12 * 2;
        System.out.println(myNumber);

        int myInteger = 900;
        long morePercise = myInteger;
        System.out.println(morePercise);

        double pi = 3.14159;
        int almostPi = (int) pi;//casting
        System.out.println(almostPi); //shortens double to single

        int myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber);

        String myString = "Jordan";
        System.out.println(myString);

        long myNumbers = 389;
        System.out.println(myNumbers);

        myNumbers = 123;
        System.out.println(myNumbers);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        System.out.println(++x);
        System.out.println(x);

        int t = 10;
        int y = 2;
        t = t / y;
        y = y - t;
        System.out.println(t + y); // 2 10/5 = 5..2-5 = -3, -3 + 5 = 2


    }
}
