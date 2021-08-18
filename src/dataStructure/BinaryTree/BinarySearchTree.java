package DataStructure.BinaryTree;

import Resource.TreeNode;
import java.util.Comparator;

public class BinarySearchTree<E> extends BinaryTree<E>{
    
    private Comparator<E> comparator;

    public BinarySearchTree() {

    }

    public void add(E element) {
        elementNotNullCheck(element);

        if (root == null) {
            root = new TreeNode(element);
            size++;
            return;
        }

        TreeNode<E> parent = root;
        TreeNode<E> node = root;
        int cmp = 0;

        do {

            cmp = compare(element, node.element);
            parent = node;
            if (cmp > 0) {
                node = node.right;
            } else if (cmp < 0) {
                node = node.left;
            }else {
                node.element = element;
                return;
            }

            
        } while (node != null);

        TreeNode<E> newNode = new TreeNode<>(element, parent);
        if (cmp > 0){
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }
        size++;
    }
    /**
	 * @return 返回值等于0，代表e1和e2相等；返回值大于0，代表e1大于e2；返回值小于于0，代表e1小于e2
	 */
    private int compare(E e1, E e2) {
        if (comparator != null){
            return comparator.compare(e1, e2);
        }
        return ((Comparable<E>)e1).compareTo(e2);
    }


    private void elementNotNullCheck(E element) {
		if (element == null) {
			throw new IllegalArgumentException("element must not be null");
		}
	}
}
