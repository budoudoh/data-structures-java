public class BSTNode<T extends Comparable<? super T>> {

    public BSTNode<T> left;
    public BSTNode<T> right;
    public T data;

    public BSTNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
