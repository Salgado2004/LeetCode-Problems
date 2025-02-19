package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Problem1207 {
    public static void main(String[] args) {
        int[] arr = {1, 2};

        Problem1207 solution = new Problem1207();
        System.out.println(solution.uniqueOccurrences(arr));
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> ocurrences = new HashMap<>();
        HashSet<Integer> uniqueValues = new HashSet<>(Arrays.stream(arr).boxed().toList());

        for (int i : arr) {
            if (!ocurrences.containsKey(i)) {
                ocurrences.put(i, 1);
            } else {
                int v = ocurrences.get(i);
                ocurrences.put(i, ++v);
            }
        }

        HashSet<Integer> uniqueOcurrences = new HashSet<>(ocurrences.values().stream().toList());

        return uniqueOcurrences.size() == uniqueValues.size();
    }
}
