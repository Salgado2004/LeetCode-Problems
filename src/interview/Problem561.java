package interview;

import java.util.Arrays;

public class Problem561 {
    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};

        Problem561 solution = new Problem561();
        System.out.println(solution.arrayPairSum(nums));
    }

    public int arrayPairSum(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        int[] pairs = new int[nums.length / 2];

        int aux = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                aux = nums[i];
            } else {
                aux = Math.min(nums[i], aux);
                pairs[index] = aux;
                index++;
            }
        }

        return Arrays.stream(pairs).sum();
    }
}
