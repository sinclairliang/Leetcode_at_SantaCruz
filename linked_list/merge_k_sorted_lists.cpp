// https://leetcode.com/problems/merge-k-sorted-lists/description/

class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        if (lists.size() == 0) { return nullptr; }
        
        ListNode *new_head;
        priority_queue<int, vector<int>, greater<int>> q;
        
        for (auto& list_node : lists) {
            ListNode *head = list_node;
            while (head != nullptr) {
                q.push(head->val);
                head = head->next;
            }
        }
        
        if (q.size() == 0) return nullptr;
                
        new_head = new ListNode(q.top());
        q.pop();
        ListNode *n = new_head;
        
        while (!q.empty()) {
            n->next = new ListNode(q.top());
            q.pop();
            n = n->next;
        }
        
        return new_head;
    }
};