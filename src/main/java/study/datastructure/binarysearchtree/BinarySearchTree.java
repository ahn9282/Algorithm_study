package study.datastructure.binarysearchtree;

import org.w3c.dom.Node;

public class BinarySearchTree {
     Node root;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("root = " + bst.root);
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(27);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);

        System.out.println(bst.root.left.right.value);

        System.out.println(bst.contains(27));
        System.out.println(bst.contains(17));

        System.out.println(bst.rContains(27));
        System.out.println(bst.rContains(17));

    }

    private Node deleteNode(Node currentNode, int value) {
        if(currentNode == null) return null;
        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        }else  if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        }else{
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            }else if (currentNode.right == null) {
                currentNode = currentNode.left;
            }else{
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public void deleteNode(int value) {
        deleteNode(root, value);
    }

    private int minValue(Node currentNode) {
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        if(currentNode.right != null){
            currentNode = currentNode.right;
        }
        return currentNode.value;
    }
    public int minimum(){
        return minValue(root);
    }


    private boolean rContains(Node currentNode, int value) {
        if(currentNode == null) return false;
        if(currentNode.value == value) return true;
        if(value < currentNode.value){
            return rContains(currentNode.left, value);
        }else{
            return rContains(currentNode.right, value);
        }

    }
    private boolean rContains( int value) {
        return rContains(root, value);
    }

    public BinarySearchTree(int value) {

        root = new Node(value);
    }

    private Node rInsert(Node currentNode, int value) {
        if(currentNode == null) return new Node(value);
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode, value);
        }else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode, value);
        }
        return currentNode;
    }

    private void rInsert(int value) {
        if(root == null) root = new Node(value);
        rInsert(root, value);

    }

    public BinarySearchTree() {
        root = null;
    }
    public boolean contains(int value){
        if(root == null) return false;
        Node temp = root;
        while(temp != null){
            if (temp.value > value) {
                temp = temp.left;
            }else if(temp.value < value){
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
