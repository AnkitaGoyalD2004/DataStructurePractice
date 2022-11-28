package Tress;
import java.util.List;
import java.util.ArrayList;

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

public class BinaryTreeRightSideVeiw {

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		if(root == null){
            return ans;
        }
        help(root, ans, 1);
        
        return ans;
    }
    private void help(TreeNode root, List<Integer> list, int level){
        if(root == null){
            return;
        }
        if(list.size() < level){
            list.add(root.val);
        }
        help(root.right, list, level + 1);
        help(root.left, list, level + 1);
    }
}
