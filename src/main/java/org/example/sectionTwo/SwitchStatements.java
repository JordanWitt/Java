package org.example.sectionTwo;

public class SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("admin");
                break;
            case "mod":
                System.out.println("mod");
                break;
            default:
                System.out.println("guest");
        }
    }
}
