package org.example.sectionFive;

import java.util.Arrays;

public class ArraysExercises {
    public static class Person{
        private String name;
        private  int age;

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
        public String toString(){
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
        for(String p : person) {
            System.out.println(p);
        }
    }
}
