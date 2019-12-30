package com.mrrightli.test;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        Comparable[] a = {28, 29, 30, 34, 36, 60, 1, 3, 6, 7, 8, 9, 12}; // 12
        com.mrrightli.algs.Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
