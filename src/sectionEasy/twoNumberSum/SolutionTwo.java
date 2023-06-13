package sectionEasy.twoNumberSum;

import java.util.Hashtable;

public class SolutionTwo {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Hashtable<Integer, Integer> numbers = new Hashtable<>();
        for(int i=0; i<array.length; i++) {
            int complement = targetSum - array[i];
            if (numbers.containsKey(complement)) {
                return new int[]{complement, array[i]};
            }
            numbers.put(array[i], i);
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
