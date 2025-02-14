package interview;

import java.util.*;

public class Problem45 {
    public static void main(String[] args) {
        int[] nums = {3, 0, 8, 1, 1, 2, 0, 0, 1};

        Problem45 solution = new Problem45();
        System.out.println(solution.jump(nums));
    }

    public int jump(int[] nums) {
        int jumps = 0, step = 0, reach = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            reach = Math.max(reach, i + nums[i]);
            if (i == step) {
                jumps++;
                step = reach;
            }
        }
        return jumps;
    }
}
