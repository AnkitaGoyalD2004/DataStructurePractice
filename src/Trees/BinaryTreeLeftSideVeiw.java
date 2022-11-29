package Tress;

import java.util.ArrayList;

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTreeLeftSideVeiw {

	ArrayList<Integer> leftView(Node root) {
		// Your code here
		ArrayList<Integer> ans = new ArrayList<Integer>();
		traversal(ans, 0, root);
		return (ans);
	}

	void traversal(ArrayList<Integer> list, int level, Node root) {
		if (root == null) {
			return;
		}
		if (list.size() == level) {
			list.add(root.data);
		}
		traversal(list, level + 1, root.left);
		traversal(list, level + 1, root.right);
	}
}
