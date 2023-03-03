package org.example;

public class Strings {
    public static void main(String[] args) {
        String myName = "Jordan Witt" + "!"; //string literal
        System.out.println(myName.endsWith("!"));
        System.out.println(myName.length());
        System.out.println(myName.indexOf("o" + "e")); //logs -1 because e doesn't exist
        System.out.println(myName.replace("J", "B"));
        //replaces J with B
    }
}
