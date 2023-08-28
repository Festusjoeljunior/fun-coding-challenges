package sectionEasy.twoNumberSum;

import java.util.Arrays;

public class SolutionThree {

    // O(nlog(n)) time | O(1) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int leftPointer = 0;
        int rightPointer = array.length -1;
        while (leftPointer < rightPointer) {
            int currentSum = array[leftPointer] + array[rightPointer];
            if (currentSum == targetSum) {
                return new int[] {array[leftPointer], array[rightPointer]};
            } else if (currentSum < targetSum) {
                leftPointer++;
            } else {
                rightPointer--;
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
