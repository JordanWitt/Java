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

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers[0]); // 1
        System.out.println(numbers[1]); // 2
        System.out.println(numbers[2]); // 0 -- default value
        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException !!!


    }
}
