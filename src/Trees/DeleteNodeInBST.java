package Tress;
public class Node {
         int val;
        Node left;
        Node right;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node left, Node right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
public class DeleteNodeInBST {
    public  Node deleteNode(Node root, int key) {
        if(root == null){
            return null;
        }
        if(root.val == key){
            return helper(root);
        }
        Node temp = root;
        while(root != null){
            if(root.val > key){
                if(root.left != null && root.left.val == key){
                    root.left= helper(root.left);
                    break;
                }else{
                    root = root.left;
                }
            }else{
                if(root.right != null && root.right.val == key){
                    root.right = helper(root.right);
                    break;
                }else{
                    root = root.right;
                }
            }
        }
        return temp;
    }
    public Node helper(Node root){
        if(root.left == null){
            return root.right;
        }else if(root.right == null){
            return root.left;
        }else{
            Node rightChild = root.right;
            Node lastRight = findLastRight(root.left);
            lastRight.right= rightChild;
            return root.left;
        }
    }
    public Node findLastRight(Node root){
        if(root.right == null){
            return root;
        }
        return findLastRight(root.right);
    }
}
