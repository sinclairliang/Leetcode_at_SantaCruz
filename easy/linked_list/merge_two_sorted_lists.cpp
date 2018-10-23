class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        
        // first check if either of the lists are null
        if (l1 == nullptr && l2 == nullptr) return nullptr;
        else if (l1 == nullptr && l2 != nullptr) return l2;
        else if (l1 != nullptr && l2 == nullptr) return l1; 
        
        // create a first node with the smaller value of the nodes.
        ListNode *new_list = new ListNode(l1->val <= l2->val ? l1->val : l2->val);
        // save a reference to the head
        ListNode *head = new_list;
        
        // move the list that had a smaller value forward one.
        if (l1->val <= l2->val) l1 = l1->next; 
        else l2 = l2->next;
        
        // keep iterating until we go off the end of one of the lists.
        while (l1 != nullptr && l2 != nullptr) {
            // create a new node with the value of whichever one was less.
            // then, move that list forward by one.
            if (l1->val <= l2->val) {
                new_list->next = new ListNode(l1->val);
                l1 = l1->next;
            } else {
                new_list->next = new ListNode(l2->val);
                l2 = l2->next;
            }
        
            new_list = new_list->next;
        }
        
        // add all remaining nodes to the end
        while (l1 != nullptr) { 
            new_list->next = new ListNode(l1->val);
            new_list = new_list->next;
            l1 = l1->next;
        }
        
        while (l2 != nullptr) {
            new_list->next = new ListNode(l2->val);
            new_list = new_list->next;
            l2 = l2->next;
        }
        
        // return the head that we saved earlier
        return head;
    }
};