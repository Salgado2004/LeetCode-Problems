package interview;

import java.util.Arrays;
import java.util.HashMap;

public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int target = 6;

        Problem1 solution = new Problem1();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[2];
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i){
                return new int[]{i, map.get(diff)};
            }
        }

        return new int[2];
    }
}
