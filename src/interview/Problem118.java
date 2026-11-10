package interview;

import java.util.ArrayList;
import java.util.List;

public class Problem118 {

    public static void main(String[] args) {
        Problem118 solution = new Problem118();

        System.out.println(solution.generate(5)); // returns [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tree = new ArrayList<>();
        for (int n = 0; n < numRows; n++){
            List<Integer> row = new ArrayList<>();
            for (int p = 0; p < n+1; p++){
                if (p == 0 || p == n){
                    row.add(1);
                } else {
                    List<Integer> upper = tree.get(n-1);
                    row.add(upper.get(p-1)+upper.get(p));
                }
            }
            tree.add(row);
        }
        return tree;
    }
}
