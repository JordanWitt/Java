package org.example.sectionFive;

public class Arrays {

    public static void main(String[] args) {

        final int NUMBER_OF_BEATLES = 4;
        BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];

        theBeatles[0] = new BandMember("John Lennon", "Guitar");
        theBeatles[1] = new BandMember("Paul McCartney", "Bass");
        theBeatles[2] = new BandMember("George Harrison", "Guitar");
        theBeatles[3] = new BandMember("Ringo Starr", "Drums");

        System.out.println(java.util.Arrays.toString(theBeatles));
        System.out.println(theBeatles[2]);

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers[0]); // 1
        System.out.println(numbers[1]); // 2
        System.out.println(numbers[2]); // 0 -- default value
        //System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException !!!

        //iteration
        String[] languages = {"html", "css", "javascript", "java"};

        for (String language : languages) {
            System.out.println(language);
        }
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // access the first element in the second row
        System.out.println(matrix[1][0]); // 4
        // the last element in the first row
        System.out.println(matrix[0][2]); // 3
        // the first element in the last row
        System.out.println(matrix[2][0]); // 7

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");
    }
}
