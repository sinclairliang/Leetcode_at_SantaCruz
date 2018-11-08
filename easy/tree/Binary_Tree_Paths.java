import java.util.ArrayList;

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root != null)
        {
            helper(root, "", res);
        }
    }

    private void helper(TreeNode node, String path, List<String> res)
    {
        if(node == null)
        {
            res.add(path+node.val);
        }

        if(node.left != null)
        {
            helper(node.left, path+node.val+"->" + res);
        }

        if(node.right != null)
        {
            helper(node.right, path+node.val+"->" + res);
        }
    }
}