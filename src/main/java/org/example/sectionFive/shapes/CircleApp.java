package org.example.sectionFive.shapes;
import org.example.sectionFive.util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        int attempt = 0;
        int runthroughs = 5;
        boolean running = true;
        boolean goAgain = input.yesNo();

        System.out.println("\t\t\t\t\tLet's make a circle");
        System.out.println();

        CIRCLEGAME:
            while (true) {
                if (!goAgain) {
                    break;
                } else if (goAgain) {
                    runthroughs--;
                    System.out.println("You have " + runthroughs + " more circles to make");
                    double getCircleInfo = input.getDouble();
                    Circle circle = new Circle(getCircleInfo);
                    System.out.printf("The area of the circle: " + circle.getArea());
                    System.out.printf("The circumference of the circle: " + circle.getCircumference() + "\n");
                    attempt++;
                    if(runthroughs <= 1){
                        System.out.println("Thanks for playing");
                        System.out.println("here's the number of circles made: " + attempt);
                        System.out.println("Press play to restart");
                        continue CIRCLEGAME;
                    }else{
                        break;
                    }
                }
            }System.out.println("Thanks for playing. You had " + attempt + " attempts.");
        }
    }

