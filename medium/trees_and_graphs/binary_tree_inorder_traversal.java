// Recursive (travia)
// ================================================= //
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution0 {
    List<Integer> res = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            helper(root);
        }
        return res;

    }

    public void helper(TreeNode p) {
        if (p.left != null) {
            helper(p.left);
        }
        res.add(p.val);
        if (p.right != null) {
            helper(p.right);
        }
    }

}

// Iterative by using stack
// ================================================= //
class Solution1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        if (root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;

        while (!stack.empty() || p != null) {
            if (p != null) {
                // push all the left nodes on the stack;
                stack.push(p);
                p = p.left;
            } else {
                // after that add those vals to the result ArrayList
                TreeNode t = stack.pop();
                res.add(t.val);
                // go through right nodes;
                p = t.right;
            }
        }
        return res;

    }
}