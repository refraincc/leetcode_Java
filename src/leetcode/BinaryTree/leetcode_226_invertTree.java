package Leetcode.BinaryTree;

import java.util.*;

import Resource.TreeNode;

public class leetcode_226_invertTree<E> {

    public TreeNode<E> invertTree(TreeNode<E> root) {
        if (root == null)
            return root;

        return null;

    }

    public TreeNode<E> preorderInvertTree(TreeNode<E> root) {
        if (root == null)
            return root;

        TreeNode<E> tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public TreeNode<E> inorderInvertTree(TreeNode<E> root) {
        if (root == null)
            return root;

        invertTree(root.left);

        TreeNode<E> tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);

        return root;
    }

    public TreeNode<E> postorderInvertTree(TreeNode<E> root) {
        if (root == null)
            return root;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode<E> tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        return root;
    }

    public TreeNode<E> levelInvertTree(TreeNode<E> root) {
        if (root == null)
            return root;

        Queue<TreeNode<E>> queue = new LinkedList<TreeNode<E>>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode<E> node = queue.poll();
            TreeNode<E> temp = node.left;
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
