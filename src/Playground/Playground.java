package Playground;

import Resource.TreeNode;
import DataStructure.*;
import DataStructure.BinaryTree.BinarySearchTree;

public class Playground {
    public static void main(String[] args) {
        
        BinarySearchTree bst = new BinarySearchTree<>();


        for (int i = 0; i < 20; i++) {
            bst.add(i);
        }

        System.out.println(bst);

    }
}
