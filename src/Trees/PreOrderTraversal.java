package Tress;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
public class PreOrderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		if(root == null) return ans;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			root = stack.pop();
			ans.add(root.val);
			if(root.right !=null) stack.push(root.right);
			if(root.left !=null) stack.push(root.left);
		}
		return ans;
	}
}
