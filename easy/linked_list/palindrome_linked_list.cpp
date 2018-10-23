class Solution {
public:
    bool isPalindrome(ListNode* head) {
        
        if (head == nullptr) return true;
        else if (head->next == nullptr) return true;
        
        ListNode *cur = head;
        return tailRecur(head, cur);
    }
    
    bool tailRecur(ListNode *head, ListNode *&cur) {
        if (not head) return true;
        if (not tailRecur(head->next, cur)) return false;
        if (cur->val != head->val) return false;
        else { cur = cur->next; return true;}
    }
};