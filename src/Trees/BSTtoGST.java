package Tress;

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

public class BSTtoGST {

	int sum = 0;

	public TreeNode bstToGst(TreeNode root) {
		if (root == null)
			return null;
		// The right subtree of a node contains only nodes with keys greater than the
		// node's key.
		bstToGst(root.right);
		// update sum value
		sum += root.val;
		// update root value
		root.val = sum;
		bstToGst(root.left);
		return root;
	}
}
