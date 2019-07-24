package com.mrrightli.test;


import com.mrrightli.algs.FixedCapacityStack;

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
    }
}
