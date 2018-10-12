/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) 
    {
        
        return isValidBST(root, null, null);
    }
        

    boolean isValidBST(TreeNode root, TreeNode left, TreeNode right)
    {
        // helper function;
        if(root == null)
        {
            return true;
        }
        if(left!=null && left.val >= root.val)
        {
            return false;
        }
        if(right!=null && right.val <= root.val)
        {
            return false;
        }
        return isValidBST(root.left, left, root) && isValidBST(root.right, root, right);
    }   
}