package org.example.sectionFour;

public class JavaMethods {
    public static String sayHello(String name){
        return String.format("Hello, %s!", name);
    }
    public static int returnThree() {
        return 3;
    }
    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }
//
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sayHello("Jordan"));
        System.out.println(returnThree());
        System.out.println(shout("ahhhhh"));
        count(5);
    }
}
