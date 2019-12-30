package com.mrrightli.test;


import com.mrrightli.algs.*;

public class Main {
    public static void main(String[] args) {
        FixedCapacityStack<Integer> stack = new FixedCapacityStack<Integer>(10);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }

//        String[] s = {"to", "be", "or"};

        Comparable[] a = {28, 29, 30, 34, 36, 60, 1, 3, 6, 7, 8, 9, 12}; // 12
        MaxPQ<Comparable> maxPQ = new MaxPQ<>(a);
        System.out.println(maxPQ.delMax());
    }
}
