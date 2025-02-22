package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Problem49 solution = new Problem49();
        System.out.println(solution.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            String key = Arrays.toString(str.chars().sorted().toArray());
            if (anagrams.containsKey(key)) {
                anagrams.get(key).add(str);
            } else {
                anagrams.put(key, new ArrayList<>(List.of(str)));
            }
        }

        return anagrams.values().stream().toList();
    }
}
