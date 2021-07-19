package Leetcode.BinaryTree;

import resource.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode_94_inorder {
    
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        if (root == null) {
            return list;
        }
        

        inorder(root, list);
        
        return list;
    }

    public void inorder(TreeNode root, ArrayList<Integer> list){

        if (root == null) return;
        
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }



    public static void main(String[] args) {
        
        

    }

}
