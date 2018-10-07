class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        
        ListNode *a = head;
        unordered_set<ListNode*> set;
        
        while (a != nullptr) {
            if (set.find(a) != set.end()) {
                return a;
            }
            set.insert(a);
            a = a->next;
        }
        
        return nullptr;
    
    }
};