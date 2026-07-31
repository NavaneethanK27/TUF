/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer>set = new TreeSet();
        dfs(root,set);
        if(set.size()<2){
            return -1;
        }
        int k=1;
        set.pollFirst();
        return set.first();
    }
    public void dfs(TreeNode root,TreeSet<Integer>set){
        if(root==null){
            return;
        }

        set.add(root.val);
    

        dfs(root.left,set);
        dfs(root.right,set);
    }
}