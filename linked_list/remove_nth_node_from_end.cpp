class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if (head == nullptr) return head;
        else if (head->next == nullptr) { delete head; return nullptr; }
        
        ListNode *node = head;
        ListNode *h = head;
        ListNode *prev = head;
        
        for (int i = 0; i < n; ++i) {
            if (node == nullptr) { return head; }
            node = node->next;
        }
        
        if (node == nullptr) {
            ListNode *a = head->next;
            delete head;
            return a;
        }
        
        while (node != nullptr) {
            node = node->next;
            prev = h;
            h = h->next;
        }
        
        prev->next = h->next;
        h->next = nullptr;
        delete h;
        h = nullptr;
        
        return head;
    }
};