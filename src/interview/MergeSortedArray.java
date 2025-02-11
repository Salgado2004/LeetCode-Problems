package interview;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        MergeSortedArray solution = new MergeSortedArray();
        solution.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public int[] bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        return vetor;
    }

    public int[] insertionSort(int[] vetor) {
        int aux, i = 0, j = 1;

        while (j < vetor.length) {
            aux = vetor[j];
            i = j - 1;
            while ((i >= 0) && (vetor[i] > aux)) {
                vetor[i + 1] = vetor[i];
                i--;
            }
            vetor[i + 1] = aux;
            j++;
        }

        return vetor;
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

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }

        quickSort(nums1, 0, nums1.length - 1);
    }
}
