/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    private int carry_over = 0; // used as a global  variable;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (carry_over == 0) {
            if (l1 == null)
                return l2;
            if (l2 == null)
                return l1;
            l1.val += l2.val;
        } else {
            if (l1 == null && l2 == null)
                return new ListNode(carry_over);
            else if (l1 == null) {
                l1 = new ListNode(0);
            } else if (l2 == null) {
                l2 = new ListNode(0);
            }

            l1.val = l1.val + l2.val + carry_over;
            carry_over--;
        }

        if (l1.val >= 10) {
            l1.val %= 10;
            carry_over++;
        }
        l1.next = addTwoNumbers(l1.next, l2.next);
        return l1;
    }
}