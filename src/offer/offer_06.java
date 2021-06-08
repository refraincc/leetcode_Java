package offer;

import java.util.ArrayList;
import java.util.function.IntPredicate;

import resource.*;

/*
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * */

public class offer_06 {
	
	static public int[] reversePrint(ListNode head) {

		ListNode curr = head;  // 6,	5,	4,	3,	2,	1,	null
		ListNode next = null;  // 1,	2,	3,	4,	5,	6,  null	

//		ListNode head = null;
		int i = 0;
		while (curr != null ) {
			head = curr;
			ListNode temp = curr.next;
			curr.next = next;
			next = curr;
			curr = temp;

//			String string = next == null ? "null" : (" " + next.val);
//			System.out.println("curr = " + curr.val + "  next = " + string);
			i++;
		}


		ListNode node = head;
		int[] array = new int[i];
		int j = 0;
		while (node != null) {
			array[j] = node.val;
			j++;
			node = node.next;
		}
		
		return array;
		
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		ListNode node1 = new ListNode(1, null);
		ListNode node2 = new ListNode(2, node1);
		ListNode node3 = new ListNode(3, node2);
		ListNode node4 = new ListNode(4, node3);
		ListNode node5 = new ListNode(5, node4);
		ListNode node6 = new ListNode(6, node5);
//		
//		reversePrint(node6);
		
		int[] array = reversePrint(node6);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		

		System.out.println("end");
	}

}
