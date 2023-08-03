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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null ;
        }
        return constructBST(nums, 0, nums.length - 1);
    }
    public TreeNode constructBST(int nums[], int i, int j){
        if(i > j){
            return null ;
        }
        int m = i + (j - i)/2 ;
        TreeNode n = new TreeNode(nums[m]) ;
        n.left = constructBST(nums, i, m - 1);
        n.right = constructBST(nums, m + 1, j);
        return n ;
        
    }
}