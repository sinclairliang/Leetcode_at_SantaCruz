class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode *prev = nullptr;
        while (head != nullptr) {
            ListNode *x = head;
            head = head->next;
            x->next = prev;
            prev = x;
        }
        
        return prev;
    }
};