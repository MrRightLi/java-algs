package com.mrrightli.algocasts;

/**
 * @Author: lizheng
 * @Date: 2019/12/30 2:28 下午
 */

/**
 * 这个题目说的是，给你一个单链表，你要返回它正中间的节点。如果链表节点数量是偶数个，这个时候正中间有两个节点，你要返回它们中第二个节点。
 *
 * 比如说，给你的单链表是：
 *
 * 0 -> 1 -> 2 -> 4 -> 8
 *
 * 你要返回的正中间节点是 2。如果给你的链表有偶数个节点，比如：
 *
 * 0 -> 1 -> 2 -> 4
 *
 * 正中间的节点是 1 和 2，你要返回它们中第二个节点，也就是节点 2。
 */
public class SearchListMiddle {

    // Time: O(n), Spece: O(1)
    public ListNode getMiddleNodeTwoPass(ListNode head) {
        ListNode p = head;
        int length = 0;
        for (; p != null; p = p.next) ++length;
        p = head;
        for (int i = 0; i < length/2; i++) p = p.next;

        return p;
    }

    // Time: O(n), Space: O(1)
    public ListNode getMiddleNodeOnePass(ListNode head) {
        ListNode fast = head; ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
