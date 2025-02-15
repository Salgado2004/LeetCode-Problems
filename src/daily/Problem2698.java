package daily;

import java.util.List;

public class Problem2698 {
    List<Integer> validIs = List.of(1, 9, 10, 36, 45, 55, 82, 91, 99, 100, 235, 297, 369, 370, 379, 414, 657, 675, 703, 756, 792, 909, 918, 945, 964, 990, 991, 999, 1000);

    public static void main(String[] args) {
        int n = 37;

        Problem2698 solution = new Problem2698();
        System.out.println(solution.punishmentNumber(n));
    }

    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = (int) Math.pow(i, 2);
            if (validIs.contains(i)){
                sum += square;
            }
        }
        return sum;
    }

    /*public boolean isValid(String aux, int index, int target) {
        if (index == aux.length()) return target == 0;

        int sum = 0;
        for (int i = index; i < aux.length(); i++) {
            sum = sum * 10 + Integer.parseInt(aux.substring(i, i + 1));
            if (sum > target) break;
            if (isValid(aux, i + 1, target - sum)) return true;
        }
        return false;
    }*/
}
