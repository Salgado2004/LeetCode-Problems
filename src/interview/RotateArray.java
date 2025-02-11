package interview;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        RotateArray solution = new RotateArray();
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        int[] aux = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            int idx = i + k;
            while (idx >= nums.length)
                idx -= nums.length;
            nums[idx] = aux[i];
        }
    }
}
