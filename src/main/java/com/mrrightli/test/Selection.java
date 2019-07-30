package com.mrrightli.test;

import java.util.Arrays;

/**
 * 选择排序
 * 选择排序（Selection sort）是一种简单直观的排序算法。它的工作原理如下。首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 *
 * 选择排序的主要优点与数据移动有关。如果某个元素位于正确的最终位置上，则它不会被移动。选择排序每次交换一对元素，它们当中至少有一个将被移到其最终位置上，因此对 {\displaystyle n} n个元素的表进行排序总共进行至多 {\displaystyle n-1} {\displaystyle n-1}次交换。在所有的完全依靠交换去移动元素的排序方法中，选择排序属于非常好的一种。
 *
 * 选择排序,在不断的选择剩余元素中的最小者,时间效率取决于比较的次数
 */
public class Selection {
    public static void main(String[] args) {
        Comparable[] a = {93,4,6,2,4,7,9,2,5};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selectionSort(Comparable[] a) {
        int N =a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
