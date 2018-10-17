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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //recursively?

        List<List<Integer>> ans = new LinkedList<List<Integer>>(); 
        List<Integer> curr_level; 
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null){
            return ans; 
        }
        q.add(root);
        
        TreeNode top; 
        while(!q.isEmpty() ){
            int size = q.size();
            curr_level = new LinkedList<Integer>();

            for(int i = 0 ; i < size; i++){
                //ss
                top = q.element();
                q.remove(); //pop 
                if(top.left != null){
                    q.add(top.left);
                }
                if(top.right != null){
                    q.add(top.right);
                }
                curr_level.add(top.val); //dequeue push elements into a deque from the back

            }
             ans.add(curr_level); //dequeu
        }
                    return ans; 

    }
   
    
}
