package Tress;

public class BinaryTreeColoringGame {
	public int xleft;
    public int xright;
    
    public int size(TreeNode node, int x) {
        if(node == null) {
            return 0;
        }
        
        int ls = size(node.left, x);
        int rs = size(node.right, x);
        
        if(node.val == x){
            xleft = ls;
            xright = rs;
        }
        
        return ls + rs + 1;
    }
    
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        size(root, x);
        int otherSize = n - xleft - xright - 1;
        int max = Math.max(otherSize, Math.max(xleft, xright));
        
        int rest = n - max;
        if(max > rest) {
            return true;
        }
        
        return false;
    }
}

