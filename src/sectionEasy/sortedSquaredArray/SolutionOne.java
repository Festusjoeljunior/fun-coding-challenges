package sectionEasy.sortedSquaredArray;

import java.util.Arrays;

public class SolutionOne {

    // O(nlogn) time (due to having to sort the output array) , O(n) space - due to having to create a new output array

    public static int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];
        for(int i=0; i<array.length; i++) {
            int value = array[i] * array[i];
            result[i] = value;
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 8, 9};

        int[] sortedArray = sortedSquaredArray(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
