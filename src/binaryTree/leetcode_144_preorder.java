package binaryTree;

import java.util.ArrayList;
import resource.TreeNode;
import java.util.List;
import java.util.Stack;

/**
 * 144
 */
public class leetcode_94_inorder {

    // Definition for a binary tree node.
    static public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();

            list.add(root.val);

            if (root.right != null) {
                stack.push(root.right);
            }

            if (root.left != null) {
                stack.push(root.left);
            }

        }
        return list;
    }

    public static void main(String[] args) {

    }

}
