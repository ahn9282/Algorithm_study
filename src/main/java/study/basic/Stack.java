package study.basic;

public class Stack {
    private Node top;
    private int height;
    public Stack(int value) {
        this.top = new Node(value);
        height = 1;
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack(1);
        stack1.getTop();
        stack1.getHeight();
        stack1.printStack();

    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            top.next = newNode;
            top = newNode;
        }
        height++;
    }
    public Node pop(){
        if(height == 0)return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public void getTop() {
        System.out.println("top = " + top.value);
    }

    public void getHeight() {
        System.out.println("height = " + height);
    }

    public void printStack() {
        Node temp = top;
        for (int i = 0; i < height; i++) {
            System.out.println("stack" + top.value);

            temp = temp.next;
        }
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
