// https://leetcode.com/problems/swap-nodes-in-pairs/submissions/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode h = new ListNode(0);
        h.next = head;
        ListNode p = h;

        while (p.next != null && p.next.next != null) {
            ListNode t1 = p;
            p = p.next;
            t1.next = p.next;

            ListNode t2 = p.next.next;
            p.next.next = p;
            p.next = t2;
        }
        return h.next;
    }
}