package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int k = 0, i = 0, j = 0;
        int[] arr = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else if (left[i] > right[j]) {
                arr[k++] = right[j++];
            } else if (left[i++] == right[j++]) {}
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return Arrays.copyOf(arr, k);
    }
}
