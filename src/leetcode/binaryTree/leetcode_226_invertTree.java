package Leetcode.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

import Resource.TreeNode;
import jdk.nashorn.api.tree.Tree;

public class leetcode_226_invertTree {
    
    static public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;




    }

    static public TreeNode preorderInvertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }


    static public TreeNode inorderInvertTree(TreeNode root) {
        if (root == null) return root;


        invertTree(root.left);

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);

        return root;
    }

    static public TreeNode postorderInvertTree(TreeNode root) {
        if (root == null) return root;


        invertTree(root.left);
        invertTree(root.right);

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        return root;
    }

    static public TreeNode levelInvertTree(TreeNode root) {
        if (root == null) return root;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return root;
    }


    public static void main(String[] args) {
        
    }

}
