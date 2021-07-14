package dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.function.Function;
import resource.TreeNode;

/**
 * binaryTree
 * 
 *          10 
 *     6         14 
 *  4    8   12     16
 * 
 * 
 */
public class binaryTree {

    // 前序遍历 10,6,4,8,14,12,16 根节点最先打印
    static void preoderPrint(TreeNode root) {

        if (root == null)
            return;

        System.out.println(root.val);

        preoderPrint(root.left);
        preoderPrint(root.right);

    }

    static void preoderPrint_loop(TreeNode root) {

        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();

            System.out.println(root.val);

            if (root.right != null) {
                stack.push(root.right);
            }

            if (root.left != null) {
                stack.push(root.left);
            }

        }
    }

    // 中序遍历 4,6,8,10,12,14,16 根节点中间打印
    static void inorderPrint(TreeNode root) {

        if (root == null)
            return;
        inorderPrint(root.left);
        System.out.println(root.val);
        inorderPrint(root.right);

    }

    // 中序遍历 4,6,8,10,12,14,16 根节点中间打印
    static void inorderPrint_loop(TreeNode root) {

        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                System.out.println(root.val);
                root = root.right;
            }

        }

    }

    // 后序遍历 4，8，6，12，16，14，10 根节点最后打印
    static void postorderPrint(TreeNode root) {
        if (root == null)
            return;
        postorderPrint(root.left);
        postorderPrint(root.right);
        System.out.println(root.val);

    }

    static void postorderPrint_loop(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> stack_print = new Stack<TreeNode>();

        stack.push(root);

        while (!stack.isEmpty()) {
            
            root = stack.pop();
            stack_print.push(root);

            if (root.left != null) {
                stack.push(root.left);
            }

            if (root.right != null) {
                stack.push(root.right);
            }

        }

        while (!stack_print.isEmpty()) {
            System.out.println(stack_print.pop().val);
        }

    }

    static public void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            
            TreeNode node = queue.poll();

            System.out.println(node.val);

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }

        }
        

    }


    public static void main(String[] args) {

        System.out.println("Start");

        TreeNode node6 = new TreeNode(12, null, null);
        TreeNode node7 = new TreeNode(16, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node5 = new TreeNode(8, null, null);
        TreeNode node2 = new TreeNode(6, node4, node5);
        TreeNode node3 = new TreeNode(14, node6, node7);
        TreeNode node1 = new TreeNode(10, node2, node3);

        // preoderPrint(node1);
        // preoderPrint_loop(node1);
        // inorderPrint(node1);
        // inorderPrint_loop(node1);
        // postorderPrint(node1);
        levelOrder(node1);

        System.out.println("End");

    }

}
