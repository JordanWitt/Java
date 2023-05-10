package org.example.sectionFive;

import java.util.Arrays;

public class ArraysExercises {
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " - " + age;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(Arrays.stream(numbers).toArray()));

        final int people = 4;
        String[] person = new String[people];
        person[0] = String.valueOf(new Person("Jordan Witt", 29));
        person[1] = String.valueOf(new Person("Jerad Witt", 33));
        person[2] = String.valueOf(new Person("Judi Witt", 54));
        person[3] = String.valueOf(new Person("Jeff Witt", 56));
        for (String p : person) {
            System.out.println(p);
        }

        Person[] persons = new Person[3];
        persons[0] = new Person("John", 3);
        persons[1] = new Person("Jane", 4);
        persons[2] = new Person("Alice", 5);

        for (Person p : persons) {
            System.out.println(p);
        }

        Person[] updatedArray = addPerson(persons, new Person("Bob", 6));

        System.out.println("Updated Array:");
        for (Person p : updatedArray) {
            System.out.println(p.getName());
        }
    }

    public static Person[] addPerson(Person[] array, Person person) {
        Person[] newArray = new Person[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = person;
        return newArray;
    }
}

