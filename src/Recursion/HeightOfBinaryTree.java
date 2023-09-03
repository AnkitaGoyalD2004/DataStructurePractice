package Recursion;
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
public class HeightOfBinaryTree {
    public static int height(TreeNode root ){
        if(root == null){
            return 0;
        }
        int lH = height(root.left);
        int rH = height(root.right);
         int ans = Math.max(lH,rH);
         return ans+1;
    }
}
