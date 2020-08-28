/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // use mathematical knowledge to solve this puzzle;
        if (head == null || head.next == null) {
            // checking edge cases;
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            // build on Catherine's answer: first to check if there is a cycle;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // if there is, mark flag true;
                flag = true;
                break;
            }
        }

        if (!flag) {
            // if while loop broke, flag is false,
            // means there is no cycle;
            return null;
        }

        // cool, now there is a cycle, how can I find the beginning node of that cycle?
        // look at this illustration: https://postimg.cc/TySKb2PV
        // fast and slow meet at z
        // think about the distance fast node travelled up until it meets up with slow:
        // d(fast) = a+b+c+b = a+2b+c
        // d(slow) = a+b
        // also d(fast) = 2*d(slow)
        // d(fast) = 2a+2b = a+2b+c
        // ==> a = c;
        // now I set the dummyhead to head, x;
        // let dummyhead and slow travel the same amount of distance
        // they will meet again at exact Y, the beginning of cycle;
        ListNode dummyhead = head;
        while (dummyhead != slow) {
            dummyhead = dummyhead.next;
            slow = slow.next;
        }
        return dummyhead;
    }
}