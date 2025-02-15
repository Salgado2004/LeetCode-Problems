package interview;

import java.util.Arrays;
import java.util.HashMap;

public class Problem80 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 0, 0, 0, 3, 3};

        Problem80 solution = new Problem80();
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
        HashMap<Integer, Integer> duplicate = new HashMap<>();
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (!duplicate.containsKey(nums[i])){
                duplicate.put(nums[i], 0);
            }
            duplicate.compute(nums[i], (key, v) -> v + 1);
            if (duplicate.get(nums[i]) > 2) {
                k--;
                nums[i] = Integer.MAX_VALUE / 2;
            }
        }

        quickSort(nums, 0, nums.length - 1);

        return k;
    }
}
