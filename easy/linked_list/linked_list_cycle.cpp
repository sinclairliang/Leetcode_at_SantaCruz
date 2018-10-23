class Solution {
public:
    bool hasCycle(ListNode *head) {
        unordered_set<ListNode*> set;
        
        while (head != nullptr) {
            if (set.find(head) != set.end()) {
                return true;
            }
            set.insert(head);
            head = head->next;
        }
        
        return false;
    }
};