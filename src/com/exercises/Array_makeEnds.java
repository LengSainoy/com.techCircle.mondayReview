package com.exercises;

import java.util.Arrays;

public class Array_makeEnds {
    public static void main(String[] args) {
        /*
        Given an array of ints, return a new array length 2
        containing the first and last elements from the original array.
        The original array will be length 1 or more.

            makeEnds([1, 2, 3]) → [1, 3]
            makeEnds([1, 2, 3, 4]) → [1, 4]
            makeEnds([7, 4, 6, 2]) → [7, 2]
        */
        int[] numArr = {1, 2, 4, 6};
        System.out.println(Arrays.toString(makeEnds(numArr)));
    }

    private static int[] makeEnds(int[] numArr) {
        int[] expNum = new int[2];
        expNum[0] = numArr[0];
        expNum[1] = numArr[numArr.length - 1];
        return expNum;
    }
}
