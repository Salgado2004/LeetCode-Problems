package interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem228 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};

        Problem228 solution = new Problem228();
        System.out.println(solution.summaryRanges(nums));
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        LinkedList<Integer> aux = new LinkedList<>();

        for (int i : nums) {
            if (!aux.isEmpty() && i != aux.peekLast() + 1) {
                if (aux.size() == 1) {
                    ranges.add(String.valueOf(aux.peek()));
                } else {
                    ranges.add(String.format("%s->%s", aux.peekFirst(), aux.peekLast()));
                }
                aux.clear();
            }
            aux.add(i);
        }
        if (!aux.isEmpty()) {
            if (aux.size() == 1) {
                ranges.add(String.valueOf(aux.peek()));
            } else {
                ranges.add(String.format("%s->%s", aux.peekFirst(), aux.peekLast()));
            }
        }
        return ranges;
    }
}
