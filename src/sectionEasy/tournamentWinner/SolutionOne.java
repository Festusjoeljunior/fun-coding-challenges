package sectionEasy.tournamentWinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SolutionOne {

    // O(n) time when n is the number of competitions, O(k) space where k is the number of teams in the scores hashtable
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> teamScores = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> competition = competitions.get(i);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            String winner = results.get(i) == 0 ? awayTeam : homeTeam;

            teamScores.put(winner, teamScores.getOrDefault(winner, 0) + 3);
        }

        String winner = "";
        int maxScore = 0;

        for (Map.Entry<String, Integer> entry : teamScores.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner;
    }

    public static void main(String[] args) {
        SolutionOne solution = new SolutionOne();

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> pair1 = new ArrayList<>();
        pair1.add("HTML");
        pair1.add("C#");
        ArrayList<String> pair2 = new ArrayList<>();
        pair2.add("C#");
        pair2.add("Python");
        ArrayList<String> pair3 = new ArrayList<>();
        pair3.add("Python");
        pair3.add("HTML");

        competitions.add(pair1);
        competitions.add(pair2);
        competitions.add(pair3);

        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);

        String winner = solution.tournamentWinner(competitions, results);
        System.out.println("Tournament Winner: " + winner);
    }
}
