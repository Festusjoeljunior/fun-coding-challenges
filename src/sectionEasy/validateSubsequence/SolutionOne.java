package sectionEasy.validateSubsequence;

import java.util.List;

public class SolutionOne {

    // O(n) time | O(1) space
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;
        while (arrayIndex < array.size() && sequenceIndex < sequence.size()) {
            if (array.get(arrayIndex).equals(sequence.get(sequenceIndex))) {
                sequenceIndex++;
            }
            arrayIndex++;
        }
        // if the sequence index is equal to the size of the sequence list, then we have
        // traversed through the whole sequence list
        return sequenceIndex == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> subsequence = List.of(1, 6, -1, 5);

        boolean isValid = isValidSubsequence(array, subsequence);
        System.out.println("Is valid subsequence? " + isValid);
    }
}
