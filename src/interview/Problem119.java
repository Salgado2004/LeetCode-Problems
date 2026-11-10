package interview;

import java.util.ArrayList;
import java.util.List;

public class Problem119 {

    public static void main(String[] args) {
        Problem119 solution = new Problem119();

        System.out.println(solution.getRow(3)); // returns [1,3,3,1]
    }

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> tree = new ArrayList<>();
        for (int n = 0; n <= rowIndex; n++){
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
        return tree.get(tree.size()-1);
    }
}
