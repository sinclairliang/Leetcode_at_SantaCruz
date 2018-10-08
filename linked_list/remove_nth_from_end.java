/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // using two pointer (runner) technique;
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!= null)
        {
            // maintaining the gap to be n;
            // let fast reach the end of the linked list;
            // slow will be the one we want to delete;
            if(n < 0)
            {
                slow = slow.next;
            }
            n--;
            // now fast is n nodes ahead of slow;
            fast = fast.next;
        }
        
        if(n<0)
        {
            // in this case, we actually minused n; 
            slow.next = slow.next.next;
        }
        else
        {
            // otherwise, we just remove the first node;
            head = head.next;
        }
        return head;
    }
}