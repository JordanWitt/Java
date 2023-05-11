package org.example.sectionSix;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public String work() {
        return "Managing employees";
    }

    static class PolymorphismDemo {
        public static void doWork(Employee e) {
            System.out.println(e.work());
        }

        public static void main(String[] args) {
            Employee one = new Employee("Jordan");
            Employee two = new Manager("Judi");

            doWork(one); // "Filling out TPS reports"
            doWork(two); // "Managing employees
        }
    }
}
