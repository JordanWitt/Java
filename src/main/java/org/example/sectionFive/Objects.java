package org.example.sectionFive;

public class Objects {

    static class Person{
    public String firstName;
    public String lastName;

    public String greeting(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

}

    static class Arithmetic {
        // static property
        public double pi = 3.14159;

        // static methods
        public int add(int x, int y) {
            return x + y;
        }

        public int multiply(int x, int y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Person jordan = new Person();
        jordan.firstName = "Jordan";
        jordan.lastName = "Witt";
        Person joey = new Person();
        joey.firstName = "Joey";
        joey.lastName = "Ginel";
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.pi = 3.14;
        System.out.println(arithmetic.add(2,2) + "\n" + arithmetic.multiply(2,3));
        System.out.println(arithmetic.pi);

        System.out.println(jordan.greeting() + " " + joey.greeting());
    }
}
