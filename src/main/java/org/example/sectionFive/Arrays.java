package org.example.sectionFive;

public class Arrays {

    public static void main(String[] args) {

        final int NUMBER_OF_BEATLES = 4;
        BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];

        theBeatles[0] = new BandMember();
        theBeatles[0].setMembers(new String[] { "John Lennon", "Guitar" });

        theBeatles[1] = new BandMember();
        theBeatles[1].setMembers(new String[] { "Paul McCartney", "Bass" });

        theBeatles[2] = new BandMember();
        theBeatles[2].setMembers(new String[] { "George Harrison", "Guitar" });

        theBeatles[3] = new BandMember();
        theBeatles[3].setMembers(new String[] { "Ringo Starr", "Drums" });

        System.out.println(java.util.Arrays.toString(theBeatles));


    }
}
