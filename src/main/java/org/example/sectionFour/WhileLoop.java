package org.example.sectionFour;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15){
            System.out.println(i++);
        }
        System.out.println("----------NEXT------------");
        int num = 0;
        do{
            System.out.println(num);
            num += 2;
        }while (100 >= num);
        System.out.println("----------NEXT------------");
        int nums = 100;
        // Do-while loop
        do {
            System.out.println(nums);
            nums -= 5;
        } while (nums >= -10);
    }
}
