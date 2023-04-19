package org.example.sectionFour;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            String userResponse;
            String casualResponse = "sure";
            String aggressiveResponse = "Whoa, chill out";
            String fineResponse = "Fine, be that way";
            String psshhResponse = "Whatever";

            System.out.println("Hey-yo, My name is Bob, ask me anything");
            userResponse = scanner.nextLine();
            System.out.println("You entered:");
            System.out.println(userResponse);

            if (userResponse.endsWith("?")) {
                System.out.println("Bob: " + casualResponse);
            } else if (userResponse.endsWith("!")) {
                System.out.println("Bob: " + aggressiveResponse);
            } else if (userResponse.isEmpty()) {
                System.out.println("Bob: " + fineResponse);
            } else
                System.out.println("Bob: " + psshhResponse);
            System.out.println("Would you like to go again? (Y/N)");
            userResponse = scanner.nextLine();
            if(!userResponse.equalsIgnoreCase("Y")){
                break;
            }
        }
        scanner.close();
    }
}
