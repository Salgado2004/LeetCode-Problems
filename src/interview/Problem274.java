package interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem274 {
    public static void main(String[] args) {
        int[] citations = {100};

        Problem274 solution = new Problem274();
        System.out.println(solution.hIndex(citations));
    }

    public int hIndex(int[] citations) {
        int h = 0;
        HashMap<Integer, Integer> aux = new HashMap<>();

        for (int citation : citations) {
            int c = citation;
            while (c >= 0) {
                if (aux.containsKey(c)) {
                    aux.put(c, aux.get(c) + 1);
                } else {
                    aux.put(c, 1);
                }
                c--;
            }
        }

        List<Map.Entry<Integer, Integer>> aux2 = aux.entrySet().stream().toList();
        for (int i = aux2.size()-1; i >= 0; i--){
            if (aux2.get(i).getValue() <= aux2.get(i).getKey()) {
                h = Math.max(aux2.get(i).getValue(), h);
            } else {
                h = Math.max(aux2.get(i).getKey(), h);
            }
        }

        System.out.println(aux);

        return h;
    }
}
