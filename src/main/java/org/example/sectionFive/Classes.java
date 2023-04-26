package org.example.sectionFive;

import java.util.Scanner;

public class Classes {

    static class Student {
        public double grade;
        public String name;
        boolean isStudent;


        public Student(String name, double grade, boolean isStudent) {
            this.grade = grade;
            this.name = name;
            this.isStudent = isStudent;
        }

        public void gradeCheck() {
            if (grade >= 90)
                System.out.println(name + " You received an A");
            else if (grade >= 80)
                System.out.println(name + " You received a B");
            else if (grade >= 70)
                System.out.println(name + " You received a C");
            else if (grade >= 60)
                System.out.println(name + " You received a D");
            else
                System.out.println(name + " You received an F");
        }

        public boolean isStudentCheck() {
            return isStudent;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Student luke = new Student("Luke Skywalker", 93.4, true);
            Student anakin = new Student("Anakin Skywalker", 68.7, true);
            Student yoda = new Student("Yoda", 0.0, false);
            Student obi = new Student("Ben Kenobi", 0.0, false);

            System.out.println("Welcome, Sign in to view your grade");
            String input = scanner.nextLine();
            boolean accessGranted = false;

            if (input.equalsIgnoreCase("luke skywalker") && luke.isStudent)
                accessGranted = luke.isStudentCheck();
            else if (input.equalsIgnoreCase("anakin skywalker") && anakin.isStudent)
                accessGranted = anakin.isStudentCheck();
            else if (input.equalsIgnoreCase("yoda") && yoda.isStudent)
                accessGranted = yoda.isStudentCheck();
            else if (input.equalsIgnoreCase("ben kenobi") && obi.isStudent)
                accessGranted = obi.isStudentCheck();

            if (accessGranted) {
                System.out.println("Access Granted");

                if (input.equalsIgnoreCase(luke.name)) {
                    luke.gradeCheck();
                } else if (input.equalsIgnoreCase(anakin.name)) {
                    anakin.gradeCheck();
                } else {
                    System.out.println("Invalid input. Exiting the program.");
                }
            } else {
                System.out.println("Access Denied");
            }
        }
    }
}
