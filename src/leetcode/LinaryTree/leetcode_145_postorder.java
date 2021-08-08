package Leetcode.LinaryTree;

import java.util.ArrayList;
import java.util.List;

import Resource.TreeNode;



public class leetcode_145_postorder {
    
    public List<Integer> postorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        if (root == null) {
            return list;
        }

        postorder(root, list);


        return list;
    }


    public void postorder(TreeNode root, ArrayList<Integer> list) {
        
        if (root == null) {
            return;
        }

        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);

    }


}
