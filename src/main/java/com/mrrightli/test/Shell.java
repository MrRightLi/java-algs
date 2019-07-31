package com.mrrightli.test;

import java.util.Arrays;

public class Shell {
    public static void main(String[] args) {
        Comparable[] a = {'S', 'H', 'E', 'L', 'L', 'S', 'O', 'R', 'T', 'E', 'E', 'X', 'A', 'M', 'P', 'L', 'E'}; //17
        sort(a);

        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 3;
        while (h < N / 3) h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && a[j].compareTo(a[j - h]) > 0; j -= h) {
                    Comparable temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                }
            }
            h = h / 3;
        }
    }
}
