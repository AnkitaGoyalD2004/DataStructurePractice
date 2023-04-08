package Tress;
 class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,targetSum,0);
    }
    boolean ans;
    public boolean helper(TreeNode root, int i, int currSum){
        if(root == null){
            return false;
        }
        currSum+=root.val;
        if(currSum == i && (root.left == null && root.right == null)){
            return true;
        }
        boolean ans1 = helper(root.left,i,currSum);
        boolean ans2 = helper(root.right, i, currSum);
        ans = ans1||ans2 ;
        return ans;
    }
}
