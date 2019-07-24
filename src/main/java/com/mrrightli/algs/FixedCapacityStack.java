package com.mrrightli.algs;

/**
 * 定容栈
 *
 * @param <Item>
 */
public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;

    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }


    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        // 将元素压栈
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() {
        if (N == 0) return null;
        Item item = a[--N];
        a[N] = null; // 避免对象游离(保留一个不需要的对象的引用)
        // 栈永远不会溢出,使用率也永远不会低于四分之一,除非栈为空
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }

}
