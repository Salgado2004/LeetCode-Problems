package daily;

import java.util.Arrays;
import java.util.LinkedList;

public class Problem1079 {

    public static void main(String[] args) {
        String tiles = "AAABBC";

        Problem1079 solution = new Problem1079();
        int possibilities = solution.numTilePossibilities(tiles);
        System.out.println(possibilities);
    }

    public int numTilePossibilities(String tiles) {
        int possibilities = 0;
        int[] chars = tiles.toUpperCase().chars().toArray();
        int[] reps = new int[26];

        for (int c : chars){
            reps[c-65]++;
        }

        reps = Arrays.stream(reps).filter(value -> value > 0).toArray();

        possibilities = backtrack(reps, new LinkedList<>(), possibilities);

        return possibilities;
    }

    private int backtrack(int[] reps, LinkedList<Integer> list, int possibilities) {
        if (reps.length == 0) {
            int total = list.stream().reduce(0, Integer::sum);
            int[] array = list.stream().mapToInt(Integer::intValue).toArray();
            if (total == 0) return possibilities;
            int sum = permutacao(total, array);
            possibilities += sum;
            return possibilities;
        }

        int[] newReps = Arrays.copyOf(reps, reps.length - 1);
        int tile = reps[reps.length - 1];
        for (int i = 0; i <= tile; i++) {
            list.addFirst(i);
            possibilities = backtrack(newReps, list, possibilities);
            list.removeFirst();
        }
        return possibilities;
    }

    public int permutacao(int total, int[] reps){
        int base = Arrays.stream(reps).reduce(1, (acc, num) -> acc * factorial(num));
        return factorial(total) / base;
    }

    public int factorial(int i){
        if (i == 0) return 1;
        return i * factorial(i-1);
    }
}
