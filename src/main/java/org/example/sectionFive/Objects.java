package org.example.sectionFive;

public class Objects {

    static class Person{
    public String firstName;
    public String lastName;

    public String greeting(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }
}
    public static void main(String[] args) {
        Person jordan = new Person();
        jordan.firstName = "Jordan";
        jordan.lastName = "Witt";
        Person joey = new Person();
        joey.firstName = "Joey";
        joey.lastName = "Ginel";

        System.out.println(jordan.greeting() + " " + joey.greeting());
    }
}
