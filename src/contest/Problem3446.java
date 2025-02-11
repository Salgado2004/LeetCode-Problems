package contest;

import java.util.*;

public class Problem3446 {
    public static void main(String[] args) {
        int[][] grid = {{1}};

        Problem3446 solution = new Problem3446();
        System.out.println(Arrays.deepToString(solution.sortMatrix(grid)));
    }

    public int[][] sortMatrix(int[][] grid) {
        HashMap<Integer, List<Integer>> diagonais = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (diagonais.containsKey(i - j)) {
                    List<Integer> aux = diagonais.get(i - j);
                    aux.add(grid[i][j]);
                    diagonais.put(i - j, aux);
                } else {
                    diagonais.put(i - j, new ArrayList<>(List.of(grid[i][j])));
                }
            }
        }

        for (int d : diagonais.keySet()) {
            List<Integer> aux = diagonais.get(d);
            Collections.sort(aux);
            if (d >= 0) {
                Collections.reverse(aux);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if ((i - j) <= 0) {
                    grid[i][j] = diagonais.get(i - j).get(i);
                } else {
                    grid[i][j] = diagonais.get(i - j).get(j);
                }
            }
        }

        return grid;
    }
}
