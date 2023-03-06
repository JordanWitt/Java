package org.example.sectionTwo;

public class LogicalOperations {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = false;
        System.out.println();

        boolean hasHighIncome = false;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = true;
        boolean isEligible =(hasHighIncome && hasGoodCredit && hasCriminalRecord);
        System.out.println(isEligible);
    }
}
