package dataStructure;

import java.util.function.Function;
import resource.ListNode;

/**
 * binaryTree
 * 
 * 10 6 14 4 8 12 16
 * 
 * 
 */
public class binaryTree {

    // 前序遍历 10,6,4,8,14,12,16
    static void preoderPrint(ListNode head) {

        if (head == null)
            return;

        System.out.println(head.val);

        preoderPrint(head.left);
        preoderPrint(head.right);

    }

    // 中序遍历 4,6,8,10,12,14,16
    static void inorderPrint(ListNode head) {

        if (head == null)
            return;
        inorderPrint(head.left);
        System.out.println(head.val);

    }

    // 后序遍历 4，8，6，12，16，14，10
    static void postorderPrint(ListNode head) {

    }

    public static void main(String[] args) {

        System.out.println("Start");

        ListNode node6 = new ListNode(12, null, null);
        ListNode node7 = new ListNode(16, null, null);
        ListNode node4 = new ListNode(4, null, null);
        ListNode node5 = new ListNode(8, null, null);
        ListNode node2 = new ListNode(6, node4, node5);
        ListNode node3 = new ListNode(14, node6, node7);
        ListNode node1 = new ListNode(10, node2, node3);

        // preoderPrint(node1);
        inorderPrint(node1);

        System.out.println("End");

    }

}
