package sectionEasy.sortedSquaredArray;

import java.util.Arrays;

public class SolutionTwo {

    // O(n) time (due to having to sort the output array) , O(n) space - due to having to create a new output array
    public static int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];
        int leftIndex = 0;
        int rightIndex = array.length-1;

        for(int i=array.length-1; i>=0; i--) {
            int leftSquared = array[leftIndex] * array[leftIndex];
            int rightSquared = array[rightIndex] * array[rightIndex];

            if (leftSquared > rightSquared) {
                result[i] = leftSquared;
                leftIndex++;
            } else {
                result[i] = rightSquared;
                rightIndex--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 8, 9};

        int[] sortedArray = sortedSquaredArray(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
