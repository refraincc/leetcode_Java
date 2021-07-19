package Resource;

import java.util.List;

public class ListNode {
	public int val = 0;
	public ListNode next = null;
	public ListNode left = null;
	public ListNode right = null;
	public ListNode(int x) {
		val = x;
	}
	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public ListNode(int val, ListNode left, ListNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub

		StringBuffer stringBuffer = new StringBuffer();

		if (this != null) {
			stringBuffer.append(this.val);
		}

		return super.toString();
	}


	/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		StringBuffer stringBuffer = new StringBuffer();
		
		ListNode node = this;
		
		while (node.next != null) {
			stringBuffer.append("val = " + node.val + "   next = " + node.next.val + "\n");
			node = node.next;
		}
		
		stringBuffer.append("val = " + node.val + "   next = null");
		
		return stringBuffer.toString();
	}*/
	
}
