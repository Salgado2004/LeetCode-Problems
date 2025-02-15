package interview;

import java.util.Arrays;

public class Problem27 {
    public static void main(String[] args) {
        int[] nums = new int[0];
        int val = 0;

        Problem27 solution = new Problem27();
        int k = solution.removeElement(nums, val);
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

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int k = nums.length;
        for (int i = 0; i < nums.length; i++ ){
            if (nums[i] == val) {
                k--;
                nums[i] = Integer.MAX_VALUE / 2;
            }
        }

        quickSort(nums, 0, nums.length - 1);

        return k;
    }
}
