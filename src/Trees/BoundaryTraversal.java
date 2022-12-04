package Tress;
import java.util.ArrayList;
import java.util.Stack;
public class BoundaryTraversal {
	
	class BinaryTree {
	    Node root;
	    class Node {
	        int data;
	        Node left, right;
	        Node(int d)
	        {
	            data = d;
	            left = null;
	            right = null;
	        }
	    }
	 
		public boolean isLeaf(Node node) {
			if (node.left == null && node.right == null) {
				return true;
			}
			  return false;
	    }
	 
	    public void addLeftBound(Node root,ArrayList<Integer> ans)
	    {
	        root = root.left;
	        while (root != null) {
	            if (!isLeaf(root)) {
	                ans.add(root.data);
	            }
	 
	            if (root.left != null) {
	                root = root.left;
	            }
	            else {
	                root = root.right;
	            }
	        }
	    }
	 
	    public void addRightBound(Node root,  ArrayList<Integer> ans)
	    {
	        root = root.right;
	        // As we need the reverse of this for Anti clockwise
	        Stack<Integer> stk = new Stack<>();
	        while (root != null) {
	            if (!isLeaf(root)) {
	                stk.push(root.data);
	            }
	            if (root.right != null) {
	                root = root.right;
	            }
	            else {
	                root = root.left;
	            }
	        }
	 
	        while (!stk.isEmpty()) {
	            ans.add(stk.peek());
	            stk.pop();
	        }
	    }
	 
	    // its kind of In order
	    public void addLeaves(Node root,
	                           ArrayList<Integer> ans)
	    {
	        if (root == null) {
	            return;
	        }
	 
	        if (isLeaf(root)) {
	            ans.add(root.data); 
	            return;
	        }
	 
	        addLeaves(root.left, ans);
	        addLeaves(root.right, ans);
	    }
	 
	    ArrayList<Integer> boundary(Node root)
	    {
	        ArrayList<Integer> ans = new ArrayList<>();
	        if (root == null) {
	            return ans;
	        }
	 
	        if (!isLeaf(root)) {
	            ans.add(root.data);
	        }
	 
	        addLeftBound(root, ans);
	        addLeaves(root, ans);
	        addRightBound(root, ans);
	        return ans;
	    }
}
}
