package org.example.sectionOne;

import java.util.Arrays;

public class MultiDemensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = { { 1, 2, 3 }, { 4,5,6 }, { 7,8,9 } };
        System.out.println(Arrays.deepToString(numbers));
        //deepToString used for printing multi=demensional arrays
    }
}
