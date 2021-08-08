package Resource;

import java.util.List;

public class ListNode<E> {
	public E val;
	public ListNode next = null;
	public ListNode left = null;
	public ListNode right = null;
	public ListNode(E x) {
		val = x;
	}
	public ListNode(E val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public ListNode(E val, ListNode left, ListNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}


	public void add(ListNode node) {
		this.next = node;
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

	@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			
			if (prev != null) {
				sb.append(prev.val);
			} else {
				sb.append("null");
			}
			
			sb.append("_").append(val).append("_");

			if (next != null) {
				sb.append(next.val);
			} else {
				sb.append("null");
			}
			
			return sb.toString();
		}
	
	
}
