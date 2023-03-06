package org.example.sectionOne;

public class Strings {
    public static void main(String[] args) {
        String myName = "Jordan Witt" + "!"; //string literal
        System.out.println(myName.endsWith("!"));//returns true
        System.out.println(myName.length());
        System.out.println(myName.indexOf("o" + "e")); //logs -1 because e doesn't exist
        System.out.println(myName.replace("J", "B"));
        //replaces J with B
        //target and replacement are the parameters and "J" and "B" are the arguments
        //replace doesn't modify the original string it creates a new one
        System.out.println(myName);
        myName = myName.replace("J", "B");
        System.out.println(myName);
        System.out.println(myName.trim());
        System.out.println(myName.toLowerCase()); //converts all lower case
        System.out.println(myName.toUpperCase()); //all upper case

        //include special characters
        String message = "Hello \"Jordan\"";
        System.out.println(message); //escaping characters to add quotes
    }
}
