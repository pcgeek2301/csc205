/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Program: <Program #3>
Author: <Katy Hochstetler> <36473082>
Description: <In this program 3, I have created 1 class. In the BSTree I have several methods including 
a default constructor that sets the the root to null. I have methods for adding a node, a method to 
check if the binary search tree contains a node, size of tree, prints the binary search tree in chronological
order, a to string method, and an inner node class. >
*/
public class BSTree<T extends Comparable<T>> implements Tree<T> {
    protected Node root;
    private int size = 0;
    String nodesInOrderString = "";

    public BSTree() {
        root = null;
    }

    public void add(T item) {
        if (!contains(item)) {
            if (root == null) { // if the list is empty
                root = new Node(item);
            } else {
                root.add(item); // if we have at least one node in the list
            }
            size++;
        }
    }

    public boolean contains(T item) {
        // traverse the list, seeing if any node has data that .equals item
        Node currNode = root;
        while (currNode != null) {
            if (currNode.data.equals(item)) { // found it!
                return true;
            } else if (item.compareTo(currNode.data) < 0) {
                currNode = currNode.left;
            } else if (item.compareTo(currNode.data) > 0) {
                currNode = currNode.right;
            }
        }

        return false; // if we finished the loop and got to here, it was not found

    }

    public int size() {
        return size; // this number is kept track through the add function
    }

    public void inOrderPrint() {
        printNode(root);
    }
    
    private String printNode(Node currNode) {
        // uses the LNR method 
        if (currNode.left != null) {
            printNode(currNode.left);
        } 

        System.out.print(currNode.data + " ");
        nodesInOrderString += currNode.data + " ";

        if (currNode.right != null) {
            printNode(currNode.right);
        }

        return nodesInOrderString;

    }

    public String toString() {
        if (root != null) {
            return printNode(root);
        }
        
        return "";
    }

    class Node {
        // ------- data
        protected T data = null;
        protected Node left = null;
        protected Node right = null;

        // ------- constructors
        public Node(T item) {
            this.data = item;
        }

        public void add(T item) {
            if (item.compareTo(data) < 0) {
                if (left == null) {
                    left = new Node(item);
                } else {
                    left.add(item);
                }
            } else if (item.compareTo(data) > 0) {
                if (right == null) {
                    right = new Node(item);
                } else {
                    right.add(item);
                }
            }
        }
    }

}
