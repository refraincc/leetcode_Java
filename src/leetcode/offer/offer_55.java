package Leetcode.offer;

import java.util.LinkedList;
import java.util.Queue;

import Resource.TreeNode;

/*
输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。

例如：

给定二叉树 [3,9,20,null,null,15,7]，

    3
   / \
  9  20
    /  \
   15   7
返回它的最大深度 3 。

 

提示：

节点总数 <= 10000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
public class offer_55<E> {

    public int height(TreeNode<E> node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    /// 递归
    public int maxDepth(TreeNode<E> root) {

        if (root == null)
            return 0;

        return height(root);

    }

    /// 循环
    public int maxDepth1(TreeNode<E> root) {

        if (root == null)
            return 0;

        Queue<TreeNode<E>> queue = new LinkedList<TreeNode<E>>();

        queue.offer(root);

        int levleSize = 1;
        int height = 1;

        while (!queue.isEmpty()) {

            TreeNode<E> node = queue.poll();
            levleSize--;

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }

            if (levleSize == 0) {
                levleSize = queue.size();
                height++;
            }

        }

        return height;

    }

    public static void main(String[] args) {
        System.out.println("start");

        System.out.println("end");
    }

}
