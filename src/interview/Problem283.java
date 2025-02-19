package interview;

import java.util.Arrays;

public class Problem283 {
    public static void main(String[] args) {
        int[] nums = {1, 0};

        Problem283 solution = new Problem283();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;
        int zeros = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                zeros++;
                continue;
            }
            nums[i-zeros] = nums[i];
            if (zeros > 0)
                nums[i] = 0;
        }
    }
}
