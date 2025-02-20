package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1980 {
    public static void main(String[] args) {
        String[] nums = {"01", "10"};

        Problem1980 solution = new Problem1980();
        System.out.println(solution.findDifferentBinaryString(nums));
    }

    public String findDifferentBinaryString(String[] nums) {
        List<String> binaries = Arrays.stream(nums).toList();
        List<String> uniqueBinaries = new ArrayList<>();
        generateBinaries(uniqueBinaries, binaries, "", nums.length);

        return uniqueBinaries.get(0);
    }

    private void generateBinaries(List<String> uniqueBinaries, List<String> binaries, String bi, int n){
        if (bi.length() == n){
            if (!binaries.contains(bi))
                uniqueBinaries.add(bi);
            return;
        }

        for (char ch : List.of('0', '1')) {
            generateBinaries(uniqueBinaries, binaries, bi + ch, n);
        }
    }
}
