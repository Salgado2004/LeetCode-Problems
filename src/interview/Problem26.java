package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        Problem26 solution = new Problem26();
        int k = solution.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

    public void quickSort(int[] vetor, int inicio, int fim) {
        int pivo, aux, i, j, meio;
        i = inicio;
        j = fim;
        meio = (i + j) / 2;
        pivo = vetor[meio];
        do {
            while (vetor[i] < pivo) i++;
            while (vetor[j] > pivo) j--;
            if (i <= j) {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                i++;
                j--;
            }
        } while (j > i);
        if (inicio < j) quickSort(vetor, inicio, j);
        if (i < fim) quickSort(vetor, i, fim);
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        List<Integer> unique = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!unique.contains(nums[i])) {
                unique.add(nums[i]);
            } else {
                nums[i] = Integer.MAX_VALUE / 2;
            }
        }

        quickSort(nums, 0, nums.length - 1);

        return unique.size();
    }
}
