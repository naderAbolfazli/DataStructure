package ir.maktab;

/**
 * Created by Nader on 12/28/2017.
 */
public class BST<E extends Comparable> implements Collection<E> {
    Node<E> root;
    private boolean exist;

    @Override
    public int size() {
        return childNum(root);
    }

    private int childNum(Node<E> node) {
        if (node==null)
            return 0;
        return 1 + childNum(node.getLeftChild()) + childNum(node.getRightChild());
    }

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean contains(E var) {
        exist = false;
        contains(root, new Node<>(var));
        return exist;
    }

    private void contains(Node<E> current, Node<E> node) {
        if (current == null || exist==true)
            return;
        if (current.compareTo(node)==0)
            exist = true;
        contains(current.getLeftChild(), node);
        contains(current.getRightChild(), node);
    }

    public void add(E var) {
        if (root == null)
            root = new Node<>(var);
        else
            add(root, new Node<>(var));
    }

    public void add(Node<E> current, Node<E> node) {
        if (current.compareTo(node) > 0) {
            if (current.getLeftChild() != null)
                add(current.getLeftChild(), node);
            else
                current.setLeftChild(node);
        } else {
            if (current.getRightChild() != null)
                add(current.getRightChild(), node);
            else
                current.setRightChild(node);
        }
    }

    public void inorderTraverse(Node<E> node) {
        if (node == null)
            return;
        inorderTraverse(node.getLeftChild());
        System.out.println(node.getData());
        inorderTraverse(node.getRightChild());
    }

    public void preorderTraverse(Node<E> node) {
        if (node == null)
            return;
        System.out.println(node.getData());
        preorderTraverse(node.getLeftChild());
        preorderTraverse(node.getRightChild());
    }

    public E getMinElement() {
        Node<E> currentNode = root;
        while (currentNode.getLeftChild() != null)
            currentNode = currentNode.getLeftChild();
        return currentNode.getData();
    }

    public E getMaxElement() {
        Node<E> currentNode = root;
        while (currentNode.getRightChild() != null)
            currentNode = currentNode.getRightChild();
        return currentNode.getData();
    }
}

class Node<E extends Comparable> implements Comparable<Node<E>> {
    private E data;
    private Node<E> leftChild;
    private Node<E> rightChild;

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public Node<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<E> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<E> rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public int compareTo(Node<E> o) {
        return data.compareTo(o.data);
    }

    @Override
    public boolean equals(Object o){
        if (this==o)
            return true;
        if (o.getClass().getName().equals("ir.maktab.Node")){
            return ((Node<E>)o).getData().equals(data);
        }
        return false;
    }
}
