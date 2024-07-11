package study.datastructure;

public class BinarySearchTree {
     Node root;

    public BinarySearchTree(int value) {

        root = new Node(value);
    }

    public BinarySearchTree() {
        root = null;
    }

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
