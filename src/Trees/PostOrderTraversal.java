package Tress;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class PostOrderTraversal {
	// Important, when you pop a node, ensure its children are traversed.

	// recursively
	public static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		if (root == null)
			return ans;
		ans.addAll(postorderTraversal(root.left));
		ans.addAll(postorderTraversal(root.right));
		ans.add(root.val);

		return ans;
	}

	// iteratively
	public static List<Integer> postorderTraversal1(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
		while (!stack.empty() || curr != null) {
			while (curr != null) {
				stack.push(curr);
				// ans.addFirst(curr.val);
				ans.add(0, curr.val);
				curr = curr.right;
			}

			TreeNode node = stack.pop();
			curr = node.left;
		}

		return ans;

	}
}