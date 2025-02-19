package daily;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem1415 {
    public static void main(String[] args) {
        int n = 3, k = 9;

        Problem1415 solution = new Problem1415();
        System.out.println(solution.getHappyString(n, k));
    }

    public String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        generateHappyStrings(happyStrings, "", n);
        happyStrings.sort(Comparator.naturalOrder());

        if (happyStrings.size() >= k){
            return happyStrings.get(k-1);
        }

        return "";
    }

    private void generateHappyStrings(List<String> happyStrings, String happy,int n){

        if (happy.length() == n){
            happyStrings.add(happy);
            return;
        }

        for (char ch : List.of('a', 'b', 'c')) {
            if (!happy.isEmpty() && happy.charAt(happy.length() - 1) == ch) continue;
            generateHappyStrings(happyStrings, happy + ch, n);
        }
    }
}
