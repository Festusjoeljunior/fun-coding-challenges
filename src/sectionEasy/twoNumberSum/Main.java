package sectionEasy.twoNumberSum;


import java.util.Hashtable;

class Main {

    // O(n^2) time | O(1) space
//    public static int[] twoNumberSum(int[] array, int targetSum) {
//        for (int i=0; i<array.length; i++) {
//            for(int j=i+1; j<array.length; j++) {
//                int firstNumber = array[i];
//                int secondNumber = array[j];
//                if (firstNumber + secondNumber == targetSum) {
//                    return new int[]{firstNumber, secondNumber};
//                }
//            }
//        }
//        return new int[0];
//    }

    // O(n) time | O(n) space
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

    // O(nlog(n)) time | O(1) space
//    public static int[] twoNumberSum(int[] array, int targetSum) {
//        Arrays.sort(array);
//        int leftPointer = 0;
//        int rightPointer = array.length -1;
//
//        while (leftPointer < rightPointer) {
//            int currentSum = array[leftPointer] + array[rightPointer];
//
//            if (currentSum == targetSum) {
//                return new int[]{array[leftPointer], array[rightPointer]};
//            } else if (currentSum < targetSum) {
//                leftPointer++;
//            } else {
//                rightPointer--;
//            }
//        }
//        return new int[0];
//    }

}
