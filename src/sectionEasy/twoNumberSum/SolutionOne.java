package sectionEasy.twoNumberSum;

public class SolutionOne {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for(int i=0; i<array.length; i++) {
            for(int j=1+1; j<array.length; j++) {
                int firstNumber = array[i];
                int secondNumber = array[j];
                if (firstNumber + secondNumber == targetSum) {
                    return new int[]{firstNumber, secondNumber};
                }
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
