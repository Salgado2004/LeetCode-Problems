package interview;

import java.util.Arrays;

public class Problem1732 {
    public static void main(String[] args) {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};

        Problem1732 solution = new Problem1732();
        System.out.println(solution.largestAltitude(gain));
    }

    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];

        for (int i = 1; i < altitudes.length; i++) {
            altitudes[i] = altitudes[i - 1] + gain[i - 1];
        }

        return Arrays.stream(altitudes).max().getAsInt();
    }
}
