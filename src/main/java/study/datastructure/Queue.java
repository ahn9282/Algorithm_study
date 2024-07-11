package study.datastructure;

public class Queue {
    public static void main(String[] args) {
        Queue myQ = new Queue(7);

        myQ.enqueue(5);

        myQ.printQ();
        myQ.getFirst();

        System.out.println(myQ.dequeue().value);
        System.out.println(myQ.dequeue().value);
        System.out.println(myQ.dequeue().value);
    }
    Node first;
    Node last;
    int length;
    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public Node dequeue(){
        if(length == 0) return null;
        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
        }else {
            first = first.next;
            temp.next = null;
        }
        length --;
        return temp;
    }


    public void getFirst() {
        System.out.println("first = " + first.value);
    }

    public void getLast() {
        System.out.println("last = " + last.value);
    }
    public void getLength(){
        System.out.println("length = " + length);
    }

    public void printQ() {

        Node temp = first;
        for (int i = 0; i < length; i++) {
            System.out.println("value : " + first.value);
            temp = first.next;
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
