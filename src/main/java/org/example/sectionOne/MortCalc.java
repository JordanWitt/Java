package org.example.sectionOne;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortCalc {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principle: ");
        int principle = scanner.nextInt(); //shot can only store a mox of 32k

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat(); //small number needs float
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principle
                            *  (monthlyInterest * Math.pow(1 + monthlyInterest,    numberOfPayments))
                            /  (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
