package Resource;

public class TreeNode<E> {
    public int val;
    public E element;
    public TreeNode<E> left;
    public TreeNode<E> right;
    public TreeNode<E> parent;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(E element) { this.element = element; }
    public TreeNode(E element, TreeNode<E> parent) {
        this.element = element;
        this.parent = parent;
    }
    public TreeNode(int val, TreeNode<E> parent) {
        this.val = val;
        this.parent = parent;
    }
    public TreeNode(int val, TreeNode<E> left, TreeNode<E> right) {
        this.val = val;
        this.left = left;
        this.right = right;
   }
   public TreeNode(E element, TreeNode<E> left, TreeNode<E> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

   

}