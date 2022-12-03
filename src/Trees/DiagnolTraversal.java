package Tress;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
public class DiagnolTraversal {

	public ArrayList<Integer> diagonal(TreeNode root)
    {
         //add your code here.
         Queue<TreeNode> q = new LinkedList  <>();
         ArrayList<Integer> ans = new ArrayList<>();
         q.add(root);
         while(!q.isEmpty()){
             TreeNode temp = q.remove();
             while(temp!=null){
                 if(temp.left!=null){
                     q.add(temp.left);
                 }
               ans.add(temp.data);
               temp = temp.right;
             }
         }
        return ans;
    }
}
