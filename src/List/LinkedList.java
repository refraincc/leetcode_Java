package List;

import javax.lang.model.element.Element;

import List.AbstractList;
import Resource.ListNode;

public class LinkedList<E> extends AbstractList<E> {

    public ListNode<E> first;
    // private ListNode<E> last;

    public LinkedList() {
        first = null;
    }


    @Override
    public void clear() {
        size = 0;
        first = null;
    }
    

    @Override
    public E get(int index) {
        /*
		 * 最好：O(1)
		 * 最坏：O(n)
		 * 平均：O(n)
		 */
        return node(index).val;
    }


    @Override
    public E set(int index, E element) {
        
        ListNode<E> node = node(index);
        E old = node.val;
        node.val = element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);

        if (index == 0) {
            first = new ListNode<>(element, first);
        } else {
            ListNode<E> prev = node(index - 1);
            prev.next = new ListNode<>(element, prev.next);
        }
        size++;
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub

        rangeCheck(index);

        ListNode<E> node = first;

        if (index == 0) {
            first = first.next;
        } else {
            ListNode<E> prev = node(index - 1);
            node = prev.next;
            prev.next = node.next;
        }
        size--;
        return node.val;
    }

    @Override
    public int indexOf(E element) {
        // TODO Auto-generated method stub

        if (element == null) {
            ListNode<E> node = first;
            for (int i = 0; i < size; i++) {
                if (node.val == null) return i;

                node = node.next;
            }
        } else {
            ListNode<E> node = first;
            for (int i = 0; i < size; i++) {
                if (element.equals(node.val)) return i;

                node = node.next;
            }
        }

        return ELEMENT_NOT_FOUND;
    }


    private ListNode<E> node(int index) {
        rangeCheck(index);

        ListNode<E> node = first;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    @Override
    public String toString() {
        
        StringBuilder string = new StringBuilder();
        string.append("size = ").append(size).append(", [");
        ListNode<E> node = first;

        for (int i = 0; i < size; i++) {
            if (i != 0) {
                string.append(", ");
            }
            
            string.append(node);

            node = node.next;

        }

        string.append("]");

        return string.toString();
    }


}
