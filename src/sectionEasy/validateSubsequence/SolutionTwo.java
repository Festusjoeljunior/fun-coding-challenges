package sectionEasy.validateSubsequence;

import java.util.List;

public class SolutionTwo {

    // O(n) time | O(1) space
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int sequenceIndex = 0;
        for(int i=0;i<array.size(); i++) {
            if (sequenceIndex == sequence.size()) {
                return true;
            }
            if (sequence.get(sequenceIndex).equals(array.get(i))) {
                sequenceIndex++;
            }
        }
        return sequenceIndex == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> subsequence = List.of(1, 6, -1, 5);

        boolean isValid = isValidSubsequence(array, subsequence);
        System.out.println("Is valid subsequence? " + isValid);
    }
}
