package org.example.sectionFive.shapes;

import org.example.sectionFive.util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        int attempt = 0;
        int runthroughs = 5;
        boolean goAgain = true;

        System.out.println("\t\t\t\t\tLet's make a circle");
        System.out.println();

        while (runthroughs > 0 && goAgain) {
            runthroughs--;
            System.out.println("You have " + runthroughs + " more circles to make");
            double circleRadius = input.getDouble();
            Circle circle = new Circle(circleRadius);
            System.out.println("The area of the circle: " + circle.getArea());
            System.out.println("The circumference of the circle: " + circle.getCircumference() + "\n");
            attempt++;

            if (runthroughs == 0) {
                System.out.println("Thanks for playing");
                System.out.println("Number of circles made: " + attempt);
                System.out.println("Press play to restart");
            } else {
                goAgain = input.yesNo();
            }
        }

        System.out.println("Thanks for playing. You had " + attempt + " attempts.");
    }
}
