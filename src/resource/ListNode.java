package Resource;

import java.util.List;

public class ListNode<E> {
	public E val;
	public ListNode<E> next = null;
	public ListNode<E> left = null;
	public ListNode<E> right = null;
	public ListNode(E x) {
		val = x;
	}
	public ListNode(E val, ListNode<E> next) {
		this.val = val;
		this.next = next;
	}

	public ListNode(E val, ListNode<E> left, ListNode<E> right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}


	public void add(ListNode<E> node) {
		this.next = node;
	}

	@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			
			// if (prev != null) {
			// 	sb.append(prev.val);
			// } else {
			// 	sb.append("null");
			// }
			
			// sb.append("_").append(val).append("_");

			// if (next != null) {
			// 	sb.append(next.val);
			// } else {
			// 	sb.append("null");
			// }
			
			return sb.toString();
		}
	
	
}
