class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        
        if (l1 == nullptr && l2 == nullptr) return nullptr;
        else if (l1 == nullptr && l2 != nullptr) return l2;
        else if (l1 != nullptr && l2 == nullptr) return l1; 
        
        ListNode *new_list = new ListNode(l1->val <= l2->val ? l1->val : l2->val);
        ListNode *head = new_list;
        
        if (l1->val <= l2->val) l1 = l1->next; 
        else l2 = l2->next;
        
        while (l1 != nullptr && l2 != nullptr) {
            if (l1->val <= l2->val) {
                new_list->next = new ListNode(l1->val);
                l1 = l1->next;
            } else {
                new_list->next = new ListNode(l2->val);
                l2 = l2->next;
            }
        
            new_list = new_list->next;
        }
        
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
        
        return head;
    }
};