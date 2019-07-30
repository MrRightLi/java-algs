package com.mrrightli.test;


import java.util.Arrays;

/**
 * 插入排序（英语：Insertion Sort）
 * 是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序在实现上，通常采用in-place排序（即只需用到 {\displaystyle O(1)} {\displaystyle O(1)}的额外空间的排序），因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 */
public class InsertionSort {

    public static void main(String[] args) {

        Comparable[] a = {93,4,6,2,8,7,9,3,5};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertionSort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && a[j].compareTo(a[j-1]) > 0; j--) {
                Comparable temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
    }

}
