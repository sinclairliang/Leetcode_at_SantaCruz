class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        if (root == nullptr) return {};
        
        queue<TreeNode*> q;
        vector<int> curr_level;
        vector<vector<int>> result;
        
        q.push(root);
        
        while (!q.empty()) {
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                auto top = q.front();
                q.pop();
                if (top->left) q.push(top->left);
                if (top->right) q.push(top->right);
                curr_level.push_back(top->val);
            }
            result.push_back(curr_level);
            curr_level.clear();
        }
        
        return result;
    }
};