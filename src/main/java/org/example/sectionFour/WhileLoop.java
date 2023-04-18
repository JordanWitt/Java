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

        System.out.println("----------NEXT------------");
        for(int j = 1; j <= 10; j++) { // <--+
            if(j % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(j);
        }

        System.out.println("----------NEXT------------");
        int n = 2; // starting number
        int limit = 1000000; // limit for number

        do {
            int square = n * n; // calculate square
            System.out.println(square); // display square
            n = square; // update num with square value
        } while (n > 0 && n < limit); // repeat until num is less than limit

    }
}
