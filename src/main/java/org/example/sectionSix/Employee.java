package org.example.sectionSix;

public class Employee extends Person {

    public Employee(String name) {
        super(name);
    }

    public String work() {
        return "Filling out TPS reports";
    }


    public static void main(String[] args) {
        Employee john = new Employee("John");
        john.sayHello();
        System.out.println(john.name);
    }
}
