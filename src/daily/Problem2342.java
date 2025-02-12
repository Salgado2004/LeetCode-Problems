package daily;

import java.util.HashMap;

public class Problem2342 {
    public static void main(String[] args) {
        int[] nums = {229, 398, 269, 317, 420, 464, 491, 218, 439, 153, 482, 169, 411, 93, 147, 50, 347, 210, 251, 366, 401};

        Problem2342 solution = new Problem2342();
        System.out.println(solution.maximumSum(nums));
    }

    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        int max = -1;

        for (int num : nums) {
            int acc = 0;
            int aux = num;
            while (aux > 0) {
                acc += aux % 10;
                aux /= 10;
            }
            if (pairs.containsKey(acc)) {
                int sum = pairs.get(acc) + num;
                max = Math.max(sum, max);
                pairs.put(acc, Math.max(pairs.get(acc), num));
            } else {
                pairs.put(acc, num);
            }
        }

        return max;
    }
}
