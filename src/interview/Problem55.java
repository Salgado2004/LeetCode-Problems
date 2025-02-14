package interview;

public class Problem55 {
    public static void main(String[] args) {
        int[] nums = {3, 0, 8, 1, 1, 2, 0, 0, 1};

        Problem55 solution = new Problem55();
        System.out.println(solution.canJump(nums));
    }

    public boolean canJump(int[] nums) {
        int reach = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > reach) break;
            reach = Math.max(reach, i + nums[i]);
        }

        return (reach >= nums.length - 1);
    }
}
