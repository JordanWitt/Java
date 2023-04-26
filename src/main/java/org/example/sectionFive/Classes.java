package org.example.sectionFive;

import java.util.Scanner;

public class Classes {

    static class Student{
    public double grade;
    public String name;
    boolean isStudent;

    public Student(String studentName, double studentGrade, boolean isStudent){
        this.grade = studentGrade;
        this.name = studentName;
        this.isStudent = isStudent;
    }
    public String gradeAverageCheck(){
        if(grade == 92 || grade == 100)
            System.out.println("You received an A");
        else if (grade == 80 || grade == 91)
            System.out.println("You received a B");
        else if (grade == 71 || grade == 79)
            System.out.println("You received a C");
        else if (grade == 60 || grade == 70)
            System.out.println("You received a D");
        else
            System.out.println("You received an F");
        return null;
    }
    public boolean isStudentCheck(){
        if (isStudent) {
            System.out.println("Access Granted");
            return true;
        } else {
            System.out.println("Access Denied");
            return false;
        }
    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student luke    = new Student("Luke Skywalker", 93.4, true);
        Student anakin  = new Student("Anakin Skywalker", 68.7, true);
        Student yoda    = new Student("Yoda", 0.0, false);
        Student obi     = new Student("Ben Kenobi", 0.0, false);

            System.out.println("Welcome, Sign in to view your grade");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("luke skywalker") && luke.isStudent)
                System.out.println(luke.isStudentCheck());
            else if (input.equalsIgnoreCase("anakin skywalker") && anakin.isStudent)
                System.out.println(anakin.isStudentCheck());
            else if (input.equalsIgnoreCase("yoda") && yoda.isStudent)
                System.out.println(yoda.isStudentCheck());
            else if(input.equalsIgnoreCase("ben kenobi") && obi.isStudent)
                System.out.println(obi.isStudentCheck());
            else
                System.out.println("Sorry that name doesn't exist");
        }

    }
}
