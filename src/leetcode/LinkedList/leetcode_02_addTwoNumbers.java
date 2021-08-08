package Leetcode.LinkedList;

import List.LinkedList;
import Resource.ListNode;




public class leetcode_02_addTwoNumbers {
    

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        System.out.println("entry");

        return null;
    }



    public static void main(String[] args) {

        System.out.println("start");

        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};


        LinkedList<ListNode<Integer>> linkedList1 = new LinkedList<ListNode<Integer>>();
        LinkedList<ListNode<Integer>> linkedList2 = new LinkedList<ListNode<Integer>>();


        for (int i = 0; i < l1.length; i++) {
            ListNode<Integer> node = new ListNode<Integer>(l1[i]);
            linkedList1.add(node);
        }

        for (int i = 0; i < l2.length; i++) {
            ListNode<Integer> node = new ListNode<Integer>(l1[i]);
            linkedList2.add(node);
        }

        addTwoNumbers(linkedList1.first, linkedList2.first);

        System.out.println("end");


    }




}
