package Leetcode.offer;

import java.lang.reflect.Array;

import Resource.TreeNode;
/*
    https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
    https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/


    输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

    例如，给出

    前序遍历 preorder = [3,9,20,15,7]
    中序遍历 inorder = [9,3,15,20,7]

    返回如下的二叉树：

       3
      / \
     9  20
       /  \
      15   7

      限制：

    0 <= 节点个数 <= 5000
*/
class offer_07 {

    static public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0){
            return null;
        }

        return buildTreeCore(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }


    static public TreeNode buildTreeCore(int[] preorder,int p_left, int p_right, int[] inorder,  int i_left, int i_right){

        if (p_left >= p_right || i_left >= i_right) {
            return null;
        }

        
        TreeNode root = new TreeNode(preorder[p_left]);

        int i_rootIdx = 0;
        for (int i = 0; i < inorder.length; i++) {

            if (inorder[i] == root.val) {
                i_rootIdx = i;
                break;
            }
 
        }

        int leftNum = i_rootIdx - i_left;

        root.left = buildTreeCore(preorder, p_left + 1, p_left + 1 + leftNum, inorder, i_left, i_rootIdx);
        root.right = buildTreeCore(preorder, p_left + 1 + leftNum, p_right, inorder, i_rootIdx + 1, i_right);

        return root;
        
    }



    public static void main(String[] args) {


        System.out.println("Start");

        int[] preorder = new int[] { 3, 9, 20, 15, 7 };
        int[] inorder = new int[] { 9, 3, 15, 20, 7 };

        TreeNode root = buildTree(preorder, inorder);

        System.out.println("End");

    }

}