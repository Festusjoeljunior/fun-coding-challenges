package sectionEasy.twoNumberSum;

import java.util.Arrays;

public class SolutionThree {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int firstPointer = 0;
        int secondPointer = array.length-1;

        while (firstPointer < secondPointer) {
            int currentSum = array[firstPointer] + array[secondPointer];
            if (currentSum == targetSum) {
                return new int[]{array[firstPointer], array[secondPointer]};
            } else if (currentSum < targetSum) {
                firstPointer++;
            } else {
                secondPointer--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = {3,5,-4,8,11,1,-1,6};
        int target = 10;
        int[] result = twoNumberSum(array, target);

        if (result.length == 0) {
            System.out.println("No two numbers sum up to the target sum.");
        } else {
            System.out.println("Numbers found: " + result[0] + ", " + result[1]);
        }
    }
}
