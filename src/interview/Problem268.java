package interview;

public class Problem268 {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        Problem268 solution = new Problem268();
        System.out.println(solution.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n * (n + 1)) / 2;
        int soma = 0;

        for (int num : nums) {
            soma += num;
        }

        return total - soma;
    }
}
