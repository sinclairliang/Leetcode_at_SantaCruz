/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        // my approach is to construct a hashmap that maps nodes from original list nd the new list;
        // then iterate the array twic
        // once to copy the nodes, second time to copy random pointers
    
        if(head == null)
        {
            return null;
        }
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode new_head = new RandomListNode(head.label);
        
        RandomListNode p = head;
        RandomListNode q = new_head;
        
        map.put(head, new_head);
        
        p = p.next;
        while(p != null)
        {
            RandomListNode temp = new RandomListNode(p.label);
            map.put(p, temp);
            q.next = temp;
            q = temp;
            p = p.next;
        }
        // Now we have all the nodes,

        p = head;
        q = new_head;
        
        // we still need random pointers
        while(p!=null)
        {
            if(p.random != null)
            {
                q.random = map.get(p.random);
            }
            else
            {
                q.random = null;
            }
            q = q.next;
            p = p.next;
        }
        return new_head;
    }
}