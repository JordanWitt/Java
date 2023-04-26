package org.example.sectionFive;

import java.util.Scanner;

public class Classes {

    static class Student {
        public double grade;
        public String name;
        boolean isStudent;

        public Student(String studentName, double studentGrade, boolean isStudent) {
            this.grade = studentGrade;
            this.name = studentName;
            this.isStudent = isStudent;
        }

        public void gradeAverageCheck() {
            if (grade == 92 || grade == 100)
                System.out.println("You received an A");
            else if (grade == 80 || grade == 91)
                System.out.println("You received a B");
            else if (grade == 70 || grade == 79)
                System.out.println("You received a C");
            else if (grade == 60 || grade == 69)
                System.out.println("You received a D");
            else
                System.out.println("You received an F");
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

                System.out.println("Would you like to view your grade? (Y/N)");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("Y")) {
                    if (luke.isStudent && luke.name.equalsIgnoreCase("luke skywalker"))
                        luke.gradeAverageCheck();
                    else if (anakin.isStudent && anakin.name.equalsIgnoreCase("anakin skywalker"))
                        anakin.gradeAverageCheck();
                }
            } else {
                System.out.println("Access Denied");
            }
        }
    }
}
