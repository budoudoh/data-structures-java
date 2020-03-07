/**
 * Binary Search Tree Implementation
 *
 * @author Basil Udoudoh
 *
 */
public class BST<T extends Comparable<? super T>> {
    private BSTNode<T> root;

    public BST() {
        root = null;
    }

    /**
     * Returns the root node of the Binary Search Tree
     * @return root node of the Binary Search tree, or null if empty
     */
    public BSTNode<T> getRoot(){
        return root;
    }

    /**
     * Insert Data for Next Node
     *
     */
    public void insert(T data)
    {
        root = insert(root, data);
    }


    public BSTNode<T> insert(BSTNode<T> node, T data)
    {
        if (node == null)
            node = new BSTNode<>(data);
        else {
            if (data.compareTo(node.data) >= 0)
                node.left  = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    /**
     * Checks to see if the Binary Search tree is empty
     *
     * @return true if Binary Search tree is empty
     **/
    public boolean isEmpty() {
        return null == root;
    }

    /**
     * Clears the Binary Search tree
     *
     * @return true if Binary Search tree is empty
     **/
    public void clear() {
        root = null;
    }



}