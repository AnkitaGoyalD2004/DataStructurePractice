package Tress;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

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

public class ReverseLevelOrder {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		// If root is null, return result
		if (root == null)
			return result;
		// Declare stack and queue
		Stack<List<Integer>> st = new Stack<>();
		Queue<TreeNode> qu = new LinkedList<>();
		qu.add(root);
		// While queue is not empty
		while (!qu.isEmpty()) {
			int len = qu.size();
			// Store each level values in a list
			List<Integer> level = new ArrayList<>();
			for (int i = 0; i < len; i++) {
				TreeNode temp = qu.poll();
				level.add(temp.val);
				if (temp.left != null) {
					qu.add(temp.left);
				}
				if (temp.right != null) {
					qu.add(temp.right);
				}
			}
			// Push in a stack
			st.push(level);
		}
		// Traverse a stack
		while (!st.isEmpty()) {
			result.add(st.pop());
		}
		return result;
	}
}
