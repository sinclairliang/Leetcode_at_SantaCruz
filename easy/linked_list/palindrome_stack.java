/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        // use stack to solve the problem;
        if (head == null) {
            // special case: true if empty;
            return true;
        }

        Stack<Integer> stack = new Stack<Integer>();

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            // use runner technique to locate the middle node;
            // push the value to stack;
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            // in this case, it means there are even number of nodes;
            // we manually increment the location of the middle node;
            slow = slow.next;
        }

        while (slow != null) {
            // now  go through the second half of the linked list;
            // and compare the value one by one;
            if (slow.val != stack.pop()) {
                return false;
            }

            slow = slow.next;
        }
        return true;
    }
}