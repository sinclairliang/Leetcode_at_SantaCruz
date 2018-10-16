class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        if (root == nullptr) return true;
        
        TreeNode *l = root;
        TreeNode *r = root;
        
        return isSym(l, r);

    }
    
    bool isSym(TreeNode *l, TreeNode *r) {
        // check if both are null
        if (!l || !r)
            return l == r; 
        if (l->val != r->val) 
            return false;
        else
            return isSym(l->left, r->right) && isSym(l->right, r->left);
    }
};